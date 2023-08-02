package parallelRun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeBrowser {

	@Test
    public void edgeBrowser() {
	
	//launch the browser
	System.setProperty("webdriver.edge.driver", "./driverFile/msedgedriver.exe");
	EdgeDriver driver = new EdgeDriver();
	
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
