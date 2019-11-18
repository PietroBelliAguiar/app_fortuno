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
	VirtualElement textoNomeHome = getElementByXPath("//android.widget.TextView[@text='Fortuno']"),
			saldoDeContas = getElementByXPath("//android.widget.TextView[@text='Saldo de contas']"),
			gastosDeHoje = getElementByXPath("//android.widget.TextView[@text='Gastos de hoje']"),
			receitas = getElementById("com.impprove.app:id/layoutOverviewIncomes"),
			despesas = getElementById("com.impprove.app:id/layoutOverviewExpenses"),
			despesasNoCredito = getElementById("com.impprove.app:id/layoutOverviewCreditCardExpenses"),
			receitasPendentes = getElementById("com.impprove.app:id/tvLabelPendingIncomes"),
			despesasPendentes = getElementById("com.impprove.app:id/tvLabelPendingExpenses"),
			faturasDeCartao = getElementById("com.impprove.app:id/tvLabelPendingCreditCardBill"),
			saldoSeguro = getElementById("com.impprove.app:id/tvLabelSafeBalance"),
			avaliacaoPremium = getElementById("com.impprove.app:id/tvSubscribedPlan"),
			validarTelaPremium = getElementByXPath("//android.widget.TextView[@text='ESCOLHA O PLANO IDEAL PARA VOCÊ']"),
			menuVisaoGeral = getElementByXPath("//android.widget.CheckedTextView[@text='Visão geral']"),
			menuContas = getElementByXPath("//android.widget.CheckedTextView[@text='Contas']"),
			menuCartoesDeCredito = getElementByXPath("//android.widget.CheckedTextView[@text='Cartões de crédito']"),
			menuTransacoes = getElementByXPath("//android.widget.CheckedTextView[@text='Transações']"),
			menuOrcamentos = getElementByXPath("//android.widget.CheckedTextView[@text='Orçamentos']"),
			mennuGraficos = getElementByXPath("//android.widget.CheckedTextView[@text='Gráficos']"),
			menuResumoDiario = getElementByXPath("//android.widget.CheckedTextView[@text='Resumo diário']"),
			menuBalancoMensal = getElementByXPath("//android.widget.CheckedTextView[@text='Balanço mensal']"),
			menuTotalGeral = getElementByXPath("//android.widget.CheckedTextView[@text='Total geral']"),
			menuPerfilAjustes = getElementByXPath("//android.widget.CheckedTextView[@text='Perfil & Ajustes']"),
			menuCategorias = getElementByXPath("//android.widget.CheckedTextView[@text='Categorias']"),
			menuCorDoTema = getElementByXPath("//android.widget.CheckedTextView[@text='Cor do tema']");
			

	public void validarHome() throws Exception {
		Assert.assertTrue(elementIsVisible(textoNomeHome));
		logger.info("Home validada com sucesso!");
		logger.takeScreenShot("Home", this);//
	}


	public void acessarSaldoDeContas() throws Exception {
		logger.info(" início de Saldo de contas ");
		saldoDeContas.click();
		logger.info("fim de Saldo de contas");
	}

	public void acessarGastosDeHoje() throws Exception {
		logger.info("início de Gastos de hoje");
		gastosDeHoje.click();
		logger.info("fim de Gastos de hoje");
	}

	public void acessarReceitas() throws Exception {
		logger.debug("início de Receitas");
		receitas.click();
		logger.debug("fim de Receitas");
	}

	public void acessarDespesas() throws Exception {
		logger.debug("início de Despesas");
		despesas.click();
		logger.debug("fim de Despesas");
	}

	public void acessarDespesasNoCredito() throws Exception {
		logger.debug("início de Despesas no crédito");
		despesasNoCredito.click();
		logger.debug("fim de Despesas no crédito");
	}

	public void acessarReceitasPendentes() throws Exception {
		logger.debug("início de Receitas pendentes");
		receitasPendentes.click();
		logger.debug("fim de Receitas pendentes");
	}

	public void acessarAvaliacaoPremium() throws Exception {
		logger.debug("início de Avalição Premium");
		avaliacaoPremium.click();
		logger.debug("fim de Avaliação Premium");
	}

}