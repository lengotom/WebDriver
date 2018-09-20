package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindingElements {
	public static void main(String [] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("lengotom");
		driver.findElement(By.id("identifierNext")).click();

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.name("password")).sendKeys("blabla");
		driver.findElement(By.id("passwordNext")).click();
		WebElement element = driver.findElement(By.className("LXRPh"));
		String wrongPass = element.getText();
		System.out.println(wrongPass);
		driver.close();
		

	}
	
	

}
