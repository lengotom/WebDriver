package usefulMethods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	
	private WebDriver driver;
	
	public GenericMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getElement(String type, String locator) {
			
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Returning element by id = " + locator);
			return driver.findElement(By.id(locator));
		}
		else if (type.equals("class")) {
			System.out.println("Returning element by className = " + locator);
			return driver.findElement(By.className(locator));
		}
		else if (type.equals("css")) {
			System.out.println("Returning element by cssSelector = " + locator);
			return driver.findElement(By.cssSelector(locator));
		}
		else if (type.equals("link")) {
			System.out.println("Returning element by linkText = " + locator);
			return driver.findElement(By.linkText(locator));
		}
		else if (type.equals("name")) {
			System.out.println("Returning element by name = " + locator);
			return driver.findElement(By.name(locator));
		}
		else if (type.equals("partial")) {
			System.out.println("Returning element by partialLinkText = " + locator);
			return driver.findElement(By.partialLinkText(locator));
		}
		else if (type.equals("tag")) {
			System.out.println("Returning element by tagName = " + locator);
			return driver.findElement(By.tagName(locator));
		}
		else if (type.equals("xpath")) {
			System.out.println("Returning element by xpath = " + locator);
			return driver.findElement(By.xpath(locator));
		}
		else {
			System.out.println("Type not supported");
			return null;
		}
	}
	
	public List<WebElement> getElementList(String type, String locator){
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Returning list of elements by id = " + locator);
			return driver.findElements(By.id(locator));
		}
		else if (type.equals("class")) {
			System.out.println("Returning list of elements by className = " + locator);
			return driver.findElements(By.className(locator));
		}
		else if (type.equals("css")) {
			System.out.println("Returning list of elements by cssSelector = " + locator);
			return driver.findElements(By.cssSelector(locator));
		}
		else if (type.equals("link")) {
			System.out.println("Returning list of elements by linkText = " + locator);
			return driver.findElements(By.linkText(locator));
		}
		else if (type.equals("name")) {
			System.out.println("Returning list of elements by name = " + locator);
			return driver.findElements(By.name(locator));
		}
		else if (type.equals("partial")) {
			System.out.println("Returning list of elements by partialLinkText = " + locator);
			return driver.findElements(By.partialLinkText(locator));
		}
		else if (type.equals("tag")) {
			System.out.println("Returning list of elements by tagName = " + locator);
			return driver.findElements(By.tagName(locator));
		}
		else if (type.equals("xpath")) {
			System.out.println("Returning list of elements by xpath = " + locator);
			return driver.findElements(By.xpath(locator));
		}
		else {
			System.out.println("Type not supported");
			return null;
		}
	}
	
	public boolean elementExists(String type, String locator) {
		List<WebElement> list = getElementList(type, locator);
		if (list.size() > 0) {
			System.out.println("Element with " + type.toLowerCase() + " = " + locator + " is present");
			return true;
		} 
		System.out.println("No such element with " + type.toLowerCase() + " = " + locator);
		return false;
	}
	
	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("Waiting for max " + timeout + " seconds for visibility of element");
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("Element is visible on page");
		} catch (Exception e) {
			System.out.println("Element is not visible on page");
		}
		return element;
	}
	
	public void clickWhenReady(By locator, int timeout) {
		try {
			System.out.println("Waiting for max " + timeout + " seconds for element to click");
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
			System.out.println("Element clicked");
		} catch (Exception e) {
			System.out.println("It is not possible to click the element");
		}
	}
}
