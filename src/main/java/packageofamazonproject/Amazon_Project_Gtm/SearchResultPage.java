package packageofamazonproject.Amazon_Project_Gtm;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchResultPage {
	WebDriver driver;
	// step 1
	@FindBy(xpath = "(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement Productshoe;
	@FindBy(xpath = "//span[.='Get It by Tomorrow']")
	WebElement deliveytime;
	@FindBy(xpath = "//button[@class='a-button-text a-text-center']")
	List<WebElement> shoesize;
	/*
	 * @FindBy(id = "brandsRefinements") List<WebElement> brandname;
	 */
	@FindBy(xpath = "//span[.='Bacca Bucci']/parent::a")
	WebElement brandname;
	@FindBy(id = "s-result-sort-select")
	WebElement sortoption;

	// step 2
	public void productselection(WebDriver driver) {
		Productshoe.click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> i2 = window.iterator();
		String Parentid = i2.next();
		String Childid = i2.next();
		driver.switchTo().window(Childid);
	}

	public void deliveryday() throws InterruptedException {
		Thread.sleep(4000);
		deliveytime.click();
	}

	public void shoesizeselect() throws InterruptedException {
		Thread.sleep(4000);
		shoesize.get(5).click();
	}

	public void brandselect() {
		brandname.click();
		/*
		 * Thread.sleep(3000); for (WebElement checkbox : brandname) { String value =
		 * checkbox.getText().trim(); // Ensure text is trimmed if
		 * (value.equalsIgnoreCase("ASIAN") || value.equalsIgnoreCase("Bacca Bucci")) {
		 * // Replace with actual values if (!checkbox.isSelected()) { checkbox.click();
		 * } } }
		 */
	}

	public void sorting() {
		Select s1 = new Select(sortoption);
		s1.selectByVisibleText("Price: Low to High");
	}

	// step 3
	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
