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

public class CommanderSansTéléphoneIntegrationTest {
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
  
		WebElement searchSelect = webDriver.findElement(By.id("pizzaId"));
		new Select(searchSelect).deselectByIndex(0);
		ResultPage resultPage = HomePage.openWith(webDriver)
				                        .enterKeywords("nom","Maxime")
				                        .clickOnCommander();

	
		assertTrue(resultPage.isCommandeEchoueTelephone());
	}

}
