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
			limiteCartaoSalvo = getElementById("com.impprove.app:id/tvAvailableLimit"),
			abrirMenuDeNovasOpcoes = getElementById("com.impprove.app:id/btOptions"),
			btnNovadDespesa = getElementByXPath("//android.widget.TextView[@text='Nova despesa']"),
			btnAbrirCartao = getElementById("com.impprove.app:id/rlCardInfo"),
			btnNovoCreditoOuEstorno = getElementById("com.impprove.app:id/llAddCredit"),
			btnEditarCartao = getElementById("com.impprove.app:id/llEditCard"),
			btnAlterarValor = getElementById("com.impprove.app:id/edCreditLimit"),
			btnTrocarBandeiraCartao = getElementById("com.impprove.app:id/edBrand"),
			btnSelecionarOutraBandeiraCartao = getElementByXPath("//android.widget.TextView[@text='Mastercard']"),
			btnTrocarDiaFechamentoCartao = getElementById("com.impprove.app:id/edClosingDay"),
			btnTrocarDiaVencimento = getElementById("com.impprove.app:id/edDueDay"),
			btnDiaSelecionadoFechamentoCartao = getElementByXPath("//android.widget.TextView[@text='16']"),
			btnDiaSelecionadoVencimentoCartao = getElementByXPath("//android.widget.TextView[@text='28']"),
			btnValidarEdicaoCartao = getElementById("com.impprove.app:id/action_save"),
			validarFaturaCartao = getElementById("com.impprove.app:id/tvSpendings"),
			btnPagarFatura = getElementById("com.impprove.app:id/btPayBillStatement"),
			btnConfirmarPagamentoFatura = getElementById("com.impprove.app:id/btConfirm"),
			validarFaturaPaga = getElementByXPath("//android.widget.TextView[contains(@text,'Pagamento de fatura')]"),
			btnExcluir = getElementById("com.impprove.app:id/action_delete"),
			campoTextoConfirmar = getElementById("com.impprove.app:id/edConfirm"),
			btnConfirmar = getElementById("com.impprove.app:id/btConfirm");
	
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
	public void abrirMenuDeOpcoes()throws Exception{
		logger.debug("início de abrir Menu De Novas Opcoes");
		abrirMenuDeNovasOpcoes.click();
		logger.debug("fim de abrir Menu de Novas Opcoes");
	}
	public void abrirMenuNovaDespesaCartão()throws Exception{
		logger.debug("início de abrir Menu Nova Despesa Cartão");
		btnNovadDespesa.click();
		logger.debug("fim de abrir Menu Nova Despesa Cartão");
	}
	public void abrirCartao()throws Exception {
		logger.debug("início de abrir Cartão de Crédito");
		btnAbrirCartao.click();
		logger.debug("fim de abrir Cartão de Crédito");
	}
	public void abrirNovoCreditoOuEstorno()throws Exception{
		logger.debug("início de abrir Novo Credito Ou Estorno");
		btnNovoCreditoOuEstorno.click();
		logger.debug("fim de abrir Novo Credito Ou Estorno");
	}
	public void abrirEditarCartao()throws Exception {
		logger.debug("início de abrir Editar Cartão");
		btnEditarCartao.click();
		logger.debug("fim de abrir Editar Cartão");
	}
	public void alterarValorCartao()throws Exception{
		logger.debug("início de alterar Valor do Cartão");
		btnAlterarValor.click();
		logger.debug("fim de alterar Valor do Cartão");
	}
	public void trocarBandeiraCartao()throws Exception{
		logger.debug("início de trocar Bandeira Cartão");
		btnTrocarBandeiraCartao.click();
		btnSelecionarOutraBandeiraCartao.click();
		logger.debug("fim de alterar Bandeira Cartão");
	}
	public void trocarDiaFechamentoCartao() throws Exception{
		logger.debug("início de trocar Dia Fechamento Cartão");
		btnTrocarDiaFechamentoCartao.click();
		btnDiaSelecionadoFechamentoCartao.click();
		logger.debug("fim de trocar Dia Fechamento Cartão");

	}
	public void trocarDiaVencimentoCartao()throws Exception{
		logger.debug("início de trocar Dia Vencimento Cartão");
		btnTrocarDiaVencimento.click();
		btnDiaSelecionadoVencimentoCartao.click();
		logger.debug("fim de trocar Dia Vencimento Cartão");
	}
	public void validarEdicaoDoCartao()throws Exception {
		logger.debug("início de validar Edição do Cartão");
		btnValidarEdicaoCartao.click();
		logger.debug("fim de validar Edição do Cartão");
	}
	public void validarValorDaFatura() throws Exception{
		logger.debug("início de validar Valor da Fatura");
		assertTrue(elementIsVisible(validarFaturaCartao));
		logger.info("Valor da fatura validada com sucesso!");
		logger.debug("fim de validar Valor da Fatura");
	}
	public void realizarPagamentoFatura()throws Exception{
		logger.debug("início de realizar Pagamento Fatura");
		btnConfirmarPagamentoFatura.click();
		logger.debug("início de realizar Pagamento Fatura");
	}
	public void validarPagamentoDaFaturaNoCartao()throws Exception{
		logger.debug("início de validar Fatura no Cartão");
		assertTrue(elementIsVisible(validarFaturaPaga));
		logger.info("Fatura Paga com sucesso!");
		logger.debug("fim de validar Fatura no Cartão");

	}
	public void realizarExclusaoCartao() throws Exception{
		logger.debug("início de realizar Exclusão do Cartão");
		btnExcluir.click();
		logger.debug("fim de realizar Exclusão do Cartão");

	}
	public void CampoTextoExclusaoCartao(String confirmar)throws Exception{
		logger.debug("início de Campo Texto Exclusão do Cartão");
		campoTextoConfirmar.sendKeys(confirmar);
		campoTextoConfirmar.click();
		logger.debug("fim de confirmar Exclusão do Cartão");

	}
	public void confirmarExclusaoCartao() throws Exception{
		logger.debug("início de confirmar Exclusão do Cartão");
		btnConfirmar.click();
		logger.debug("fim de confirmar Exclusão do Cartão");

	}
	
}
