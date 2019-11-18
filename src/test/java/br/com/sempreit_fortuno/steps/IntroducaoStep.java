package br.com.sempreit_fortuno.steps;

import static br.com.smiles.base.DefaultBaseController.getPage_;

import br.com.sempreit_fortuno.pages.HomeActivity;
import br.com.sempreit_fortuno.pages.IntroducaoActivity;
import cucumber.api.java.pt.Dado;

public class IntroducaoStep {
	
	
	HomeActivity home = getPage_(HomeActivity.class);
	IntroducaoActivity intro = getPage_(IntroducaoActivity.class);
	
	
	@Dado("que é o primeiro acesso do usuário")
	public void primeiroAcessoNoApp() throws Exception{
		intro.telaDePrimeiroAcesso();
	}
	
	
	

}
