package br.com.sempreit_fortuno.pages;

import static br.com.smiles.base.DefaultBaseController.getPage_;

import br.com.sempreit_fortuno.utils.UtilsMobile;
import br.com.smiles.base.PageBase;
import br.com.smiles.base.VirtualElement;
import br.com.smiles.helpers.LoggerHelper;
import br.com.smiles.interfaces.Direction;

import static br.com.smiles.helpers.QueryHelper.getElementById;
import static br.com.smiles.helpers.QueryHelper.getElementByXPath;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.remote.server.handler.interactions.touch.Down;

public class PerfilAjustesActivity extends PageBase {
	LoggerHelper logger = new LoggerHelper(HomeActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);
	
	@SuppressWarnings("rawtypes")
	VirtualElement btnOcultarAlteracaoSaldoNoExtrato = getElementById("com.impprove.app:id/sHideBalanceSet"),
	validarTelaPerfilAjustes = getElementById("com.impprove.app:id/tvName");
	public void selecionarOcultarAlteracaoSaldoNoExtrato()throws Exception{
		logger.debug("início de selecionarOcultarAlteração Saldo No Extrato");
		utils.swipeToElement(btnOcultarAlteracaoSaldoNoExtrato, Direction.DOWN, 1);
		btnOcultarAlteracaoSaldoNoExtrato.click();
		logger.debug("fim de selecionar Ocultar Alteração Saldo no Extrato");
	}
	public void validarTelaPerfilAjustes()throws Exception{
		logger.debug("início de validar Tela Perfil Ajustes");
		assertTrue(elementIsVisible(validarTelaPerfilAjustes));
	}
}
