package pizza.spring.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommanderSansPizzaIntegrationTest {
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
				                        .enterKeywords("nom","Maxime")
				                        .enterKeywords("telephone","0208974852")
				                        .clickOnCommander();

	
		assertTrue(resultPage.isCommandeEchouePizza());
	}

}
