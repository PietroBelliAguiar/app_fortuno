package br.com.sempreit_fortuno.steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import br.com.sempreit_fortuno.pages.HomeActivity;
import br.com.sempreit_fortuno.pages.TransacoesActivity;

import static br.com.smiles.base.DefaultBaseController.getPage_;

public class TransacoesStep {
	TransacoesActivity transacoes = getPage_(TransacoesActivity.class);
	HomeActivity home = getPage_(HomeActivity.class);
	
	
	//REG-401
	
	@Dado("que o usuário abra o menu Transações")
	public void queOUsuárioAbraOMenuTransações() throws Exception {
		home.acessarMenuLateral();
		home.acessarMenuTransacoes();
		home.abrirMenuFlutuante();
	}

	@E("que o usuário abra a tela de nova transferência")
	public void queOUsuárioAbraATelaDeNovaTransferência()throws Exception {
		transacoes.abrirMenuDeNovaTranferência();
	}

	@E("coloque o valor necessário")
	public void coloqueOValorNecessário()throws Exception {
		transacoes.calcularResultadoCalculadora();
	}

	@E("transfira o valor para outra carteira")
	public void transfiraOValorParaOutraCarteira()throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Então("devera validar a transferência")
	public void deveraValidarATransferência()throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	
	}
	
	//REG-402
	
	@Dado("que o usuário abra a tela de nova receita")
	public void queOUsuárioAbraATelaDeNovaReceita()throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@E("coloque as informações necessárias para a receita")
	public void coloqueAsInformaçõesNecessárias()throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Então("devera validar a receita")
	public void deveraValidarAReceita()throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	//REG-403
	
	@Dado("que o usuário abra a tela de nova despesa")
	public void queOUsuárioAbraATelaDeNovaDespesa() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	@E("coloque as informações necessárias para a despesa")
	public void coloqueAsInformaçõesNecessáriasParaADespesa()throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Então("devera validar a nova despesa")
	public void deveraValidarANovaDespesa() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	
	//REG-404
	
	@Dado("que o usuário abra a tela de nova despesa do cartão")
	public void queOUsuárioAbraATelaDeNovaDespesaDoCartão()throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Dado("declare as informações necessárias para o cartão")
	public void declareAsInformaçõesNecessárias()throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Então("devera validar a despesa do cartão")
	public void deveraValidarADespesaDoCartão()throws Exception {
	    // Write code here that turns the phrase above into concrete actions

	}

	
}
