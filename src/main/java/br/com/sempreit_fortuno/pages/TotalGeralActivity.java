package br.com.sempreit_fortuno.pages;

import static br.com.smiles.base.DefaultBaseController.getPage_;

import br.com.sempreit_fortuno.utils.UtilsMobile;
import br.com.smiles.base.PageBase;
import br.com.smiles.base.VirtualElement;
import br.com.smiles.helpers.LoggerHelper;
import static br.com.smiles.helpers.QueryHelper.getElementById;
import static br.com.smiles.helpers.QueryHelper.getElementByXPath;

public class TotalGeralActivity extends PageBase{
	LoggerHelper logger = new LoggerHelper(HomeActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);
	

	@SuppressWarnings("rawtypes")
	VirtualElement trocarParaSegundaTela = getElementByXPath("//android.widget.TextView[@text='CATEGORIAS']"),
	validarPaginaTrocada = getElementByXPath("//android.widget.TextView[contains(@text,'Soma de todas as suas')]");
	
	public void trocarParaTelaSeguinte()throws Exception{
		logger.debug("início de trocar Para Tela Seguinte");
		trocarParaSegundaTela.click();
		logger.debug("fim de trocar Para Tela Seguinte");
	}
	public void validarTelaTrocada()throws Exception {
		logger.debug("início validar Tela Trocada");
		validarPaginaTrocada.click();
		logger.debug("fim de validar Tela Trocada");
	}
	
}
