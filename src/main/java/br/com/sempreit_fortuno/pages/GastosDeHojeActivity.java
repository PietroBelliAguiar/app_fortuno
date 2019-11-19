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
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Time;

import org.apache.tools.ant.taskdefs.optional.PropertyFile.Unit;
import org.junit.Assert;

public class GastosDeHojeActivity extends PageBase {
	LoggerHelper logger = new LoggerHelper(GastosDeHojeActivity.class);
	UtilsMobile utils = getPage_(UtilsMobile.class);
	
	@SuppressWarnings("rawtypes")
	VirtualElement btnGastosDeHoje = getElementByXPath("//android.widget.TextView[@text='Gastos de hoje']"),
	btnCalendario = getElementById("com.impprove.app:id/tvMonthYear"),
	btnAnoCalendario = getElementById("android:id/date_picker_header_year"),
	acharAnoCalendario = getElementByXPath("android:id/text1"),
	clicarNoAno = getElementByXPath("//android.widget.TextView[@text='2100']"),
	diaCalendario = getElementByXPath("//android.view.View[@content-desc='28 agosto 2100']"),
	btnMesPassado = getElementByXPath("//android.widget.ImageButton[@content-desc='Mês passado']"),
	btnFecharCalendario = getElementById("android:id/button1"),
	verificarData = getElementById("//android.widget.TextView[contains(@text,'28 ago 2100')]");
	
	
	public void acessarGastosDeHoje()throws Exception{
		logger.debug("Início de acessar Gastos De Hoje");
		btnGastosDeHoje.click();
		logger.debug("Fim de acessar Gastos de Hoje");
	}
	public void acessarCalendario() throws Exception{
		logger.debug("Início de acessar Calendário");
		btnCalendario.click();
		logger.debug("fim de acessar Calendário");
	}
	
	public void selecionarDataNascimento() throws Exception{
		logger.debug("Início de selecionar Data Nascimento");
		btnAnoCalendario.click();
		utils.swipeToElement(acharAnoCalendario, Direction.DOWN, 10);
		clicarNoAno.click();
		
		//selecionar mes e dia inicio
		while(!elementIsVisible(diaCalendario)) {
			btnMesPassado.click();
			Thread.sleep(1);
		}
		//selecionar mes e dia fim
		diaCalendario.click();
		btnFecharCalendario.click();
		
		equals(elementIsVisible(verificarData));
		
		logger.debug("fim de selecionar Data Nascimento");
	}
}
