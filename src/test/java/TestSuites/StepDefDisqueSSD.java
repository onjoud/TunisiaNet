package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.DisqueSSDPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefDisqueSSD {
	
	@Given("utilisateur est sur la page de disque SSD")
	public void utilisateur_est_sur_la_page_de_disque_ssd() throws Exception {
		Config.driver=new ChromeDriver();
		Config.maximazeWindow();
		Config.driver.get(Utils.getproprety("Disque_SSD_Link"));
		
	  
	}

	@When("clique sur le produit {string}")
	public void clique_sur_le_produit(String productName) {
		
		DisqueSSDPage produit= new DisqueSSDPage();
		produit.cliquerSurProduit(productName);
		
		
	    
	}

	@Then("utilisateur se dérige vers la page de produitcommandee {string}")
	public void utilisateur_se_dérige_vers_la_page_de_produitcommandee(String verifname) {
		DisqueSSDPage produit= new DisqueSSDPage();
		produit.veriPage(verifname);
		
	    
	}

	@Then("utilisateur verife que le produit est disponible")
	public void utilisateur_verife_que_le_produit_est_disponible() {
		DisqueSSDPage produit= new DisqueSSDPage();
		produit.verifDisponibiliteeProduit();
	 
	}
	
	@Then("utilisateur ajouter le produit dans le panier ajouter au panier")
	public void utilisateur_ajouter_le_produit_dans_le_panier_ajouter_au_panier() {
		DisqueSSDPage produit= new DisqueSSDPage();
		produit.ajoutPanier();
	    
	}

	@Then("utilisateur clique sur le bouton commander")
	public void utilisateur_clique_sur_le_bouton_commander() {
		DisqueSSDPage produit= new DisqueSSDPage();
		produit.commanderproduit();
	}

	@Then("utilisateur se dériger vers la page de prduit comandee {string}")
	public void utilisateur_se_dériger_vers_la_page_de_prduit_comandee(String verif) {
		DisqueSSDPage produit= new DisqueSSDPage();
		produit.verificationCommande(verif);
	}

}
