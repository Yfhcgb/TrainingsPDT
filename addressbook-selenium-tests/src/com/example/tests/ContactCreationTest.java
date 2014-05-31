package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactCreationTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeTest
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFullContactCreation() throws Exception {
    openMainPage();
    initNewContactCreation();
    fillContactForm(new ContactData("First-Name", "Last-Name", "Address", "9999999999999", "8888888888888", "7777777777777", "123@123.com", "345@345.ru", "17", "November", "78", "", "Secondary-Address", "Secondary-Home"));
    submitContactCreation();
    goToHomePageContact();
  }
  public void testEmptyContactCreation() throws Exception {
	    openMainPage();
	    initNewContactCreation();
	    fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
	    submitContactCreation();
	    goToHomePageContact();
	  }

private void goToHomePageContact() {
	driver.findElement(By.linkText("home page")).click();
}

private void submitContactCreation() {
	driver.findElement(By.name("submit")).click();
}

private void fillContactForm(ContactData contact) {
	driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys(contact.firstName);
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys(contact.lastName);
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys(contact.address);
    driver.findElement(By.name("home")).clear();
    driver.findElement(By.name("home")).sendKeys(contact.homePhone);
    driver.findElement(By.name("mobile")).clear();
    driver.findElement(By.name("mobile")).sendKeys(contact.mobilePhone);
    driver.findElement(By.name("work")).clear();
    driver.findElement(By.name("work")).sendKeys(contact.workPhone);
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys(contact.email);
    driver.findElement(By.name("email2")).clear();
    driver.findElement(By.name("email2")).sendKeys(contact.email2);
    new Select(driver.findElement(By.name("bday"))).selectByVisibleText(contact.birthDay);
    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(contact.birthMonth);
    driver.findElement(By.name("byear")).clear();
    driver.findElement(By.name("byear")).sendKeys(contact.birthYear);
    new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contact.groupName);
    driver.findElement(By.name("address2")).clear();
    driver.findElement(By.name("address2")).sendKeys(contact.secondaryAddress);
    driver.findElement(By.name("phone2")).clear();
    driver.findElement(By.name("phone2")).sendKeys(contact.secondaryHome);
}

private void initNewContactCreation() {
	driver.findElement(By.linkText("add new")).click();
}

private void openMainPage() {
	driver.get(baseUrl + "/addressbookv4.1.4/");
}

  @AfterTest
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
