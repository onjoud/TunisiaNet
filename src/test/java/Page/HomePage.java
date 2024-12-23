package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]/span")
	List<WebElement> menues;
	
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li[3]/div[2]/div/div[1]/ul/li/a")
	List<WebElement> submenues;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div/div/nav/ol/li[4]/a/span")
	WebElement verif;
	
	@FindBy(id="search_query_top")
	WebElement recherche;
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/p")
	WebElement verifRecherche;
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void MouseHoverOnMenuAndClickOnSubmenu(String menuName, String submenuTitle) throws Exception {
		try {
		for(WebElement menu:menues) {
			if(menu.getText().contains(menuName)) {
				Config.actions= new Actions(Config.driver);
				Config.actions.moveToElement(menu).perform();
				Thread.sleep(6000);
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		         Config.attente(10);
		         try {
				for(WebElement submenu:submenues) {
					
					if(submenu.getText().contains(submenuTitle)) {
						System.out.println("test");
						submenu.click();
					}
				}
		         }catch (Exception e) {
					// TODO: handle exception
				}
	}
			
		
		
		

	
	public void verification(String name) {
		Config.attente(10);
		Assert.assertEquals(verif.getText(), name);
	}
	
	public void recherche(String nomproduit) {
		recherche.sendKeys(nomproduit+Keys.ENTER);
		
	}
	public void verifrech(String nomProduit) {
		Assert.assertTrue(verifRecherche.getText().contains(nomProduit));
	}
	
	
	}


