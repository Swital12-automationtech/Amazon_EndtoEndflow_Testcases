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

public class RegistrationPage {
	WebDriver driver;
//step 1
	@FindBy(xpath = "//a[contains(@href, 'register') and contains(text(), 'Start here')]")
	WebElement newcustomer;
	@FindBy(id = "ap_customer_name")
	WebElement customername;
	@FindBy(id = "ap_phone_number")
	WebElement phoneno;
	@FindBy(id = "ap_password")
	WebElement pass;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;

//step 2
	public void newcust() {
		newcustomer.click();
	}

	public void customernametext() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\lenovo\\eclipse-workspace\\Amazon_Project_Gtm\\ExcelSheet\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String customer = w1.getSheet("registration").getRow(1).getCell(0).getStringCellValue();
		customername.sendKeys(customer);
	}

	public void phonetext() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\lenovo\\eclipse-workspace\\Amazon_Project_Gtm\\ExcelSheet\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String phone = NumberToTextConverter
				.toText(w1.getSheet("registration").getRow(1).getCell(1).getNumericCellValue());
		phoneno.sendKeys(phone);
	}

	public void pwdtext() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\lenovo\\eclipse-workspace\\Amazon_Project_Gtm\\ExcelSheet\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String password = w1.getSheet("registration").getRow(1).getCell(2).getStringCellValue();
		pass.sendKeys(password);
	}

	public void submitbtn() {
		submit.click();
	}

//step 3
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
