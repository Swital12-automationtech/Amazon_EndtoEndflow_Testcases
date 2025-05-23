package packageofamazonproject.Amazon_Project_Gtm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners()
public class LaunchQuit extends Listner
{
//	WebDriver driver;
	@BeforeMethod()
	public void launch()
	{
		
		driver = new ChromeDriver();
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
