package br.com.sempreit_fortuno.steps;

import static br.com.smiles.helpers.ProtonHelper.protonEndScript;
import static br.com.smiles.helpers.ProtonHelper.protonStartScript;
import static br.com.smiles.helpers.ProtonHelper.protonUpdateRunStatus;
import static br.com.smiles.helpers.ProtonHelper.unlockProtonSmilesUser;
import static br.com.sempreit_fortuno.validations.ValidationsHelper.getCv_;
import static br.com.smiles.helpers.DataTableHelper.getDt_;
import java.io.IOException;
import com.google.api.client.util.Strings;
import br.com.atomicsolutions.proton.RunStatus;
import br.com.sempreit_fortuno.validations.ValidationsHelper;
import br.com.smiles.base.DefaultBaseController;
import br.com.smiles.base.PageBase;
import br.com.smiles.controllers.AndroidController;
import br.com.smiles.exceptions.GenericException;
import br.com.smiles.helpers.DataTableHelper;
import br.com.smiles.helpers.LoggerHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import br.com.smiles.helpers.ProtonHelper;

public class HooksMobile extends PageBase {

	LoggerHelper logger = new LoggerHelper(HooksMobile.class);

	@Before("@android")
	public void setupeAndroid(Scenario scenario)
			throws GenericException, InstantiationException, IllegalAccessException, IOException, InterruptedException {
		Object[] arrayTags = scenario.getSourceTagNames().toArray();
		String reg = null;
		for (Object tag : arrayTags) {
			if (tag.toString().toLowerCase().contains("reg"))
				reg = tag.toString().replace("@", "");
		}
		if (!Strings.isNullOrEmpty(System.getProperty("Id_Dataset_Run"))) {
			protonUpdateRunStatus(RunStatus.RUNNING);
			protonStartScript();
			logger.info("AMBIENTE: "  + ProtonHelper.getProtonEnvironment().toLowerCase());
			logger.info("Execução via Proton");
		} else
			logger.info("Execução Local");
		DataTableHelper.initializeDt_(reg);
		logger.info("Reg a ser iniciado: "+reg);
		ValidationsHelper.initializeCv_();
		logger.info("Usuario: " + getDt_().getStringOf("in_Numero_Smiles"));
		DefaultBaseController.initializeController(AndroidController.class);
		getCv_().setRegCenario(reg);
	}

	@After("@android")
	public void tearDownWeb(Scenario scenario) throws Exception {
		unlockProtonSmilesUser(getCv_().getNumeroSmilesUsuarioLogado());

		ValidationsHelper.clearValidationsHelper();
		
		logger.takeScreenShot("Print tear down", this);

		if (scenario.isFailed()) {
			logger.error("Falha na execução do cenário.");
			protonUpdateRunStatus(RunStatus.FAILED);
		} else {
			logger.info("Cenário executado com sucesso.");
			protonUpdateRunStatus(RunStatus.PASSED);
		}

		if (!Strings.isNullOrEmpty(System.getProperty("Id_Dataset_Run")))
			protonEndScript();
		

		logger.info("Fim da execução do cenário");
		
		DefaultBaseController.tearDown_();
	}
}