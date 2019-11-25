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
	btnIgual = getElementById("com.impprove.app:id/btEquals"),	
	btnTransferirCarteira = getElementByXPath("(//android.widget.TextView[@text='Carteira'])[2]"),
	btnSelecionarOutraCarteira = getElementByXPath("//android.widget.TextView[@text='Zé']"),
	salvarTransacao = getElementById("com.impprove.app:id/action_save"),
	btnMenuNovaReceita = getElementById("com.impprove.app:id/fab_income"),
	btnTrocarData = getElementById("com.impprove.app:id/tvDate"),
	btnDiaData = getElementByXPath("//android.view.View[@content-desc=\"15 novembro 2019\"]"),
	btnValidarDataCalendario = getElementById("android:id/button1"),
	btnInvestimentos = getElementById("com.impprove.app:id/tvCategoryName"),
	investimentosEscolhas = getElementByXPath("//android.widget.TextView[contains(@text,'Salário')]"),
	btnParcelaOuRepetir = getElementById("com.impprove.app:id/cbRepeat"),
	btnParcelarValor = getElementById("com.impprove.app:id/rbInstallments"),
	qtdParcelas = getElementById("com.impprove.app:id/edNumber"),
	btnAbrirEscolhaDespesa = getElementById("com.impprove.app:id/tvCategoryName"),
	btnEscolherDespesa = getElementByXPath("//android.widget.TextView[contains(@text,'Saúde')]");
	
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
	public void trocarCarteiraParaTransferir()throws Exception{
		logger.debug("início de trocar Carteira Para Transferir");
		btnTransferirCarteira.click();
		btnSelecionarOutraCarteira.click();
		logger.debug("fim de trocar Carteira Para Transferir");
	}
	public void salvarTransacao()throws Exception {
		logger.debug("início de salvar Transferência");
		salvarTransacao.click();
		logger.debug("fim de salvar Transferência");
	}
	//REG-402
	public void abrirMenuNovaReceita()throws Exception{
		logger.debug("início de abrir Menu Nova Receita");
		btnMenuNovaReceita.click();
		logger.debug("fim de abrir Menu Nova Receita");
	}
	public void selecionarCalendarioNovaReceita()throws Exception{
		logger.debug("início de selecionar Calendário Nova Receita");
		btnTrocarData.click();
		btnDiaData.click();
		logger.debug("fim de selecionar Calendário Nova Receita");
	}
	public void selecionarDiaCalendario()throws Exception {
	logger.debug("início selecionar Dia Calendário Nova Receita");
	btnDiaData.click();
	logger.debug("fim de selecionar Dia Calendário Nova Receita  ");
	}
	public void validarDataCalendario()throws Exception{
		logger.debug("início de validar Data Calendário");
		btnValidarDataCalendario.click();
		logger.debug("fim de validar Data Calendario");
	}
	public void trocarTipoDeReceita()throws Exception {
		logger.debug("início de trocar Tipo De Receita");
		btnInvestimentos.click();
		investimentosEscolhas.click();
		logger.debug("fim de trocar Tipo de Receita");
	}
	public void escolherParcelaOuRepetir()throws Exception{
		logger.debug("início de escolher Parcela ou Repetir");
		btnParcelaOuRepetir.click();
		btnParcelarValor.click();
		logger.debug("fim de escolher Parcela ou Repetir");
	}
	public void escolherQuantidadeDeParcelas(String parcela)throws Exception{
		logger.debug("início de escolher quantidade de Parcelas");
		qtdParcelas.click();
		qtdParcelas.sendKeys(parcela);
		logger.debug("fim de escolher quantidade de Parcelas");
	}
	
	//REG-403
	public void escolherTipoDeDespesa()throws Exception{
		logger.debug("início de escolher Tipo de Despesa");
		btnAbrirEscolhaDespesa.click();
		btnEscolherDespesa.click();
		logger.debug("fim de escolher Tipo de Despesa");
	}
	
}

