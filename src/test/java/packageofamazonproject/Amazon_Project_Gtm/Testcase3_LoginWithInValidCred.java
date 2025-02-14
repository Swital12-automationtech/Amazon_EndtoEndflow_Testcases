package packageofamazonproject.Amazon_Project_Gtm;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner.class)

public class Testcase3_LoginWithInValidCred extends LaunchQuit {
	@Test(retryAnalyzer = IRetry_Logic.class)
	public void login_invalidcredentials() throws IOException {
		HomePage homepage = new HomePage(driver);
		homepage.hoverover(driver);
		homepage.signin();

		Invalid_LoginCredentialsPage testpage = new Invalid_LoginCredentialsPage(driver);
		testpage.incorrectusername();
		testpage.incorrectpassword();
		testpage.testValidationMessage();

	}
}
