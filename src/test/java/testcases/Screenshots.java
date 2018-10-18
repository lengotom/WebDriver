package testcases;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshots {
	WebDriver driver;
	String baseURL;
	Logger logger;
	
	@Before
	public void setUp() {
	  
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws Exception {
		long time = System.currentTimeMillis();
		
		String fileName = "screenshot" + time + ".jpg";
		String directory = "C:\\Users\\TOMLEN\\eclipse-workspace\\WebDriverTestingMVN\\screenshots\\";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory, fileName));
		driver.quit();
		
		Date date = new Date(time);
		DateFormat formatter = new SimpleDateFormat("HH:mm:ss.SSS");
		formatter.setTimeZone(TimeZone.getTimeZone("Europe/Warsaw"));
		String dateFormatted = formatter.format(date);
		System.out.println(dateFormatted);
		
		
	}

	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.id("search-button-hp-package")).click();
		
	
	

	}
}