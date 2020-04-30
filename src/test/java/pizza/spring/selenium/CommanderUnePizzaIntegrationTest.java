package pizza.spring.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CommanderUnePizzaIntegrationTest {
	private WebDriver webDriver;

	@Before
	public void createWebDriver() {
		webDriver = new ChromeDriver();
	}

	@After
	public void closeWebDriver() {
		webDriver.quit();
	}

	@Test
	public void commanderUnePizza() throws Exception {
  
		ResultPage resultPage = HomePage.openWith(webDriver)
										.commanderPizza()
				                        .enterKeywords("nom","Maxime")
				                        .enterKeywords("telephone","0208974852")
				                        .clickOnCommander();

	
		assertTrue(resultPage.isCommandeReussie());
	}

}


