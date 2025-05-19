package packageofamazonproject.Amazon_Project_Gtm;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner.class)

public class Testcase12_SelectEachPaymentMethod extends LaunchQuit {
	@Test(retryAnalyzer = IRetry_Logic.class)
	public void paymentMethod_Selection() throws InterruptedException, EncryptedDocumentException, IOException, AWTException {
		HomePage homepage = new HomePage(driver);
		homepage.hoverover(driver);
		homepage.signin();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.un();
		loginpage.ctn();
		loginpage.pwd();
		loginpage.signbtn();

		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.cartlink();
		checkout.paymentmethodbtn(driver);
		checkout.paymentmethodselect();
	}
}
