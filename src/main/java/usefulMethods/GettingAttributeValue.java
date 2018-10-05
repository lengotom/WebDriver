package usefulMethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class GettingAttributeValue {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new HtmlUnitDriver();
		baseURL = "https://learn.letskodeit.com/p/practice";
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test1LetsKodeIt() throws InterruptedException {
		driver.get(baseURL);
		WebElement element = driver.findElement(By.id("name"));
		String value;
		String attName;
		
		
		attName = "id";
		value = element.getAttribute(attName);
		System.out.println("Value of attribute " + attName + " is: " + value);
		
		attName = "name";
		value = element.getAttribute(attName);
		System.out.println("Value of attribute " + attName + " is: " + value);
		
		attName = "class";
		value = element.getAttribute(attName);
		System.out.println("Value of attribute " + attName + " is: " + value);
		
		attName = "placeholder";
		value = element.getAttribute(attName);
		System.out.println("Value of attribute " + attName + " is: " + value);
		
		attName = "type";
		value = element.getAttribute(attName);
		System.out.println("Value of attribute " + attName + " is: " + value);		
	}
}