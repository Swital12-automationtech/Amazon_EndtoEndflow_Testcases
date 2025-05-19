package packageofamazonproject.Amazon_Project_Gtm;

import java.awt.Window;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {
	WebDriver driver;
	// step 1
	@FindBy(xpath = "(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement Productshoe;
	@FindBy(xpath = "//span[.='Get It by Tomorrow']")
	WebElement deliveytime;
	@FindBy(xpath = "//button[@class='a-button-text a-text-center']")
	List<WebElement> shoesize;
	@FindBy(xpath = "//span[.='Bacca Bucci']/parent::a")
	WebElement brandname;
	@FindBy(id = "s-result-sort-select")
	WebElement sortoption;
	@FindBy(xpath = "//input[contains(@aria-valuetext,'₹100')]")
	WebElement leftslider;
	@FindBy(xpath= "//input[contains(@aria-valuetext,'₹1400')]")
	WebElement rightslider;

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
	public void pricerange(WebDriver driver) throws InterruptedException
	{
		System.out.println("Slider Displayed: " + rightslider.isDisplayed());
		System.out.println("Slider Enabled: " + rightslider.isEnabled());
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementSelectionStateToBe(rightslider, true));		
		/*Dimension d1 = price.getSize();
		int x = d1.getHeight();
		int y = d1.getWidth();
		System.out.println(x);
		System.out.println(y);
		System.out.println(leftslider.getLocation());
		System.out.println(rightslider.getLocation());*/
		Actions a1 = new Actions(driver);
		a1.dragAndDropBy(leftslider, 10, 0).perform();
		Thread.sleep(4000);
		a1.dragAndDropBy(rightslider, -10, 0).perform();
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].scrollIntoView(true);", price);
		
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
