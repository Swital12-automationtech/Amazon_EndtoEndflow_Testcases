package packageofamazonproject.Amazon_Project_Gtm;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(Listner.class)

public class Testcase2_LoginWithValidCred extends LaunchQuit {
	@Test(retryAnalyzer = IRetry_Logic.class)
	
	public void login_validcredentials() throws EncryptedDocumentException, IOException {
		HomePage homepage = new HomePage(driver);
		homepage.hoverover(driver);
		homepage.signin();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.un();
		loginpage.ctn();
		loginpage.pwd();
		loginpage.signbtn();
		loginpage.loginvalidation(driver);
	}
}
