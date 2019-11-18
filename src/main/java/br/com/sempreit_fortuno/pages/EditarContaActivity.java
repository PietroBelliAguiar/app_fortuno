package br.com.sempreit_fortuno.pages;

import static br.com.smiles.base.DefaultBaseController.getPage_;

import br.com.sempreit_fortuno.utils.UtilsMobile;
import br.com.smiles.base.PageBase;
import br.com.smiles.base.VirtualElement;
import br.com.smiles.helpers.LoggerHelper;
import static br.com.smiles.helpers.QueryHelper.getElementById;
import static br.com.smiles.helpers.QueryHelper.getElementByXPath;

public class EditarContaActivity extends PageBase {
	LoggerHelper logger = new LoggerHelper(EditarContaActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);
	
	@SuppressWarnings("rawtypes")
	VirtualElement EditarCarteira = getElementById("com.impprove.app:id/tvName"),
	inputSaldoConta = getElementByXPath("//android.widget.TextView[contains(@text,'R$')]");
	
	public void EditarCarteira()throws Exception{
		logger.debug("Início de Editar Carteira");
		EditarCarteira.click();
		logger.debug("Fim de Editar Carteira");	
	}
	public void saldoDaConta(String saldo)throws Exception{
		waitUntilisClickable(inputSaldoConta);
		inputSaldoConta.click();
		inputSaldoConta.sendKeys(saldo);
	}
	
}