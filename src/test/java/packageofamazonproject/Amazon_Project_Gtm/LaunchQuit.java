package packageofamazonproject.Amazon_Project_Gtm;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
@Listeners()
public class LaunchQuit extends Listner
{
	
	@BeforeMethod()
	public void launch()
	{
		driver = new EdgeDriver();
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
