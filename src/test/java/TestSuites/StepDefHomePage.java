package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefHomePage {
	
	@Given("utilisateur est sur la page dacceuil")
	public void utilisateur_est_sur_la_page_dacceuil() throws Exception {
		Config.driver= new ChromeDriver();
		Config.maximazeWindow();
		Config.driver.get(Utils.getproprety("Web_Home_Link"));
	    
	}

	@When("utilisateur survole la souris sur le menu {string} et cliquer sur le sousmenu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu_et_cliquer_sur_le_sousmenu(String menuName, String submenuTitle) throws Exception {
		HomePage page=new HomePage();
		page.MouseHoverOnMenuAndClickOnSubmenu(menuName, submenuTitle);
	
	    
	}

	@Then("utilisateur se dérige vers la page de produit {string}")
	public void utilisateur_se_dérige_vers_la_page_de_produit(String name) {
		HomePage page=new HomePage();
		page.verification(name);
		
	    
	}
	
	@When("utilisateur cherche le produit {string}")
	public void utilisateur_cherche_le_produit(String nomProduit) {
		HomePage page=new HomePage();
		page.recherche(nomProduit);
	}

	@Then("utilisateur est dérigr vers la page de produit cherchee {string}")
	public void utilisateur_est_dérigr_vers_la_page_de_produit_cherchee(String nomProduit) {
		HomePage page=new HomePage();
		page.verifrech(nomProduit);
	}

}
