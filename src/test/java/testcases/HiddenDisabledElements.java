package testcases;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HiddenDisabledElements {
	WebDriver driver;
	JavascriptExecutor js;
	String baseURL1;
	String baseURL2;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		baseURL1 = "https://learn.letskodeit.com/p/practice";
		baseURL2 = "https://www.expedia.com/";
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
	@Test
	public void test1LetsKodeIt() throws InterruptedException {
		driver.get(baseURL1);
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		js.executeScript("window.scrollBy(0,200)");

		System.out.println("Textbox displayed? : " + textbox.isDisplayed());
		Thread.sleep(500);
		System.out.println("Click on \"Hide\"");
		driver.findElement(By.id("hide-textbox")).click();
		System.out.println("Textbox displayed? : " + textbox.isDisplayed());
		System.out.println("Textbox enabled? : " + textbox.isEnabled());
		Thread.sleep(500);
		
		
		System.out.println("Click on \"Show\"");
		driver.findElement(By.id("show-textbox")).click();
		System.out.println("Textbox displayed? : " + textbox.isDisplayed());
		System.out.println("Textbox enabled? : " + textbox.isEnabled());
		
	}
	
	@Test
	public void test2Expedia() {
		driver.get(baseURL2);
		WebElement childDropdown = driver.findElement(By.xpath("//label[@class='select icon icon-toggle180 col gcw-child-field']"));
		System.out.println("ChildDropdown displayed? : " + childDropdown.isDisplayed());
	}

}
