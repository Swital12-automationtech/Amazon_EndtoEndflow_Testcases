package packageofamazonproject.Amazon_Project_Gtm;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner.class)

public class Testcase5_SearchProduct extends LaunchQuit {
	@Test(retryAnalyzer = IRetry_Logic.class)
	public void login_searchproduct() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
		HomePage homepage = new HomePage(driver);
		homepage.hoverover(driver);
		homepage.signin();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.un();
		loginpage.ctn();
		loginpage.pwd();
		loginpage.signbtn();

		homepage.searching();
		homepage.hoverover(driver);
		homepage.signout();
	}
}