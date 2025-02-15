package packageofamazonproject.Amazon_Project_Gtm;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
@Listeners()
public class LaunchQuit extends Listner
{
	
	@BeforeMethod()
	public void launch()
	{
		 EdgeOptions options = new EdgeOptions();
	        options.addArguments("--disable-gpu"); 
	        options.addArguments("--no-sandbox");
	        options.addArguments("--remote-debugging-port=9222");

	      //  WebDriver driver = new EdgeDriver(options);

		driver = new EdgeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quit() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
}
}
