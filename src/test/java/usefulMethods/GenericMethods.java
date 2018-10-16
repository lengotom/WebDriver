/*********************************************************************************************************************************************
 * useless bullshit for finding elements, makes finding more error prone, doesn't speed up things
 * only thing that it might me useful for is writing custom methods that use find
 ********************************************************************************************************************************************/




package usefulMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {
	private WebDriver driver;
	
	public GenericMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		
		if (type.equals("id")) {
			System.out.println("Element found with id: " + locator + " " + driver.findElement(By.id(locator)));
			return driver.findElement(By.id(locator));
		}
		else if (type.equals("className")) {
			System.out.println("Element found with className: " + locator);
			return driver.findElement(By.className(locator));
		}
		else if (type.equals("cssSelector")) {
			System.out.println("Element found with cssSelector: " + locator);
			return driver.findElement(By.cssSelector(locator));
		}
		else if (type.equals("linkText")) {
			System.out.println("Element found with linkText: " + locator);
			return driver.findElement(By.linkText(locator));
		}
		else if (type.equals("partialLinkText")) {
			System.out.println("Element found with partialLinkText: " + locator);
			return driver.findElement(By.partialLinkText(locator));
		}
		else if (type.equals("name")) {
			System.out.println("Element found with name: " + locator);
			return driver.findElement(By.name(locator));
		}
		else if (type.equals("tagName")) {
			System.out.println("Element found with tagName: " + locator);
			return driver.findElement(By.tagName(locator));
		}
		else if (type.equals("xpath")) {
			System.out.println("Element found with xpath: " + locator);
			return driver.findElement(By.xpath(locator));
		}
		else {
			System.out.println("Locator type not supported.");
			return null;
		}
	}
}