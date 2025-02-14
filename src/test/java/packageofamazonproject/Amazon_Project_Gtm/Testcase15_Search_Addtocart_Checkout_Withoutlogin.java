package packageofamazonproject.Amazon_Project_Gtm;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner.class)

public class Testcase15_Search_Addtocart_Checkout_Withoutlogin extends LaunchQuit {
	@Test(retryAnalyzer = IRetry_Logic.class)
	public void amazonprocess_withoutlogin() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		homepage.searching();
		SearchResultPage searchresult = new SearchResultPage(driver);
		searchresult.productselection(driver);

		ProductdetailPage productadd = new ProductdetailPage(driver);
		productadd.productaddtocart();

		ShoppingCartPage cartpage = new ShoppingCartPage(driver);
		cartpage.cartbtn();
		// cartpage.productqty();
		cartpage.proceedtocheckoutbtn();

	}
}