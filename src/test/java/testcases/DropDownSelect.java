package testcases;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {
	WebDriver driver;
	String baseURL;
		
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		baseURL = "https://learn.letskodeit.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		sel.selectByValue("honda");
		Thread.sleep(500);
		sel.selectByIndex(1);
		Thread.sleep(500);
		sel.selectByVisibleText("BMW");
		Thread.sleep(500);
		List<WebElement> list = sel.getOptions();
		Thread.sleep(500);
		
		for (WebElement li: list) {
			System.out.println(li.getText());
		}
		
		element = driver.findElement(By.id("multiple-select-example"));
		sel = new Select(element);
		sel.selectByIndex(0);
		Thread.sleep(500);
		sel.selectByValue("peach");
		Thread.sleep(500);
		
		list = sel.getOptions();
		System.out.println("Multiselect all options" );
		for (WebElement li: list) {
			System.out.println(li.getText());
		}
		
		list = sel.getAllSelectedOptions();
		System.out.println("Multiselect all selected options" );
		for (WebElement li: list) {
			System.out.println(li.getText());
		}

		sel.deselectAll();
	

	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(500);
		driver.quit();
	}

}