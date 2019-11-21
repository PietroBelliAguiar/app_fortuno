package br.com.sempreit_fortuno.steps;

import static br.com.smiles.base.DefaultBaseController.getPage_;
import br.com.sempreit_fortuno.pages.GastosDeHojeActivity;
import br.com.sempreit_fortuno.pages.HomeActivity;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Então;

public class GastosDeHojeStep {
	GastosDeHojeActivity gastos = getPage_(GastosDeHojeActivity.class);
	HomeActivity home = getPage_(HomeActivity.class);
	
	@Dado("que o usuário acesse a tela Resumo diário")
	public void queOUsuarioAcesseATelaResumoDiario() throws Exception {
		home.validarHome();
		gastos.acessarGastosDeHoje();
	}

	@Dado("que o usuário acesse o menu calendário")
	public void queOUsuarioAcesseOMenuCalendario()throws Exception {
		gastos.acessarCalendario();
	}

	@Dado("selecione a data necessária")
	public void selecioneADataNecessaria()throws Exception {
		gastos.selecionarDataNascimento();
	}

	@Então("deverá validar a data")
	public void deveraValidarAData()throws Exception {
		
	}
}
