package br.com.sempreit_fortuno.steps;

import static br.com.smiles.base.DefaultBaseController.getPage_;
import static br.com.smiles.helpers.DataTableHelper.getDt_;

import br.com.sempreit_fortuno.pages.EditarContaActivity;
import br.com.sempreit_fortuno.pages.HomeActivity;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class EditarContasStep {
	
		HomeActivity home = getPage_(HomeActivity.class);
		EditarContaActivity editaractivity = getPage_(EditarContaActivity.class);
	
	@Dado("que a tela Contas foi apresentada")
	public void queATelaContasFoiApresentada()throws Exception {
	    home.validarHome();
	    home.acessarSaldoDeContas();
	    
	}

	@E("que o usuário edite a carteira")
	public void queOUsuarioEditeACarteira()throws Exception {
		editaractivity.EditarCarteira();
	}

	@E("que o usuário adicione os dados requisitados na tela")
	public void queOUsuárioAdicioneOsDadosRequisitadosNaTela()throws Exception {
		editaractivity.saldoDaConta(getDt_().getStringOf("in_Saldo_Da_Conta"));
	}

	@Então("devera validar os dados inseridos")
	public void deveraValidarOsDadosInseridos() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	}

	@E("que o usuário edite a carteira")
	public void queOUsuárioEditeACarteira() throws Exception {
		// Write code here that turns the phrase above into concrete actions

	}

	@E("que o usuário adicione os dados requisitados na tela")
	public void queOUsuárioAdicioneOsDadosRequisitadosNaTela() throws Exception {
		// Write code here that turns the phrase above into concrete actions

	}

	@Então("devera validar os dados inseridos")
	public void deveraValidarOsDadosInseridos() throws Exception {
		// Write code here that turns the phrase above into concrete actions
	}
}