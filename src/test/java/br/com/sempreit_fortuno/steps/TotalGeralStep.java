package br.com.sempreit_fortuno.steps;

import br.com.sempreit_fortuno.pages.CartoesDeCreditoActivity;
import br.com.sempreit_fortuno.pages.HomeActivity;
import br.com.sempreit_fortuno.pages.IntroducaoActivity;
import br.com.sempreit_fortuno.pages.OrçamentosActivity;
import br.com.sempreit_fortuno.pages.TotalGeralActivity;
import br.com.sempreit_fortuno.pages.TransacoesActivity;
import br.com.sempreit_fortuno.utils.UtilsMobile;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

import static br.com.smiles.base.DefaultBaseController.getPage_;


public class TotalGeralStep {
	HomeActivity home = getPage_(HomeActivity.class);
	IntroducaoActivity intro = getPage_(IntroducaoActivity.class);
	CartoesDeCreditoActivity cartoes = getPage_(CartoesDeCreditoActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);
	OrçamentosActivity orcamento = getPage_(OrçamentosActivity.class);
	TransacoesActivity transacoes = getPage_(TransacoesActivity.class);
	TotalGeralActivity totalgeral = getPage_(TotalGeralActivity.class);
	@Dado("que o usuário acesse o menu Total Geral")
	public void queOUsuarioAcesseOMenuTotalGeral() throws Exception{
		home.abrirMenuLateral();
		home.abrirTotalGeral();
	}

	@E("que o usuário visualizar as páginas mostradas")
	public void queOUsuarioVisualizarAsPaginasMostradas()throws Exception {
		totalgeral.trocarParaTelaSeguinte();
	}

	@Então("deverá validar à abertura da tela acessada")
	public void deveraValidarAAberturaDaTelaAcessada()throws Exception {
	    totalgeral.validarTelaTrocada();
	   
	}
	
}
