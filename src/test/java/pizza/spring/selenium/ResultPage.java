package pizza.spring.selenium;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {

	private WebDriver webDriver;

	public ResultPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public boolean isLinkPresent(String link) {
		return ! webDriver.findElements(By.partialLinkText(link)).isEmpty();
	}
	public boolean isCommandeReussie() {
		return ! webDriver.findElements(By.id("recap-commande")).isEmpty();
	}
	public boolean isCommandeEchoueTelephone() {
		return ! webDriver.findElements(By.id("telephone.errors")).isEmpty();
	}
	public boolean isCommandeEchouePizza() {
		return ! webDriver.findElements(By.id("pizzaId.errors")).isEmpty();
	}
}