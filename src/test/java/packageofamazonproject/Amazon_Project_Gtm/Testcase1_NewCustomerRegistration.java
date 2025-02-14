package packageofamazonproject.Amazon_Project_Gtm;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner.class)

public class Testcase1_NewCustomerRegistration extends LaunchQuit {
	@Test(retryAnalyzer = IRetry_Logic.class)
	public void newcustomer_registration() throws EncryptedDocumentException, IOException {
		HomePage homepage = new HomePage(driver);
		homepage.hoverover(driver);

		RegistrationPage regpage = new RegistrationPage(driver);
		regpage.newcust();
		regpage.customernametext();
		regpage.phonetext();
		regpage.pwdtext();
		regpage.submitbtn();
	}
}
