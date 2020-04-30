package pizza.spring.selenium;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HomePage {

	private WebDriver webDriver;

	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public HomePage open() {
		webDriver.navigate().to("http://localhost:8080/pizza-spring/commande");
		//assertTrue("Titre de page inattendu " + webDriver.getTitle(), webDriver.getTitle().startsWith("PizzaSpring"));
		return this;
	}

	public static HomePage openWith(WebDriver webDriver) {
		HomePage homePage = new HomePage(webDriver);
		homePage.open();
		return homePage;
	}

	public HomePage enterKeywords(String name,String... words) {
		WebElement searchInput = webDriver.findElement(By.name(name));
		searchInput.sendKeys(String.join(" ", words));
		return this;
	}

	public ResultPage clickOnCommander() {
		WebElement searchButton = webDriver.findElement(By.id("btnCommander"));
		searchButton.click();
		return new ResultPage(webDriver);
	}
	public HomePage commanderPizza() {
		WebElement pizzaSelector = webDriver.findElement(By.id("pizzaId"));
        new Select(pizzaSelector).selectByIndex(0);
		return this;
	}
}
