package usefulMethods;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ElementExistsCheck {
	private WebDriver driver;
	
	public ElementExistsCheck(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean checkElementExists(String type, String value) {
		List<WebElement> elements;
		
		elements = driver.findElements(By.id(value));
		if (elements.size() > 0) {
			System.out.print("id ");
			return true;
		}
		
		elements = driver.findElements(By.className(value));
		if (elements.size() > 0) {
			System.out.print("className ");
			return true;
		}
		
		elements = driver.findElements(By.cssSelector(value));
		if (elements.size() > 0) {
			System.out.print("cssSelector ");
			return true;
		}
		
		elements = driver.findElements(By.linkText(value));
		if (elements.size() > 0) {
			System.out.print("linkText ");
			return true;
		}
		
		elements = driver.findElements(By.partialLinkText(value));
		if (elements.size() > 0) {
			System.out.print("partialLinkText ");
			return true;
		}
		
		elements = driver.findElements(By.name(value));
		if (elements.size() > 0) {
			System.out.print("name ");
			return true;
		}
		
		elements = driver.findElements(By.tagName(value));
		if (elements.size() > 0) {
			System.out.print("tagName ");
			return true;
		}
		
		elements = driver.findElements(By.xpath(value));
		if (elements.size() > 0) {
			System.out.print("xpath ");
			return true;
		}
		
		return false;
	}
	
}
