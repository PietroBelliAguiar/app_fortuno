package br.com.sempreit_fortuno.steps;

import static br.com.smiles.base.DefaultBaseController.getPage_;

import br.com.sempreit_fortuno.pages.HomeActivity;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import br.com.sempreit_fortuno.pages.PerfilAjustesActivity;
public class PerfilAjustesStep {
	HomeActivity home = getPage_(HomeActivity.class);
	PerfilAjustesActivity perfilAjustes = getPage_(PerfilAjustesActivity.class);
	
	@Dado("que o usuário acesse o menu Perfil  Ajustes")
	public void queOUusuarioAcesseOMenuPerfilAjustes() throws Exception{
	    home.abrirMenuLateral();
	    home.abrirMenuPerfilAjustes();
	    
	}

	@E("que o usuário coloque as mudanças requisitadas")
	public void queOUsuarioColoqueAsMudancasRequisitadas()throws Exception {
		perfilAjustes.selecionarOcultarAlteracaoSaldoNoExtrato();
	}

	@Então("deverá validar a apresentação da tela Perfil Ajustes")
	public void deveraValidarAApresentacaoDaTelaPerfilAjustes() throws Exception{
		perfilAjustes.validarTelaPerfilAjustes();
	}
	@Dado("que o usuário acesse a tela migrar para premium")
	public void queOUsuarioAcesseATelaMigrarParaPremium()throws Exception {
		
		home.abrirMigrarParaPremium();
	}

	@Então("deverá validar o acesso à tela")
	public void deveraValidarOAcessoATela()throws Exception {
		home.validarTelaPremium();
	}
}
