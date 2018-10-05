package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioBtnAndCheckboxes {
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
		System.out.println("first radio selected? = " + driver.findElement(By.id("bmwradio")).isSelected());
		driver.findElement(By.id("bmwradio")).click();
		System.out.println("after clicking");
		System.out.println("first radio selected? = " + driver.findElement(By.id("bmwradio")).isSelected());
		Thread.sleep(500);
		driver.findElement(By.id("benzradio")).click();
		Thread.sleep(500);
		driver.findElement(By.id("hondaradio")).click();
		Thread.sleep(500);		
		System.out.println("first checkbox selected? = " + driver.findElement(By.id("bmwcheck")).isSelected());
		System.out.println("second checkbox selected? = " + driver.findElement(By.id("benzcheck")).isSelected());
		System.out.println("third checkbox selected? = " + driver.findElement(By.id("hondacheck")).isSelected());
		driver.findElement(By.id("bmwcheck")).click();
		Thread.sleep(500);
		driver.findElement(By.id("benzcheck")).click();
		Thread.sleep(500);
		driver.findElement(By.id("hondacheck")).click();
		System.out.println("after clicking");
		System.out.println("first checkbox selected? = " + driver.findElement(By.id("bmwcheck")).isSelected());
		System.out.println("second checkbox selected? = " + driver.findElement(By.id("benzcheck")).isSelected());
		System.out.println("third checkbox selected? = " + driver.findElement(By.id("hondacheck")).isSelected());
	
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

}
