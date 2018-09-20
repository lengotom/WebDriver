package testcases;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class First {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOMLEN\\selenium\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\TOMLEN\\selenium\\IEDriverServer64.exe");
	
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());	
		driver.close();
		
		driver = new FirefoxDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("https://gmail.com");
		driver.manage().window().maximize();
		String actual_title = driver.getTitle();
		
		String expected_title = "Gmail";	
		if (actual_title.equals(expected_title)) System.out.println("pass");
		else System.out.println("fail");		
		driver.close();
		
	}
}
