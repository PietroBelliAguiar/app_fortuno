package br.com.sempreit_fortuno.bean;

import br.com.smiles.funcionalidades.RequestgetAllTransactions;
import enums.ProductName;
import enums.TipoRequestParametro;
import pojos.GetAllTransactions;
import pojos.LoyTransaction;

public class Executor {

	public static void main(String[] args) throws Exception {
		RequestgetAllTransactions request = new RequestgetAllTransactions();
		GetAllTransactions get = request.requestGetAllTransaction(TipoRequestParametro.Request_PNR, "RNQERT",
				"117176673", ProductName.NaoSeAplica, "", "");
		int tamanho = get.getBody().getGetAllTransactionsBody().getListOfGolLoyTransactionListIo().getLoyTransaction()
				.size();
		for (int contador = 0; contador < tamanho; contador++) {

			LoyTransaction dadosTransaco = get.getBody().getGetAllTransactionsBody().getListOfGolLoyTransactionListIo()
					.getLoyTransaction().get(contador);

			System.out.println(dadosTransaco.getProductName() + " milhas = " + dadosTransaco.getAmount() + " Status ="
					+ dadosTransaco.getStatus());
		}
	}
}
