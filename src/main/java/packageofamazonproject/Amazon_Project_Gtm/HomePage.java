package packageofamazonproject.Amazon_Project_Gtm;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	// step 1
	@FindBy(css = "#nav-link-accountList")
	WebElement accountandlist_hoverover;
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;
	@FindBy(xpath = "//a[@class='nav-action-signin-button']")
	WebElement signin_home;
	@FindBy(xpath = "(//span[.='Sign Out'])[1]")
	WebElement signout_home;

	// step 2
	public void hoverover(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(accountandlist_hoverover));
		Actions a1 = new Actions(driver);
		a1.moveToElement(continueButton).perform();
	}

	public void searching() {
		searchbox.sendKeys("shoe" + Keys.ENTER);
	}

	public void signin() {
		signin_home.click();
	}

	public void signout() {
		signout_home.click();
	}

	// step 3
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
