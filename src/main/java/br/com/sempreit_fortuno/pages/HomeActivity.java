package br.com.sempreit_fortuno.pages;

import static br.com.smiles.base.DefaultBaseController.getPage_;
import static br.com.smiles.helpers.QueryHelper.getElementById;
import static br.com.smiles.helpers.QueryHelper.getElementByXPath;
import static br.com.smiles.helpers.QueryHelper.getElementByClassName;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import br.com.sempreit_fortuno.utils.UtilsMobile;
import br.com.smiles.base.PageBase;
import br.com.smiles.base.VirtualElement;
import br.com.smiles.helpers.LoggerHelper;

public class HomeActivity extends PageBase {

	LoggerHelper logger = new LoggerHelper(HomeActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);

	@SuppressWarnings("rawtypes")
	VirtualElement TextoNomeHome = getElementByXPath("//android.widget.TextView[@text='Fortuno']"),
			SaldoDeContas = getElementByXPath("//android.widget.TextView[@text='Saldo de contas']"),
			GastosDeHoje = getElementByXPath("//android.widget.TextView[@text='Gastos de hoje']"),
			Receitas = getElementById("com.impprove.app:id/layoutOverviewIncomes"),
			Despesas = getElementById("com.impprove.app:id/layoutOverviewExpenses"),
			DespesasNoCredito = getElementById("com.impprove.app:id/layoutOverviewCreditCardExpenses"),
			ReceitasPendentes = getElementById("com.impprove.app:id/tvLabelPendingIncomes"),
			DespesasPendentes = getElementById("com.impprove.app:id/tvLabelPendingExpenses"),
			FaturasDeCartao = getElementById("com.impprove.app:id/tvLabelPendingCreditCardBill"),
			SaldoSeguro = getElementById("com.impprove.app:id/tvLabelSafeBalance"),
			AvaliacaoPremium = getElementById("com.impprove.app:id/tvSubscribedPlan"),
			validarTelaPremium = getElementByXPath(
					"//android.widget.TextView[@text='ESCOLHA O PLANO IDEAL PARA VOCÊ']");;

	public void validarHome() throws Exception {
		Assert.assertTrue(elementIsVisible(TextoNomeHome));
		logger.info("Home validada com sucesso!");
		logger.takeScreenShot("Home", this);//
	}


	public void acessarSaldoDeContas() throws Exception {
		logger.info(" início de Saldo de contas ");
		SaldoDeContas.click();
		logger.info("fim de Saldo de contas");
	}

	public void acessarGastosDeHoje() throws Exception {
		logger.info("início de Gastos de hoje");
		GastosDeHoje.click();
		logger.info("fim de Gastos de hoje");
	}

	public void acessarReceitas() throws Exception {
		logger.debug("início de Receitas");
		Receitas.click();
		logger.debug("fim de Receitas");
	}

	public void acessarDespesas() throws Exception {
		logger.debug("início de Despesas");
		Despesas.click();
		logger.debug("fim de Despesas");
	}

	public void acessarDespesasNoCredito() throws Exception {
		logger.debug("início de Despesas no crédito");
		DespesasNoCredito.click();
		logger.debug("fim de Despesas no crédito");
	}

	public void acessarReceitasPendentes() throws Exception {
		logger.debug("início de Receitas pendentes");
		ReceitasPendentes.click();
		logger.debug("fim de Receitas pendentes");
	}

	public void acessarAvaliacaoPremium() throws Exception {
		logger.debug("início de Avalição Premium");
		AvaliacaoPremium.click();
		logger.debug("fim de Avaliação Premium");
	}

}