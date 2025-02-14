package packageofamazonproject.Amazon_Project_Gtm;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	@FindBy(name = "proceedToRetailCheckout")
	WebElement usepaymentlink;
	@FindBy(xpath = "//a[@id='nav-cart']")
	WebElement backtocart;
	@FindBy(id = "nav-cart")
	WebElement cartoption;
	@FindBy(xpath = "//div[@id='checkout-deliveryAddressPanel']/div/div[2]/span/a")
	WebElement changeaddress;
	@FindBy(xpath = "(//i[@class='a-icon a-icon-radio'])[3]")
	WebElement selectaddress;
	@FindBy(id = "checkout-primary-continue-button-id")
	WebElement useadd;
	@FindBy(xpath = "//input[@name='ppw-claimCode']")
	WebElement couponcode;
	@FindBy(name = "ppw-claimCodeApplyPressed")
	WebElement applycoupon;
	@FindBy(xpath = "//input[@name='ppw-instrumentRowSelection']")
	List<WebElement> paymentselection;
	@FindBy(css ="#checkout-secondary-continue-button-id-announce")
	WebElement usemethod;
	@FindBy(xpath ="//a[@class='a-link-normal expand-panel-button']")
	WebElement revieworder;
	// step 2
	public void paymentmethodbtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		// Actions actions = new Actions(driver);
		// actions.sendKeys(Keys.PAGE_DOWN).build().perform(); // Scroll one page down
		Thread.sleep(3000);
		usepaymentlink.click();
	}

	public void backtocartlink() throws InterruptedException {
		Thread.sleep(3000);
		backtocart.click();
	}

	public void cartlink() throws InterruptedException {
		Thread.sleep(3000);
		cartoption.click();
	}

	public void changeadd() throws InterruptedException {
		Thread.sleep(3000);
		changeaddress.click();
	}

	public void selectadd() throws InterruptedException {
		Thread.sleep(20000);
		selectaddress.click();
	}

	public void usethisaddress() throws InterruptedException {
		Thread.sleep(10000);
		useadd.click();
	}

	public void couponbox() throws InterruptedException {
		Thread.sleep(4000);
		couponcode.sendKeys("1111");
	}

	public void applycouponbtn() throws InterruptedException {
		Thread.sleep(3000);
		applycoupon.click();
	}

	public void paymentmethodselect() throws InterruptedException {
		Thread.sleep(3000);
		paymentselection.get(0).click();
		Thread.sleep(3000);
		paymentselection.get(1).click();
		Thread.sleep(3000);
		paymentselection.get(2).click();
		Thread.sleep(3000);
		paymentselection.get(3).click();
		Thread.sleep(3000);
		paymentselection.get(4).click();
		
	}
	public void cardpaymentmethod() throws InterruptedException {
		Thread.sleep(3000);
		paymentselection.get(3).click();
		}
	public void usepaymentbtn() throws InterruptedException {
		Thread.sleep(10000);
		usemethod.click();
		}
	public void revieworderlink() throws InterruptedException {
		Thread.sleep(2000);
		revieworder.click();
		}
	// step 3
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
