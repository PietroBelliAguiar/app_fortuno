package br.com.sempreit_fortuno.steps;

import static br.com.smiles.base.DefaultBaseController.getPage_;
import static br.com.smiles.helpers.DataTableHelper.getDt_;

import br.com.sempreit_fortuno.pages.CartoesDeCreditoActivity;
import br.com.sempreit_fortuno.pages.HomeActivity;
import br.com.sempreit_fortuno.pages.IntroducaoActivity;
import br.com.sempreit_fortuno.pages.OrçamentosActivity;
import br.com.sempreit_fortuno.pages.TransacoesActivity;
import br.com.sempreit_fortuno.utils.UtilsMobile;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class OrcamentosStep {
	HomeActivity home = getPage_(HomeActivity.class);
	IntroducaoActivity intro = getPage_(IntroducaoActivity.class);
	CartoesDeCreditoActivity cartoes = getPage_(CartoesDeCreditoActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);
	OrçamentosActivity orcamento = getPage_(OrçamentosActivity.class);
	TransacoesActivity transacoes = getPage_(TransacoesActivity.class);
	
	@Dado("que o usuário acesse a tela Orçamentos")
	public void QueOUsuarioAcesseATelaOrcamentos()throws Exception {
		home.abrirMenuLateral();
		home.abrirMenuOrçamentos();
	}

	@E("que o usuário adicione um ou mais orçamentos")
	public void queOUsuarioAdicioneUmOuMaisOrcamentos()throws Exception {
		orcamento.adicionarOrcamentoNoMenu();
		utils.inserirValorCalculadoraFortuno(getDt_().getStringOf("in_Valor_Calculadora_Transferencia"));
		
	}

	@E("coloque os valores necessários")
	public void ColoqueOsValoresNecessarios()throws Exception {
		home.abrirMenuFlutuante();
		orcamento.adicionarValorMeta();
		utils.inserirValorCalculadoraFortuno(getDt_().getStringOf("in_Valor_Calculadora_Transferencia"));
		transacoes.escolherTipoDeDespesa();
	}

	@Então("deverá validar os dados")
	public void DeveraValidarOsDados()throws Exception {
	   transacoes.btnSalvar();
	    
	}
	@Dado("que o usuário abra o menu gráficos")
	public void queOUsuarioAbraOMenuGraficos()throws Exception  {
		home.abrirMenuLateral();
		home.abrirMenuGraficos();
	}

	@Então("devera validar a apresentação")
	public void deveraValidarAApresentacao() throws Exception {
		orcamento.validacaoMenuGraficos();
	}

}
