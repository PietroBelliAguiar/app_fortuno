package br.com.sempreit_fortuno.utils;

import static br.com.sempreit_fortuno.validations.ValidationsHelper.getCv_;
import static br.com.smiles.helpers.ProtonHelper.getProtonMemberInfoQtdMilhas;
import static br.com.smiles.helpers.QueryHelper.getElementByAccessibilityId;
import static br.com.smiles.helpers.QueryHelper.getElementById;
import static br.com.smiles.helpers.QueryHelper.getElementByXPath;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jettison.json.JSONException;
import org.openqa.selenium.Dimension;

import com.google.api.client.util.Strings;

import br.com.smiles.base.DefaultBaseController;
import br.com.smiles.base.PageBase;
import br.com.smiles.base.VirtualElement;
import br.com.smiles.controllers.AndroidController;
import br.com.smiles.exceptions.ElementFindException;
import br.com.smiles.exceptions.GenericException;
import br.com.smiles.helpers.LoggerHelper;
import br.com.smiles.interfaces.Direction;
import br.com.smiles.utils.Utils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class UtilsMobile extends PageBase {

	LoggerHelper logger = new LoggerHelper(UtilsMobile.class);

	@SuppressWarnings("rawtypes")
	VirtualElement msgAvaliacaoApp = getElementById("relativeLayout"), btnLembrarDepois = getElementById("buttonOne"),
			lblVoucherMilhas = getElementById("imgTitle"), btnFecharModalVoucher = getElementById("close"),
			btnTransacaoEspecifica = getElementByXPath("(//android.widget.ImageButton)[1]"),
			btnFecharModalEmissao = getElementByAccessibilityId("btn_close"),
			txtPesquisaCompraMilhas = getElementByXPath("(//*[@text='Compra de Milhas Smiles'])[1]"),
			txtGeolocalizacao = getElementByXPath("//*[@text='Geolocalização']"),
			btnCancelarGeolocalizacao = getElementById("md_buttonDefaultNegative"),
			btnAcessarTransacoes = getElementByXPath(
					"(//android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView)[1]"),
			btnFecharCategoria = getElementById("dialog_congrats_close"),
			modalTransicaoPaginas = getElementById("loading_image");

	public String retornarDataSistema() throws Exception {

		logger.debug("Início captura data do sistema.");
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		Calendar data = Calendar.getInstance();
		String capturarData = formatoData.format(data.getTime());

		return capturarData;
	}

	public String retornarDataCreditoRetroativo() {

		SimpleDateFormat formatoData = new SimpleDateFormat("ddMMyyyy");
		Calendar data = Calendar.getInstance();
		data.add(Calendar.MONTH, -2);
		String capturarDataCreditoRetro = formatoData.format(data.getTime());

		return capturarDataCreditoRetro;
	}

	public void acessarTransacaoExtrato() throws InterruptedException, GenericException, ElementFindException {

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());

		@SuppressWarnings("rawtypes")
		VirtualElement btnMesTransacao = getElementByXPath(
				"//android.widget.RelativeLayout//*[@text=" + getCv_().getDataPedidoMeusPedidos() + "]");
		
		getCv_().setDataPedidoMeusPedidos("");
		String mes = getCv_().getDataPedidoMeusPedidos().substring(3, 5);
		if (mes.startsWith("0")) {
			getCv_().setDataPesquisaExtrato(
					Utils.getMonth(Integer.parseInt(mes.substring(1))) + " - " + cal.get(Calendar.YEAR));
		} else {
			getCv_().setDataPesquisaExtrato(Utils.getMonth(Integer.parseInt(mes)) + " - " + cal.get(Calendar.YEAR));
		}

		swipeToElement(btnMesTransacao, Direction.DOWN, 2);
		btnAcessarTransacoes.click();

		elementExists(txtPesquisaCompraMilhas, 10);
		btnTransacaoEspecifica.click();
	}

	public String tratarValoresMonetariosParaValidacaoGetAllTransactions(String valor) throws Exception {

		logger.debug("Início do tratamento dos valores monetários.");
		
		if(Strings.isNullOrEmpty(valor))
			logger.info("Valor recebido para tratamento esta nulo ou vazio");
		
		valor = valor.replace(",", ".");

		valor = valor.replace(".00", "");

		if (valor.contains(".")) {

			int posicao = valor.indexOf('.') + 2;
			String validador = valor.substring(posicao, posicao + 1);
			if (validador.equals("0")) {
				valor = valor.substring(0, valor.length() - 1);
			}
		}

		logger.debug("Fim do tratamento dos valores monetários.");

		return valor;
	}

	public void fecharModalAvaliacaoApp() throws ElementFindException {

		logger.debug("Início fechamento modal avaliação do app");

		if (elementExists(msgAvaliacaoApp, 10)) {
			btnLembrarDepois.click();
		}

		logger.debug("Fim fechamento modal avaliação do app");
	}

	public void retonarDataFormatoFrameValidations() {

		logger.debug("Início do armazenamento das datas");

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//		sdf.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
		sdf.setTimeZone(TimeZone.getTimeZone("GMT-03:00"));

		Calendar data = Calendar.getInstance();

		Calendar startTransacao = data;
		startTransacao.add(Calendar.SECOND, -120);
		String start = sdf.format(startTransacao.getTime());

		Calendar endTransacao = startTransacao;
		endTransacao.add(Calendar.SECOND, +240);
		String end = sdf.format(endTransacao.getTime());

		getCv_().setStartDateTransacao(start);

		getCv_().setEndDateTransacao(end);

		System.out.println(start);
		System.out.println(end);

		logger.debug("Fim do armazenamento das datas.");
	}

	public void fecharModalVoucher() throws ElementFindException {

		logger.debug("Verifica se modal de voucher para compra de milhas é exibido");

		if (elementExists(lblVoucherMilhas, 5)) {
			logger.debug("Voucher de compra exibido");
			btnFecharModalVoucher.click();
			logger.debug("Voucher de compra fechado com sucesso");
		}
		if (elementExists(btnFecharCategoria, 5)) {
			logger.debug("Tela de cateogira exibida");
			btnFecharCategoria.click();
			logger.debug("Categoria fechado com sucesso");
		} else {
			logger.debug("Modal de voucher não foi exibido");
		}
	}

	public void fecharModalBilheteEmitido() throws GenericException, Exception {

		logger.debug("Verifica se modal de voucher para compra de milhas é exibido");

		if (elementExists(btnFecharModalEmissao, 10)) {
			logger.debug("Modal de bilhete emitido com sucesso exibido");
			logger.takeScreenShot("Modal de bilhete emitido com sucesso exibido", this);
			btnFecharModalEmissao.click();
			logger.debug("Modal de bilhete emitido com sucesso, fechado com sucesso");
		} else {
			logger.takeScreenShot("Modal de bilhete emitido com sucesso não foi exibido", this);
			logger.debug("Modal de bilhete emitido com sucesso não foi exibido");
		}
	}

	public void fecharModalGeolocalizacao() throws GenericException, Exception {

		if (elementExists(txtGeolocalizacao, 10)) {
			logger.debug("Pop-up Geolocalização exibido");
			logger.takeScreenShot("Pop-up Geolocalização exibido", this);
			btnCancelarGeolocalizacao.click();
			logger.debug("Pop-up Geolocalização fechado");
		} else {
			logger.debug("Pop-up Geolocalização não exibido");
		}
	}

	public void verificarModal() throws ElementFindException {

		if (elementExists(modalTransicaoPaginas, 4)) {

			for (int contador = 0; contador < 4000; contador++) {

				logger.debug("Modal sendo apresentado.");

				if (!elementExists(modalTransicaoPaginas, 4)) {
					contador = 4000;
					logger.debug("Modal fechou.");
				}
			}
		}
	}

	public void swipeQtdDeterminada(int qtdDeVezes) throws Exception {

		for (int contador = 1; contador <= qtdDeVezes; contador++) {

			swipe(Direction.LEFT, 4000);
			logger.debug("Procurando clube desejado.");
		}
	}

	public String somarValoresReais2parametros(String valor1, String valor2) throws Exception {
        
        String v1 = valor1.replace(".", "").replace(",", ".");
        String v2 = valor2.replace(".", "").replace(",", ".");
        double v1Convertido = Double.parseDouble(v1);
        double v2Convertido = Double.parseDouble(v2);
        double soma = (v1Convertido + v2Convertido);
        DecimalFormat df = new DecimalFormat("0.00");
        String somaConvertida = df.format(soma);
        
        return somaConvertida.replace(".", ",");
    }

	public String somarValoresReais3Parametros(String valor1, String valor2, String valor3) throws Exception {

		String v1 = valor1.replace(",", ".");
		String v2 = valor2.replace(",", ".");
		String v3 = valor3.replace(",", ".");

		double v1Convertido = Double.parseDouble(v1);
		double v2Convertido = Double.parseDouble(v2);
		double v3Convertido = Double.parseDouble(v3);
		double soma = v1Convertido + v2Convertido + v3Convertido;

		DecimalFormat df = new DecimalFormat("0.00");
		String somaConvertida = df.format(soma);

		return somaConvertida;
	}

	public String somarMilhas(String valorTarifaMilhas, String valorTaxaMilhas) throws Exception {
		double tarifa = Double.parseDouble(valorTarifaMilhas);
		double taxa = Double.parseDouble(valorTaxaMilhas);
		Double soma = (tarifa + taxa);
		DecimalFormat df = new DecimalFormat("0.000");
		String somaConvertida = df.format(soma);

		return somaConvertida.replace(",", ".");
	}

	public String retornarDescontoEmMilhasAdesaoClube(String valorTarifaClubeMilhas, String valorTarifaSmiles)
			throws Exception {
		int tarifaClube = Integer.parseInt(valorTarifaClubeMilhas.replace(".", ""));
		int tarifaSmiles = Integer.parseInt(valorTarifaSmiles.replace(".", ""));
		int desconto = (tarifaSmiles - tarifaClube);

		String totalConvertida = String.valueOf(desconto);
		StringBuilder totalStringBuilder = new StringBuilder(totalConvertida);
		if (totalConvertida.length() >= 4) {
			totalStringBuilder.insert(totalConvertida.length() - 3, '.');
		}

		return totalStringBuilder.toString();

	}

	public String retornarDescontoEmMilhasVoucher(String valorDesconto, String valorTarifaSmiles) throws Exception {
		int tarifaClube = Integer.parseInt(valorDesconto.replace(".", ""));
		int tarifaSmiles = Integer.parseInt(valorTarifaSmiles.replace(".", ""));
		int desconto = (tarifaSmiles - tarifaClube);

		String totalConvertida = String.valueOf(desconto);
		StringBuilder totalStringBuilder = new StringBuilder(totalConvertida);
		if (totalConvertida.length() >= 4) {
			totalStringBuilder.insert(totalConvertida.length() - 3, '.');
		}

		return totalStringBuilder.toString();

	}

	public String retornarDescontoEmMilhasTetoDiamante(String valorTarifa, String valorTetoDiamante) throws Exception {
		int tarifa = Integer.parseInt(valorTarifa.replace(".", ""));
		int tetoDiamante = Integer.parseInt(valorTetoDiamante.replace(".", ""));
		int desconto = (tarifa - tetoDiamante);

		String totalConvertida = String.valueOf(desconto);
		StringBuilder totalStringBuilder = new StringBuilder(totalConvertida);
		if (totalConvertida.length() >= 4) {
			totalStringBuilder.insert(totalConvertida.length() - 3, '.');
		}

		return totalStringBuilder.toString();

	}

	public String retornarValorTotalAPagarMilhasComDescontoAdesaoClube(String valorTarifaMilhas, String valorTaxaMilhas,
			String valorDescontoMilhasAdesaoClube) throws Exception {
		int tarifa = Integer.parseInt(valorTarifaMilhas.replace(".", ""));
		int taxa = Integer.parseInt(valorTaxaMilhas.replace(".", ""));
		int valorDesconto = Integer.parseInt(valorDescontoMilhasAdesaoClube.replace(".", ""));
		int total = (tarifa + taxa) - valorDesconto;
		String totalConvertida = String.valueOf(total);
		StringBuilder totalStringBuilder = new StringBuilder(totalConvertida);
		if (totalConvertida.length() >= 4) {
			totalStringBuilder.insert(totalConvertida.length() - 3, '.');
		}

		return totalStringBuilder.toString();
	}

	public String retornarValorTotalAPagarMilhasComDescontoAdesaoClubeCongenere(String valorTarifaMilhas,
			String valorDescontoMilhasAdesaoClube) throws Exception {
		int tarifa = Integer.parseInt(valorTarifaMilhas.replace(".", ""));
		int valorDesconto = Integer.parseInt(valorDescontoMilhasAdesaoClube.replace(".", ""));
		int total = tarifa - valorDesconto;
		String totalConvertida = String.valueOf(total);
		StringBuilder totalStringBuilder = new StringBuilder(totalConvertida);
		if (totalConvertida.length() >= 4) {
			totalStringBuilder.insert(totalConvertida.length() - 3, '.');
		}

		return totalStringBuilder.toString();
	}

	public String retornarValorTotalAPagarMilhasComDescontoTetoDiamante(String valorTarifaMilhas,
			String valorTaxaMilhas, String valorDescontoMilhasTetoDiamante) throws Exception {
		int tarifa = Integer.parseInt(valorTarifaMilhas.replace(".", ""));
		int taxa = Integer.parseInt(valorTaxaMilhas.replace(".", ""));
		int valorDesconto = Integer.parseInt(valorDescontoMilhasTetoDiamante.replace(".", ""));
		int total = (tarifa + taxa) - valorDesconto;
		String totalConvertida = String.valueOf(total);
		StringBuilder totalStringBuilder = new StringBuilder(totalConvertida);
		if (totalConvertida.length() >= 4) {
			totalStringBuilder.insert(totalConvertida.length() - 3, '.');
		}

		return totalStringBuilder.toString();
	}

	public String tratarValoresSomaTipoDouble(String valor) throws Exception {

		logger.debug("Início do tratamento dos valores monetários.");

		if (valor.contains(".")) {

			valor = valor.replace(".", ",");

			String[] separador = valor.split(",");

			int qtdCasasDecimais = separador[1].length();

			if (qtdCasasDecimais == 1) {

				if (separador[1].equals("0")) {
					valor = valor.replace(",0", "");
				}
			}

			valor = valor.replace(",", ".");
		}

		logger.debug("Fim do tratamento dos valores monetários.");

		return valor;
	}
	
	public String tratarValorMonetario(String value) {
		Locale ptBr = new Locale("pt", "BR");
		return NumberFormat.getCurrencyInstance(ptBr).format(Double.parseDouble(value)).replace("R$", "").trim();
	}

	public void getMilhasUser() throws ElementFindException, JSONException {
		getCv_().setUserMilhas(getProtonMemberInfoQtdMilhas(getCv_().getNumeroSmilesUsuarioLogado()));
		logger.info("MILHAS: " + getCv_().getUserMilhas());
//		getCv_().setUserMilhas(Proton.getMemberInfo(getCv_().getNumeroSmilesUsuarioLogado()).get("MILHAS").toString());
	}

	public static String getMonthEn(int month) {
		String[] monthNames = { "", "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		return monthNames[month];
	}

	public String returnTextRegex(String regex, String text) {
		String word = null;
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		while (m.find()) {
			word = m.group().replace("milhas", "");
		}
		return word;
	}

	public String returnTextRegexAll(String regex, String text) {
		String word = null;
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		while (m.find()) {
			word = m.group();
		}
		return word;
	}

	/**
	 * O metodo realiza um swipe mediante a porcentagem do tamanho da tela, ele
	 * possui um contador caso queira repetir a quantidade de swipess.
	 * 
	 * @param start
	 * @param end
	 * @param middle
	 * @param count
	 * @throws GenericException
	 */
	@SuppressWarnings("rawtypes")
	public void swipeVertical(PageBase page, double start, double end, double middle, int count)
			throws GenericException {

//		AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) this.getController().getDriver_();

		DefaultBaseController baseController = page.getController();
		AndroidDriver<MobileElement> driver = ((AndroidController) baseController).getDriver();

		Dimension size = driver.manage().window().getSize();

		int i = 0;

		int starty = (int) (size.height * start);
		int endy = (int) (size.height * end);
		int middlex = (int) (size.width / middle);

		if (count < 1) {
			count = 1;
		}

		while (i < count) {

			new TouchAction(driver).press(PointOption.point(middlex, starty))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
					.moveTo(PointOption.point(middlex, endy)).release().perform();

			sleep(3);
			i++;
		}
	}

	@SuppressWarnings({ "rawtypes", "static-access", "unchecked" })
	public void closeKeyBoard() throws GenericException {
		AndroidDriver<MobileElement> driver = (AndroidDriver) this.getController().getDriver_();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	public String geraCPF() throws Exception {

		int digito1 = 0, digito2 = 0, resto = 0;
		String nDigResult;
		String numerosContatenados;
		String numeroGerado;

		Random numeroAleatorio = new Random();

		// numeros gerados
		int n1 = numeroAleatorio.nextInt(10);
		int n2 = numeroAleatorio.nextInt(10);
		int n3 = numeroAleatorio.nextInt(10);
		int n4 = numeroAleatorio.nextInt(10);
		int n5 = numeroAleatorio.nextInt(10);
		int n6 = numeroAleatorio.nextInt(10);
		int n7 = numeroAleatorio.nextInt(10);
		int n8 = numeroAleatorio.nextInt(10);
		int n9 = numeroAleatorio.nextInt(10);

		int soma = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

		int valor = (soma / 11) * 11;

		digito1 = soma - valor;

		// Primeiro resto da divisão por 11.
		resto = (digito1 % 11);

		if (digito1 < 2) {
			digito1 = 0;
		} else {
			digito1 = 11 - resto;
		}

		int soma2 = digito1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

		int valor2 = (soma2 / 11) * 11;

		digito2 = soma2 - valor2;

		// Primeiro resto da divisão por 11.
		resto = (digito2 % 11);

		if (digito2 < 2) {
			digito2 = 0;
		} else {
			digito2 = 11 - resto;
		}

		// Conctenando os numeros
		numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4)
				+ String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) + String.valueOf(n8)
				+ String.valueOf(n9);

		// Concatenando o primeiro resto com o segundo.
		nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

		numeroGerado = numerosContatenados + nDigResult;

		System.out.println("CPF Gerado " + numeroGerado);

		return numeroGerado;

	}// fim do metodo geraCPF

	public String gerarRg() throws Exception {

		String numerosContatenados;
		String numeroGerado;

		Random numeroAleatorio = new Random();

		// numeros gerados
		int n1 = numeroAleatorio.nextInt(10);
		int n2 = numeroAleatorio.nextInt(10);
		int n3 = numeroAleatorio.nextInt(10);
		int n4 = numeroAleatorio.nextInt(10);
		int n5 = numeroAleatorio.nextInt(10);
		int n6 = numeroAleatorio.nextInt(10);
		int n7 = numeroAleatorio.nextInt(10);
		int n8 = numeroAleatorio.nextInt(10);
		int n9 = numeroAleatorio.nextInt(10);

		// Conctenando os numeros
		numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4)
				+ String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) + String.valueOf(n8)
				+ String.valueOf(n9);

		numeroGerado = numerosContatenados;

		return numeroGerado;
	}

	public String receberRG() throws Exception {

		String resultadoRG = gerarRg();

		return resultadoRG;
	}

	public String receberCPF() throws Exception {

		String resultadoCPF = geraCPF();

		return resultadoCPF;
	}

	public String escolherGenero() {
		String[] genero = { "Masculino", "Feminino" };
		Random r = new Random();
		int randomNumber = r.nextInt(genero.length);
		return genero[randomNumber];
	}
}
