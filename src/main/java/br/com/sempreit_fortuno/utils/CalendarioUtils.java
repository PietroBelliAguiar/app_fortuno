package br.com.sempreit_fortuno.utils;

import static br.com.smiles.helpers.QueryHelper.getElementById;
import static br.com.smiles.helpers.QueryHelper.getElementByXPath;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.smiles.base.PageBase;
import br.com.smiles.exceptions.GenericException;
import br.com.smiles.helpers.LoggerHelper;
import br.com.smiles.helpers.ThreadHelper;
import br.com.smiles.interfaces.Direction;
import io.appium.java_client.MobileElement;

public class CalendarioUtils extends PageBase{
	
	static LoggerHelper logger = new LoggerHelper(CalendarioUtils.class);
	
	@SuppressWarnings("unchecked")
	public void selectCalendar(String dataIda, String dataVolta) throws Exception {

		logger.debug("Início select calendar");
		
		boolean encontrou = false;
		
		String tipoViagem = getElementById("textview_component_airport_icon_description").getText();
				
		String dataCompleteIda = dataComplete(dataIda);
		String dataCompleteVolta = null;
		
		if(!tipoViagem.equals("Só ida") && !tipoViagem.equals("+ Trechos")) {
			dataCompleteVolta = dataComplete(dataVolta);
		}
		
		String mesIda = dataCompleteIda.substring(3, 5) + "-" + dataCompleteIda.substring(6, 10);
		String xPathIDA = "//android.widget.TextView[@content-desc='"+mesIda+"']/following-sibling::android.widget.GridView//android.view.ViewGroup[@content-desc='"+dataCompleteIda+"']";
		
		swipeToElement(getElementByXPath(xPathIDA), Direction.DOWN, 7);
		logger.takeScreenShot("Swipe para a data ", this);
		
		encontrou = clickDate(getElementByXPath(xPathIDA).all(), tipoViagem);
		
		if(!encontrou) {
			persistenciaDoSwipe();
			clickDate(getElementByXPath(xPathIDA).all(), tipoViagem);
		}
		
		if(!tipoViagem.equals("Só ida") && !tipoViagem.equals("+ Trechos")) {
			ThreadHelper.espera(1500);
			
			String mesVolta = dataCompleteVolta.substring(3, 5) + "-" + dataCompleteVolta.substring(6, 10);
			String xPathVolta = "//android.widget.TextView[@content-desc='"+mesVolta+"']/following-sibling::android.widget.GridView//android.view.ViewGroup[@content-desc='"+dataCompleteVolta+"']";
			
			swipeToElement(getElementByXPath(xPathVolta), Direction.DOWN, 7);

			encontrou = clickDate(getElementByXPath(xPathVolta).all(), tipoViagem);
			
			if(elementExists(getElementById("calendar_confirm"), 2)) {
				logger.takeScreenShot("Confirmar a data do calendário", this);
				getElementById("calendar_confirm").click();
				encontrou = true;
			}
			
			if(!encontrou) {
				persistenciaDoSwipe();
				clickDate(getElementByXPath(xPathVolta).all(), tipoViagem);
			}
		}
		
		logger.debug("Fim select calendar");
	}

	private boolean clickDate(List<MobileElement> elements, String tipoViagem) throws GenericException, Exception {
		boolean encontrou = false;
		
		for (MobileElement e : elements) {
			e.click();
			
			if(tipoViagem.equals("Só ida") || tipoViagem.equals("+ Trechos")) {
				if(elementExists(getElementById("calendar_confirm"), 2)) {
					logger.takeScreenShot("Confirmar a data do calendário", this);
					getElementById("calendar_confirm").click();
					encontrou = true;
					break;
				}
			} else {
				encontrou =  true;
			} 
		}
		logger.takeScreenShot("Click data", this);
		return encontrou;
	}
	
	public String dataComplete(String data) {
		int day = Integer.parseInt(data);
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_WEEK, day);
		
		String dia = Integer.toString(cal.get(Calendar.DATE));
		String mes = Integer.toString((cal.get(Calendar.MONTH) + 1));
		
		if(dia.length() < 2)
			dia = "0" + dia.substring(0);
		
		if(mes.length() < 2)
			mes = "0" + mes.substring(0);
		
		return dia + "/" + mes + "/" + cal.get(Calendar.YEAR);
	}
	
	public void persistenciaDoSwipe() throws GenericException, Exception {
		swipe(Direction.DOWN);
		logger.takeScreenShot("Realizando swipe", this);
	}
}
