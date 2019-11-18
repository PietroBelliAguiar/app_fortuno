package br.com.sempreit_fortuno.pages;

import static br.com.smiles.base.DefaultBaseController.getPage_;
import static br.com.smiles.helpers.QueryHelper.getElementByClassName;
import static br.com.smiles.helpers.QueryHelper.getElementById;
import static br.com.smiles.helpers.QueryHelper.getElementByXPath;

import br.com.sempreit_fortuno.utils.UtilsMobile;
import br.com.smiles.base.PageBase;
import br.com.smiles.base.VirtualElement;
import br.com.smiles.helpers.LoggerHelper;

public class IntroducaoActivity extends PageBase {

	LoggerHelper logger = new LoggerHelper(HomeActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);

	@SuppressWarnings("rawtypes")
	VirtualElement mensagemBemVindo = getElementByXPath(
			"//android.widget.TextView[contains(@text, 'Bem-vindo(a) ao Fortuno.')]"),
			btnComecarAgora = getElementByClassName("android.widget.Button"),
			btnContinuarCom = getElementById("com.impprove.app:id/llButtons"),
			btnContinuarComGoogle = getElementByXPath(
					"//android.widget.Button[contains(@text,'CONTINUAR COM GOOGLE')]"),
			containerContaGoogle = getElementByXPath(
					"(//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/container'])[1]");

	public void telaDePrimeiroAcesso() throws Exception {
		try {
			if (mensagemBemVindo.getAttribute("displayed").equals("true")) {
				logger.info("Mensagem de Bem-Vindo apresentada");
				btnComecarAgora.click();
				btnContinuarComGoogle.click();
				containerContaGoogle.click();

			}
		} catch (Exception e) {
//			e.printStackTrace();
			logger.info("Mensagem de Bem-Vindo não apresentada. Não é o primeiro acesso!");
		}

	}

}
