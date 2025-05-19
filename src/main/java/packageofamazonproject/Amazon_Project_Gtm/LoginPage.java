package packageofamazonproject.Amazon_Project_Gtm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
//step 1
	@FindBy(name = "email")
	WebElement username1;
	@FindBy(id = "continue")
	WebElement cont;
	@FindBy(id = "ap_password")
	WebElement passwordbox;
	@FindBy(id = "signInSubmit")
	WebElement signinbtn;

//step 2
	public void un() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\lenovo\\eclipse-workspace\\Amazon_Project_Gtm\\ExcelSheet\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		//String username = NumberToTextConverter
				//.toText(w1.getSheet("loginsheet").getRow(1).getCell(0).getNumericCellValue());
		Sheet sheet = w1.getSheet("loginsheet");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);

		String username = "";

		if (cell.getCellType() == CellType.STRING) {
		    username = cell.getStringCellValue().trim();
		} else if (cell.getCellType() == CellType.NUMERIC) {
		    // Avoid scientific notation and preserve full number
		    username = NumberToTextConverter.toText(cell.getNumericCellValue());
		}

		// Manually add country code if not already present
		if (!username.startsWith("+91")) {
		    username = "+91" + username;
		}

		username1.sendKeys(username);

	}

	public void ctn() throws InterruptedException, AWTException {
		cont.click();
		
		Robot robot = new Robot();
		Thread.sleep(2000); // wait for popup

		// Press Tab and then Enter (to close the popup)
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		/*
		 * String expectedMessage = "We cannot find an account with that mobile number";
		 * String actualMessage = errorMessage.getText();
		 * Assert.assertEquals(actualMessage, expectedMessage, "Login fails");
		 */
	}

	public void pwd() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\lenovo\\eclipse-workspace\\Amazon_Project_Gtm\\ExcelSheet\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String password = w1.getSheet("loginsheet").getRow(1).getCell(1).getStringCellValue();
		passwordbox.sendKeys(password);
	}

	public void signbtn() {
		signinbtn.click();
		// Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop
		// Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Login
		// fails");

	}

	public void loginvalidation(WebDriver driver) {
		String expectedMessage = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualMessage = driver.getTitle();

		Assert.assertEquals(actualMessage, expectedMessage, "Validation message mismatch!");
	}

//step 3
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
