package packageofamazonproject.Amazon_Project_Gtm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	WebDriver driver;

	@FindBy(xpath = "//span[@id='sw-gtc']")
	WebElement gototcartlink;
	@FindBy(xpath = "//span[@class='a-icon a-icon-small-add']")
	WebElement productcount;
//@FindBy(xpath = "//span[@class='a-icon a-icon-small-remove']")
//WebElement productcountremove;
	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	WebElement proceedbutton;
	@FindBy(xpath = "(//span[@class=\"a-size-small sc-action-delete\"])[1]")
	WebElement removeitem;

	public void cartbtn() {
		gototcartlink.click();
	}

	public void productqty() throws InterruptedException {
		Thread.sleep(2000);
		productcount.click();
	}

	public void removeitembtn() throws InterruptedException {
		Thread.sleep(5000);
		removeitem.click();
	}

	public void proceedtocheckoutbtn() {
		proceedbutton.click();
	}

//step 3
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
