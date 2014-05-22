package com.example.tests;


import org.testng.annotations.Test;

public class ContactCreation extends TestBase {
 

 

  @Test
  public void testnoneEmptyContactCreation() throws Exception {
    openMainPage();
    openContactsPage();
    addNewContact();
    ContactData contact = new ContactData("FirstName1", "LastName1", "AddressAddress", "34567", "12345", "1234566", "ert@rt.ru", "tye@er.ty", "18", "December", "2000", "Rob");
	fillContactCreation(contact);
    submitContactCreation();
    returnToHomePage();
  }
  @Test
  public void testEmptyContactCreation() throws Exception {
    openMainPage();
    openContactsPage();
    addNewContact();
    //ContactData contact = ;
	fillContactCreation(new ContactData(null, null,null,null,null,null,null,null,"-","-",null,""));
    submitContactCreation();
    returnToHomePage();
  }}







 


