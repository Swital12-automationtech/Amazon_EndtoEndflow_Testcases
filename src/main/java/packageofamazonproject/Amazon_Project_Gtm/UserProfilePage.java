package packageofamazonproject.Amazon_Project_Gtm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProfilePage {
//step 1
	@FindBy(xpath = "//span[.='Your Account']")
	WebElement youraccountmenu;
	@FindBy(xpath = "(//span[@class='a-color-secondary'])[2]")
	WebElement loginandsecurity;
	@FindBy(xpath = "(//a[.='Edit'])[1]")
	WebElement editlink;
	@FindBy(id = "ap_customer_name")
	WebElement nameupdate;
	@FindBy(id = "cnep_1C_submit_button")
	WebElement savechange;

	@FindBy(xpath = "//button[.='Manage Profiles']")
	WebElement manageprofile;
	@FindBy(xpath = "//a[.='View']")
	WebElement viewlink;
	@FindBy(xpath = "//div[.='Preferred department']")
	WebElement deptexpand;
	@FindBy(xpath = "//button[.='Add']")
	WebElement adddept;
	@FindBy(xpath = "//button[.='Women']")
	WebElement choosedept;
	@FindBy(xpath = "//span[@class='a-button a-button-normal a-button-primary button']")
	WebElement savedept;

//step 2
	public void youracclink() {
		youraccountmenu.click();
	}

	public void profilelink() {
		loginandsecurity.click();
	}

	public void editprofile() {
		editlink.click();
	}

	public void updateprofilename() {
		nameupdate.sendKeys(" Macwan");
	}

	public void savebtn() {
		savechange.click();
	}

	public void manageproflink() throws InterruptedException {
		Thread.sleep(3000);
		manageprofile.click();
	}

	public void viewlinkclick() throws InterruptedException {
		Thread.sleep(4000);
		viewlink.click();
	}

	public void prferreddeptexpand() throws InterruptedException {
		Thread.sleep(5000);
		deptexpand.click();
	}

	public void adddepatment() throws InterruptedException {
		Thread.sleep(3000);
		adddept.click();
	}

	public void choosedepatment() throws InterruptedException {
		Thread.sleep(3000);
		choosedept.click();
	}

	public void savedepatment() throws InterruptedException {
		Thread.sleep(3000);
		savedept.click();
	}

//step 3
	public UserProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
