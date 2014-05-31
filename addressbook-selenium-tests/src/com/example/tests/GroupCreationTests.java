package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{


  @Test
  public void testNonEmptyGroupCreation() throws Exception {
    openMainPage();
    goToGroupsPage();
    initNewGroupCreation();
    GroupData group = new GroupData();
    group.name= "group-name1";
    group.header="header1";
    group.footer= "footer1";
	fillGroupForm(group);
    submitGroupCreation();
    goToGroupPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
    openMainPage();
    goToGroupsPage();
    initNewGroupCreation();
    fillGroupForm(new GroupData("", "", ""));
    submitGroupCreation();
    goToGroupPage();
  }




  }

