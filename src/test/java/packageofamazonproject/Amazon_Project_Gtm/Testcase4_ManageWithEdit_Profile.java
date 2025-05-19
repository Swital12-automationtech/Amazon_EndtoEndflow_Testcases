package packageofamazonproject.Amazon_Project_Gtm;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase4_ManageWithEdit_Profile extends LaunchQuit {
	@Test(retryAnalyzer = IRetry_Logic.class)
	public void manage_profiles() throws InterruptedException, EncryptedDocumentException, IOException, AWTException {
		HomePage homepage = new HomePage(driver);
		homepage.hoverover(driver);
		homepage.signin();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.un();
		loginpage.ctn();
		loginpage.pwd();
		loginpage.signbtn();

		homepage.hoverover(driver);

		UserProfilePage profile = new UserProfilePage(driver);
		profile.manageproflink();
		profile.viewlinkclick();
		profile.prferreddeptexpand();
		profile.adddepatment();
		profile.choosedepatment();
		profile.savedepatment();
	}
}
