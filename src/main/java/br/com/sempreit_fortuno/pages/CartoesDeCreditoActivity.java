package br.com.sempreit_fortuno.pages;

import br.com.smiles.base.PageBase;
import br.com.smiles.base.VirtualElement;
import br.com.smiles.helpers.LoggerHelper;
import br.com.smiles.helpers.TxtReaderHelper;

import static br.com.smiles.helpers.QueryHelper.getElementByXPath;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static br.com.smiles.helpers.QueryHelper.getElementById;

import static br.com.smiles.base.DefaultBaseController.getPage_;

import br.com.sempreit_fortuno.utils.UtilsMobile;

public class CartoesDeCreditoActivity extends PageBase {

	LoggerHelper logger = new LoggerHelper(CartoesDeCreditoActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);

	@SuppressWarnings("rawtype")
	String cartao = "//android.widget.RelativeLayout//android.widget.TextView[@text ='XXXX']",
			dia = "//android.widget.TextView[contains(@text,'XX')]",
			diaVencimento = "//android.widget.TextView[contains(@text,'XX')]";

	VirtualElement mensagemTelaCartoesDeCredito = getElementByXPath(
			"//android.widget.TextView[@text='Cartões de crédito']"),
			btnAdicionarCartao = getElementByXPath("(//android.widget.ImageButton)[3]"),
			limiteDoCartao = getElementById("com.impprove.app:id/edCreditLimit"),
			tecladoLimite = getElementById("com.impprove.app:id/bt9"),
			tecladoOK = getElementById("com.impprove.app:id/btOk"),
			nomeDoCartao = getElementById("com.impprove.app:id/edDescription"),
			selecaoCartao = getElementById("com.impprove.app:id/edBrand"),
			bandeiraCartao,
			dataFechamentoCartao = getElementById("com.impprove.app:id/edClosingDay"),
			diaFechamentoFatura,
			dataVencimentoCartao = getElementById("com.impprove.app:id/edDueDay"),
			diaVencimentoCartao,
			btnSalvar = getElementById("com.impprove.app:id/action_save"),
			nomeCartaoSalvo = getElementById("com.impprove.app:id/tvDescription"),
			limiteCartaoSalvo = getElementById("com.impprove.app:id/tvAvailableLimit");

	public void validaTelaDeCartoesDeCredito() throws Exception {
		utils.elementIsVisible(mensagemTelaCartoesDeCredito);
		logger.info("Tela de " + mensagemTelaCartoesDeCredito.getText() + " apresentada");
	}

	public void adicionaCartaoDeCredito(String nomeCartao, String txtCartao, String diaFechamento,
			String diaVencimentoCartaoCredito) throws Exception {

		logger.debug("Inicio de Adicionar o Cartão de Crédito");

		btnAdicionarCartao.click();
		limiteDoCartao.click();

		for (int i = 0; i <= 4; i++) {
			tecladoLimite.click();
		}
		tecladoOK.click();
		nomeDoCartao.sendKeys(nomeCartao);
		selecaoCartao.click();
		cartao = cartao.replace("XXXX", txtCartao);
		logger.info(txtCartao);
		bandeiraCartao = getElementByXPath(cartao);
		bandeiraCartao.click();
		dataFechamentoCartao.click();
		dia = dia.replace("XX", diaFechamento);
		diaFechamentoFatura = getElementByXPath(dia);
		diaFechamentoFatura.click();
		dataVencimentoCartao.click();
		diaVencimento = diaVencimento.replace("XX", diaVencimentoCartaoCredito);
		diaVencimentoCartao = getElementByXPath(diaVencimento);
		diaVencimentoCartao.click();
		btnSalvar.click();

		logger.debug("Fim de Adicionar o Cartão de Crédito");

	}

	public void validaAdicionarCartaoDeCredito(String nomeCartao) throws Exception {
		logger.debug("Início de validação do cadastro do cartão");

		assertEquals(nomeCartao, nomeCartaoSalvo.getText());
		logger.info("Apresentado o nome do cartão: " + nomeCartao);
		assertTrue(elementIsVisible(limiteCartaoSalvo));
		logger.info("Apresentado o limite do cartão: " + limiteCartaoSalvo.getText());

		logger.debug("Fim de validação do cadastro do cartão");
	}

}
