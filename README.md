# Amazon End-to-End Test Automation Framework

This project is an end-to-end test automation framework developed to simulate real-time e-commerce scenarios on Amazon’s website. It covers user registration, login, product search, cart functionality, and the complete checkout process using Selenium WebDriver, TestNG, and Page Object Model.

---

## Tech Stack

- **Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **Testing Framework:** TestNG  
- **Build Tool:** Maven  
- **Design Pattern:** Page Object Model (POM)  
- **Test Data Handling:** Data-Driven Testing (Excel)  
- **Reports:** ExtentReports (auto-generated)  
- **Screenshots:** Captured on failure  
- **CI Tool:** Jenkins  
- **Version Control:** GitHub  

---

## Project Structure
AmazonTestAutomation/
├── ExcelSheet/ # Test data in Excel format
├── Screenshot/ # Captured screenshots
├── amazonmavenproject/ # Base structure (main classes/utilities)
├── src/
│ ├── main/java/pages/ # Page classes (LoginPage, HomePage, etc.)
│ └── test/java/tests/ # TestNG test cases
├── test-output/ # TestNG output reports
├── pom.xml # Maven dependencies and build configuration
├── testng.xml # TestNG suite
└── parallel.xml # Parallel test execution config


---

## ✅ Test Scenarios Covered

1. ✅ New user registration  
2. ✅ Successful login with valid credentials  
3. ✅ Login failure with invalid credentials  
4. ✅ Edit profile information  
5. ✅ Search product by name (e.g., "shoe")  
6. ✅ Filtered search by category/price  
7. ✅ Product details validation (price, reviews, description)  
8. ✅ Sort products by price, rating, relevance  
9. ✅ Add items to cart  
10. ✅ Update quantity & remove items from cart  
11. ✅ Checkout flow (address, payment, review)  
12. ✅ Select different payment methods  
13. ✅ Apply coupon code  
14. ✅ Post-purchase: give 5-star rating  
15. ✅ Add to cart without login  




