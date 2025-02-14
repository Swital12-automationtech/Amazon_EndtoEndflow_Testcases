package packageofamazonproject.Amazon_Project_Gtm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductdetailPage {
	// step 1
	WebDriver driver;
	// step 1
	@FindBy(xpath = "//input[@name='submit.add-to-cart']")
	WebElement addtocart;
	@FindBy(id = "acrCustomerReviewText")
	WebElement reviewrate;
	@FindBy(id = "productTitle")
	WebElement producttitlename;
	@FindBy(id = "productFactsDesktopExpander")
	WebElement productdetail;
	@FindBy(id = "corePriceDisplay_desktop_feature_div")
	WebElement productprice;
	@FindBy(id = "aplus")
	WebElement productdesc;
	@FindBy(id = "cm_cr_dp_d_rating_histogram")
	WebElement customerreview;

	// step 2
	public void productaddtocart() {
		addtocart.click();

	}

	public void rate() {
		Assert.assertTrue(reviewrate.isDisplayed(), "Rate is not displayed");
		System.out.println(reviewrate.getText());

	}

	public void prodtitle() {
		Assert.assertTrue(producttitlename.isDisplayed(), "Titlename not displayed");
		System.out.println(producttitlename.getText());
	}

	public void proddetail() {
		Assert.assertTrue(productdesc.isDisplayed(), "Description are not displayed");
		System.out.println(productdesc.getText());
	}

	public void price() {
		Assert.assertTrue(productprice.isDisplayed(), "Price is not displayed");
		System.out.println(productprice.getText());

	}

	public void proddesc() {
		Assert.assertTrue(productdetail.isDisplayed(), "Price is not displayed");
		System.out.println(productdetail.getText());

	}
	public void review() {
		Assert.assertTrue(customerreview.isDisplayed(), "Price is not displayed");
		System.out.println(customerreview.getText());

	}

	// step 3
	public ProductdetailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
