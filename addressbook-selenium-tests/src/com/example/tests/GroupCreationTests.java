package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{


  @Test
  public void testNonEmptyGroupCreation() throws Exception {
    openMainPage();
    goToGroupsPage();
    initGroupCreation();
    GroupData group = new GroupData();
    group.name= "group-name1";
    group.header="header1";
    group.footer= "footer1";
	fillGroupForm(group);
    submitGroupCreation();
    returnToGroupsPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
    openMainPage();
    goToGroupsPage();
    initGroupCreation();
    fillGroupForm(new GroupData("", "", ""));
    submitGroupCreation();
    returnToGroupsPage();
  }

protected void returnHomePage() {
	driver.findElement(By.linkText("home page")).click();
}

protected void submitContactCreation() {
	driver.findElement(By.name("submit")).click();
}

protected void fillContactForm(ContactData contact) {
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

protected void goToAddContact() {
	driver.findElement(By.linkText("add new")).click();
}

protected void openMainPage() {
	driver.findElement(By.linkText("home")).click();
}
 

  }

