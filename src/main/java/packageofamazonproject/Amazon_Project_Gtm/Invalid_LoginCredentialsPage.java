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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Invalid_LoginCredentialsPage {
	WebDriver driver;
	// step 1
	@FindBy(name = "email")
	WebElement usernamebox;
	@FindBy(id = "continue")
	WebElement cont;
	@FindBy(id = "ap_password")
	WebElement passwordbox;
	@FindBy(id = "signInSubmit")
	WebElement signinbtn;
	@FindBy(xpath = "//*[@id=\"auth-error-message-box\"]/div/div")
	WebElement errorMessage;

	// steps 2
	public void incorrectusername() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\lenovo\\eclipse-workspace\\Amazon_Project_Gtm\\ExcelSheet\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		//String username = NumberToTextConverter
			//	.toText(w1.getSheet("loginsheet").getRow(2).getCell(0).getNumericCellValue());
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

		usernamebox.sendKeys(username);
		cont.click();
		Robot robot = new Robot();
		Thread.sleep(2000); // wait for popup

		// Press Tab and then Enter (to close the popup)
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		// Assert.assertEquals(errorMessage.getText(), "Incorrect phone number", "Test
		// fails");
	}

	public void incorrectpassword() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\lenovo\\eclipse-workspace\\Amazon_Project_Gtm\\ExcelSheet\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String password = w1.getSheet("loginsheet").getRow(2).getCell(1).getStringCellValue();
		passwordbox.sendKeys(password);
		signinbtn.click();
	}

	public void testValidationMessage() {
	//	String expected = "There was a problem Your password is incorrect".replaceAll("\\s+", " ").trim();
		String expected = "Your password is incorrect";
		String actualText = errorMessage.getText();
		String actual = actualText.replaceAll("\\s+", " ").trim();

		Assert.assertEquals(actual, expected, "Validation mismatch");

	}

	// step 3
	public Invalid_LoginCredentialsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}