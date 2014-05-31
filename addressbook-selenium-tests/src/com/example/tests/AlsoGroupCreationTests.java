package com.example.tests;

import org.testng.annotations.Test;

public class AlsoGroupCreationTests extends TestBase{
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
openMainPage();
    goToGroupsPage();
    initNewGroupCreation();
    GroupData group = new GroupData();
    group.name = "name 1";
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