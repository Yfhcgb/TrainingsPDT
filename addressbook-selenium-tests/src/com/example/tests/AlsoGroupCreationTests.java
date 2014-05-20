package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit; 
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlsoGroupCreationTests extends TestBase{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();


  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	  openMainPage();
    goToGroupsPage();
    initNewGroupCreation();
    GroupData group = new GroupData();
    group.groupname = "name 1";
    group.header = "header 1";
    group.footer = "footer 1";
	fillGroupForm(group);
    submitCreation();
    goToGroupPage();
  }
  @Test
  public void testEmptyGroupCreation() throws Exception {
	  openMainPage();
    goToGroupsPage();
    initNewGroupCreation();
    fillGroupForm(new GroupData("", "", ""));
    submitCreation();
    goToGroupPage();
  }}









 