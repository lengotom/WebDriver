import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByTag {
public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TOMLEN\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String startURL = "https://demostore.x-cart.com/";
		driver.get(startURL);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
	}

}
