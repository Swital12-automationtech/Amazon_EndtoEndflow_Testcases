package packageofamazonproject.Amazon_Project_Gtm;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner.class)

public class Testcase4_EditProfiles extends LaunchQuit {
	@Test(retryAnalyzer = IRetry_Logic.class)
	public void manage_profiles() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
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
		profile.youracclink();
		profile.profilelink();
		profile.editprofile();
		profile.updateprofilename();
	}
}
