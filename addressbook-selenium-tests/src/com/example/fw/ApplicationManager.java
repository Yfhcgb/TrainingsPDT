package com.example.fw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;

import com.example.tests.GroupData;
import com.example.tests.TestBase;

public class ApplicationManager {

	public void submitCreation() {
	
	    TestBase.driver.findElement(By.name("submit")).click();
	}

	public void fillGroupForm(TestBase testBase, GroupData group) {
		TestBase.driver.findElement(By.name("group_name")).clear();
	    TestBase.driver.findElement(By.name("group_name")).sendKeys(group.name);
	    TestBase.driver.findElement(By.name("group_header")).clear();
	    TestBase.driver.findElement(By.name("group_header")).sendKeys(group.header);
	    TestBase.driver.findElement(By.name("group_footer")).clear();
	    TestBase.driver.findElement(By.name("group_footer")).sendKeys(group.footer);
	}

	public void goToGroupPage() {
	    TestBase.driver.findElement(By.linkText("group page")).click();
	}

	public void initNewGroupCreation() {
		    TestBase.driver.findElement(By.name("new")).click();
	}

	public void goToGroupsPage() {
		    TestBase.driver.findElement(By.linkText("groups")).click();
	}

	public void openMainPage() {
		    TestBase.driver.get(TestBase.baseUrl + "/addressbookv4.1.4/");
	}

	public boolean isElementPresent(By by) {
	    try {
	      TestBase.driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	public boolean isAlertPresent() {
	    try {
	      TestBase.driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	public String closeAlertAndGetItsText() {
	    try {
	      Alert alert = TestBase.driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (TestBase.acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      TestBase.acceptNextAlert = true;
	    }
	  }

	public void returnToHomePage() {
		TestBase.driver.findElement(By.linkText("home page")).click();
	}

	public void submitContactCreation() {
		TestBase.driver.findElement(By.name("submit")).click();
	}

	public void addNewContact() {
		TestBase.driver.findElement(By.linkText("add new")).click();
	}

	public void openContactsPage() {
		TestBase.driver.findElement(By.linkText("home")).click();
	}

}
