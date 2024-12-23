package Page;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class DisqueSSDPage {
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	List<WebElement> produit;
	@FindBy(xpath="//*[@id=\"stock_availability\"]/span")
	WebElement verifs;
	
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/h1")
	WebElement verifproduit;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
	WebElement panier;
	
	
	@FindBy(xpath="/html/body/div[8]/div/div/div/div[2]/div/div/a")
	WebElement commander;
	
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div/div/div[1]/div[2]/ul/li[2]/div/div[2]/div[1]/a")
	WebElement verifCommande;
	
	
	

	public DisqueSSDPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void cliquerSurProduit(String productName) {
		try {
		Config.attente(10);
		for(WebElement prod:produit) {
			if(prod.getText().contains(productName)) {
				prod.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void veriPage(String verifname) {
		Assert.assertEquals(verifproduit.getText(), verifname);
		
	}
	
	public void verifDisponibiliteeProduit() {
		Assert.assertEquals(verifs.getText(), "En stock");
	}
	
	public void ajoutPanier() {
		Config.attente(10);
		panier.click();
	}
	public void commanderproduit() {
		WebDriverWait wait = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(commander));
		commander.click();
		Config.attente(10);
		
	}
	public void verificationCommande(String productName) {
		Assert.assertEquals(productName, verifCommande.getText());
	}
	
	
	

}
