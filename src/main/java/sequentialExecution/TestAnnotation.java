package sequentialExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAnnotation {
	@Test
    public void ChromeBrowser() {
	
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//load the URL
	driver.get("https://letcode.in/");
	
	//add Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//close the browser
	driver.quit();
}
	
}
