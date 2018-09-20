package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectingById {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TOMLEN\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String startURL = "http://www.google.com";
		driver.get(startURL);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lst-ib"))).sendKeys("letskodeit", Keys.RETURN);
//		driver.findElement(By.name("q")).sendKeys("letskodeit", Keys.RETURN);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		Thread.sleep(2000);
//		driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Selenium Webdriver Tutorial"))).click();
//		driver.findElement(By.linkText("Let's Kode It | Selenium Webdriver Tutorial | Rest API Tutorial")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("comp-jgmoxws4"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Login"))).click();
		
//		driver.close();
		
	}
}
