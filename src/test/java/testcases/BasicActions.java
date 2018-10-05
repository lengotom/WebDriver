package testcases;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {
	WebDriver driver;
	String baseURL;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		baseURL = "https://learn.letskodeit.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		System.out.println(driver.getTitle());
		String currentURL = driver.findElement(By.xpath("//a[@href='/sign_in']")).getAttribute("href");
//		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
	
		driver.get(currentURL);
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		System.out.println(driver.getCurrentUrl());
		
		
		
//		WebElement email = driver.findElement(By.xpath("//input[@id='user_email']"));
//		WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
//		email.sendKeys("test_user");
//		password.sendKeys("test_password");
//		Thread.sleep(500);
//		email.clear();
//		email.sendKeys("Correct_test_user");
//		password.clear();
//		password.sendKeys("test_password");	
		Thread.sleep(500);
		System.out.println(driver.getPageSource());

	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
