package br.com.sempreit_fortuno.steps;

import static br.com.smiles.helpers.DataTableHelper.getDt_;

import org.apache.xmlbeans.impl.inst2xsd.SalamiSliceStrategy;

import static br.com.smiles.base.DefaultBaseController.getPage_;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import br.com.sempreit_fortuno.pages.HomeActivity;
import br.com.sempreit_fortuno.pages.TransacoesActivity;
import br.com.sempreit_fortuno.utils.UtilsMobile;


public class TransacoesStep {
	TransacoesActivity transacoes = getPage_(TransacoesActivity.class);
	HomeActivity home = getPage_(HomeActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);
	
	
	
	@Dado("que o usuário abra o menu Transações")
	public void queOUsuárioAbraOMenuTransações() throws Exception {
		home.acessarMenuLateral();
		home.acessarMenuTransacoes();
		home.abrirMenuFlutuante();
	}
	
	//REG-401
	
	@E("que o usuário abra a tela de nova transferência")
	public void queOUsuarioAbraATelaDeNovaTransferencia()throws Exception {
		transacoes.abrirMenuDeNovaTranferência();
	}

	@E("coloque o valor necessário")
	public void coloqueOValorNecessario()throws Exception {
		utils.inserirValorCalculadoraFortuno(getDt_().getStringOf("in_Valor_Calculadora_Transferencia"));
	}

	@E("transfira o valor para outra carteira")
	public void transfiraOValorParaOutraCarteira()throws Exception {
		transacoes.trocarCarteiraParaTransferir();
	}

	@Então("devera validar a transferência")
	public void deveraValidarATransferencia()throws Exception {
		transacoes.salvarTransacao();
	}
	
	//REG-402
	
	@Dado("que o usuário abra a tela de nova receita")
	public void queOUsuarioAbraATelaDeNovaReceita()throws Exception {
		transacoes.abrirMenuDeNovaReceita();
	}

	@E("coloque as informações necessárias para a receita")
	public void coloqueAsInformacoesNecessarias()throws Exception {
	   utils.inserirValorCalculadoraFortuno(getDt_().getStringOf("in_Valor_Calculadora_Transferencia"));
	   transacoes.selecionarCalendario();
	   transacoes.selecionarDiaCalendario();
	   transacoes.validarDataCalendario();
	   transacoes.trocarTipoDeReceita();
	   transacoes.escolherParcelaOuRepetir();
	   transacoes.escolherQuantidadeDeParcelas(getDt_().getStringOf("in_Quantidade_Parcelas"));
	   
	   
	}

	@Então("devera validar a receita")
	public void deveraValidarAReceita()throws Exception {
		transacoes.salvarTransacao();
	}
	
	//REG-403
	
	@Dado("que o usuário abra a tela de nova despesa")
	public void queOUsuarioAbraATelaDeNovaDespesa() throws Exception{
		transacoes.abrirMenuDeNovaDespesa();
	}
	@E("coloque as informações necessárias para a despesa")
	public void coloqueAsInformacoesNecessariasParaADespesa()throws Exception {
		utils.inserirValorCalculadoraFortuno(getDt_().getStringOf("in_Valor_Calculadora_Transferencia"));
		transacoes.selecionarCalendario();
		transacoes.selecionarDiaCalendario();
		transacoes.validarDataCalendario();
		transacoes.escolherTipoDeDespesa();
		transacoes.escolherParcelaOuRepetir();
		transacoes.escolherQuantidadeDeParcelas(getDt_().getStringOf("in_Quantidade_Parcelas"));
		
	}

	@Então("devera validar a nova despesa")
	public void deveraValidarANovaDespesa() throws Exception{
		transacoes.salvarTransacao();
	}
	
	//REG-404
	
	@Dado("que o usuário abra a tela de nova despesa do cartão")
	public void queOUsuárioAbraATelaDeNovaDespesaDoCartão()throws Exception {
		transacoes.abrirMenuDeNovaDespesaNoCredito();
	}

	@Dado("declare as informações necessárias para o cartão")
	public void declareAsInformaçõesNecessárias()throws Exception {
	    utils.inserirValorCalculadoraFortuno(getDt_().getStringOf("in_Valor_Calculadora_Transferencia"));
	    transacoes.selecionarCalendario();
	    transacoes.selecionarDiaCalendario();
	    transacoes.validarDataCalendario();
	    transacoes.escolherMesAnoFatura();
	    transacoes.escolherTipoDeDespesa();
	    transacoes.escolherParcelaOuRepetir();
	    transacoes.escolherQuantidadeDeParcelas(getDt_().getStringOf("in_Quantidade_Parcelas"));
	}

	@Então("devera validar a despesa do cartão")
	public void deveraValidarADespesaDoCartão()throws Exception {
		transacoes.salvarTransacao();
	}

	
}
