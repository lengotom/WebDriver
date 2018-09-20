package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEissue {

	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver","C:\\Users\\TOMLEN\\selenium\\IEDriverServer64.exe");
		
//		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
//		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
//		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
//		caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
//		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		
		
		
//		@SuppressWarnings("deprecation")
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	Thread.sleep(4000);
		try {
			 Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			 Runtime.getRuntime().exec("taskkill /f /fi \"pid gt 0\" /im iexplore.exe");
		} catch (IOException e) {
			 e.printStackTrace();
		}
	}
}
