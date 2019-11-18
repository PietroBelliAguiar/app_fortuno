package br.com.sempreit_fortuno.pages;

import br.com.smiles.base.PageBase;
import br.com.smiles.base.VirtualElement;
import br.com.smiles.helpers.LoggerHelper;

import static br.com.smiles.helpers.QueryHelper.getElementByXPath;

import static br.com.smiles.base.DefaultBaseController.getPage_;

import br.com.sempreit_fortuno.utils.UtilsMobile;

public class CartoesDeCreditoActivity extends PageBase {

	LoggerHelper logger = new LoggerHelper(CartoesDeCreditoActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);
	
	@SuppressWarnings("rawtype")
	VirtualElement mensagemTelaCartoesDeCredito = getElementByXPath("//android.widget.TextView[@text='Cartões de crédito']");
	
	
	public void validaTelaDeCartoesDeCredito() throws Exception {
		utils.elementIsVisible(mensagemTelaCartoesDeCredito);
		logger.info("Tela de " + mensagemTelaCartoesDeCredito.getText() + " apresentada");
	}
	
	
}
