package packageofamazonproject.Amazon_Project_Gtm;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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
	@FindBy(xpath = "//span[@class=\"a-list-item\"]")
	WebElement errorMessage;

	// steps 2
	public void incorrectusername() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\lenovo\\eclipse-workspace\\Amazon_Project_Gtm\\ExcelSheet\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String username = NumberToTextConverter
				.toText(w1.getSheet("loginsheet").getRow(2).getCell(0).getNumericCellValue());
		usernamebox.sendKeys(username);
		cont.click();
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
		String expectedMessage = "Your password is incorrect";
		String actualMessage = errorMessage.getText();

		Assert.assertEquals(actualMessage, expectedMessage, "Validation message mismatch!");
	}

	// step 3
	public Invalid_LoginCredentialsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}