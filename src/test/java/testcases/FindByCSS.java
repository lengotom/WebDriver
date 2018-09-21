package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindByCSS {
	
	static String startURL = "https://test-web-sql.azurewebsites.net/";
	
	public static void main(String [] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOMLEN\\selenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
				
		
		Thread thread1 = new Thread() {
		    public void run() {
		    	try {
					doThings(new ChromeDriver(), 1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		};

		Thread thread2 = new Thread() {
		    public void run() {
		    	try {
					doThings(new FirefoxDriver(), 2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		};

		// Start tests on browsers.
		thread1.start();
		thread2.start();

		// Wait for them both to finish
		thread1.join();
		thread2.join();
		
	}

	public static void doThings(WebDriver driver, int browser) throws InterruptedException {
		int width = 1920;
		int height = 1080;
		if (browser == 1) driver.manage().window().setPosition(new Point(0, 0));
		else if (browser == 2) driver.manage().window().setPosition(new Point(width/2, 0));		
		driver.manage().window().setSize(new Dimension(width/2, height));
		
		common(driver, true);
		
	}
	
	public static void doThings(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
		
		common(driver, false);
	}
	
	private static void common (WebDriver driver, boolean browsers) throws InterruptedException {
		driver.get(startURL);
		WebDriverWait wait = new WebDriverWait(driver, 10);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("centraladmin");
		driver.findElement(By.id("password")).sendKeys("centraladmin" + Keys.ENTER);
		if (browsers == true)
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn mobile-nav__hamburger___KZqdv']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Search"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.form-control"))).sendKeys("test");
		Thread.sleep(3000);
		driver.close();
	}

	
}
