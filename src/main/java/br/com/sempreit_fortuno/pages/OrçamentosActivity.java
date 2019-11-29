package br.com.sempreit_fortuno.pages;

import static br.com.smiles.base.DefaultBaseController.getPage_;

import br.com.sempreit_fortuno.utils.UtilsMobile;
import br.com.smiles.base.PageBase;
import br.com.smiles.base.VirtualElement;
import br.com.smiles.helpers.LoggerHelper;
import static br.com.smiles.helpers.QueryHelper.getElementById;
import static br.com.smiles.helpers.QueryHelper.getElementByXPath;
import static org.junit.Assert.assertTrue;


public class OrçamentosActivity extends PageBase {
	LoggerHelper logger = new LoggerHelper(HomeActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);
	
	@SuppressWarnings("rawtypes")
	VirtualElement btnOrcamentoGeral = getElementByXPath("//android.widget.TextView[@text='Orçamento geral']"),
	adicionarValorMeta = getElementById("com.impprove.app:id/edValue"),
	validarMenuGraficos = getElementById("com.impprove.app:id/pcExpensesCategory");

	public void adicionarOrcamentoNoMenu()throws Exception {
		logger.debug("início de adicionar orçamento no menu");
		btnOrcamentoGeral.click();
		
		logger.debug("fim de adicionar orçamento no menu");
	}
	public void adicionarValorMeta()throws Exception{
		logger.debug("início de  adicionar valor Meta");
		adicionarValorMeta.click();
		logger.debug("fim de adicionar valor Meta ");
	}
	public void validacaoMenuGraficos()throws Exception{
		assertTrue(elementIsVisible(validarMenuGraficos));
	}
}
 