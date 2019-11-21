package br.com.sempreit_fortuno.steps;

import static br.com.smiles.base.DefaultBaseController.getPage_;

import br.com.sempreit_fortuno.pages.CartoesDeCreditoActivity;
import br.com.sempreit_fortuno.pages.HomeActivity;
import br.com.sempreit_fortuno.pages.IntroducaoActivity;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import static br.com.smiles.helpers.DataTableHelper.getDt_;

public class CartoesDeCreditoStep {
	
	HomeActivity home = getPage_(HomeActivity.class);
	IntroducaoActivity intro = getPage_(IntroducaoActivity.class);
	CartoesDeCreditoActivity cartoes = getPage_(CartoesDeCreditoActivity.class);
	
	//Contexto
	@Dado("que o usuário acesse a tela de Cartões de Crédito")
	public void queOUsuarioAcesseATelaDeCartoesDeCredito() throws Exception{
//		intro.telaDePrimeiroAcesso();
	    home.validarHome();
	    home.acessarMenuPrincipal();
	    home.acessarCartoesDeCredito();
	    cartoes.validaTelaDeCartoesDeCredito();
	    
	}

	//REG-201 - ADICIONAR CARTÃO DE CRÉDITO
	@Dado("que o usuário adicione um novo cartão")
	public void queOUsuarioAdicioneUmNovoCartao() throws Exception {
		cartoes.adicionaCartaoDeCredito(getDt_().getStringOf("in_Nome_Cartao"), 
										getDt_().getStringOf("in_Bandeira_Cartao"), 
										getDt_().getStringOf("in_Dia_Fechamento"), 
										getDt_().getStringOf("in_Dia_Vencimento"));		
		
	}

	@Então("devera validar o cartão cadastrado")
	public void deveraValidarOCartaoCadastrado() throws Exception{
	    cartoes.validaAdicionarCartaoDeCredito(getDt_().getStringOf("in_Nome_Cartao"));
	}

	//REG-202
	
	@Dado("que o usuário adicione uma nova despesa no cartão")
	public void queOUsuarioAdicioneUmaNovaDespesaNoCartao() throws Exception{
	    
	}

	@E("escolhe entre repetir ou parcelar despesa")
	public void escolheEntreRepetirOuParcelarDespesa() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Então("deverá ser validado o cadastro de despesa")
	public void deveraSerValidadoOCadastroDeDespesa() throws Exception {
	    
	}
	
	//REG-203

	@Dado("que o usuário adicione um novo crédito ou estorno")
	public void queOUsuarioAdicioneUmNovoCreditoOuEstorno() throws Exception {
	    
	}

	@Então("deverá ser validado o cadastro do crédito ou estorno")
	public void deveraSerValidadoOCadastroDoCreditoOuEstorno() {
	    
	}
	
	//REG-204

	@Dado("que o usuário acesse a opção editar cartão")
	public void queOUsuarioAcesseAOpcaoEditarCartão() throws Exception {
	    
	}

	@E("alterar os dados do cartão")
	public void alterarOsDadosDoCartao() throws Exception {
	    
	}

	@Então("de deverá ser validado as alterações do cartão")
	public void deDeveraSerValidadoAsAlteracoesDoCartao() throws Exception {
	    
	}
	
	//REG-205

	@Dado("que o usuário tenha uma despesa cadastrada")
	public void queOUsuarioTenhaUmaDespesaCadastrada() {
	    
	}

	@E("realize o pagamento da despesa")
	public void realizeOPagamentoDaDespesa() throws Exception {
	    
	}

	@Então("deverá ser validado o pagamento da despesa")
	public void deveraSerValidadoOPagamentoDaDespesa() throws Exception{
	    
	}
	
	//REG-206

	@Dado("que o usuário tenha um cartão de crédito cadastrado")
	public void queOUsuarioTenhaUmCartaoDeCreditoCadastrado() throws Exception {
	   
	}

	@E("escolha remover o cartão")
	public void escolhaRemoverOCartao() throws Exception{
		
	}

	@Então("deverá ser validado a exclusão do cartão")
	public void deveraSerValidadoAExclusaoDoCartao() throws Exception {
		
	}

	
	
}
