package br.com.sempreit_fortuno.pages;

import static br.com.smiles.base.DefaultBaseController.getPage_;
import br.com.sempreit_fortuno.utils.UtilsMobile;
import br.com.smiles.base.PageBase;
import br.com.smiles.base.VirtualElement;
import br.com.smiles.helpers.LoggerHelper;
import static br.com.smiles.helpers.QueryHelper.getElementById;
import static br.com.smiles.helpers.QueryHelper.getElementByXPath;

public class TransacoesActivity extends PageBase {
	LoggerHelper logger = new LoggerHelper(TransacoesActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);
	
	@SuppressWarnings("rawtypes")
	VirtualElement abrirMenuDeNovaTransferência = getElementById("com.impprove.app:id/fab_transfer"),
	abrirMenuDeNovaReceita = getElementById("com.impprove.app:id/fab_income"),
	abrirMenuDeNovaDespesa = getElementById("com.impprove.app:id/fab_expense"),
	abrirMenuDeNovaDespesaNoCredito = getElementById("com.impprove.app:id/fab_credit_card"),
	btnNumero8 = getElementById("com.impprove.app:id/bt8"),
	btnMultiplicacao = getElementById("com.impprove.app:id/btTimes"),
	btnNumero6 = getElementById("com.impprove.app:id/bt6"),
	btnvalidarCalculo = getElementById("com.impprove.app:id/btOk"),
	btnIgual = getElementById("com.impprove.app:id/btEquals");	
	
	public void abrirMenuDeNovaTranferência()throws Exception{
		logger.debug("início de abrir Menu de Nova Tranferência");
		abrirMenuDeNovaTransferência.click();
	}
	public void abrirMenuDeNovaReceita() throws Exception {
		logger.debug("início de abrir Menu De Nova Receita");
		abrirMenuDeNovaReceita.click();
		logger.debug("fim de abrir Menu de Nova Receita ");
	}
	public void abrirMenuDeNovaDespesa() throws Exception{
		logger.debug("início de abrir Menu De Nova Despesa");
		abrirMenuDeNovaDespesa.click();
		logger.debug("fim de abrir Menu De Nova Despesa");
	}
	public void abrirMenuDeNovaDespesaNoCredito() throws Exception{
		logger.debug("início de abrir Menu de Nova Despesa No Crédito ");
		abrirMenuDeNovaDespesaNoCredito.click();
		logger.debug("fim de abrir menu Nova Despesa No Crédito");
	}
}
