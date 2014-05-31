package com.example.tests;


import org.testng.annotations.Test;


public class ContactCreation extends TestBase {
 

 

  @Test
  public void testnoneEmptyContactCreation() throws Exception {
    app.openMainPage();
    app.openContactsPage();
    app.addNewContact();
    ContactData contact = new ContactData();
	contact.firstName = "FirstName1";
	contact.lastName = "LastName1";
	contact.address = "AddressAddress";
	contact.homeNumber = "AddressAddress";
	contact.mobileNumber = "AddressAddress";
	contact.workNumber = "AddressAddress";
	contact.email = "AddressAddress";
	contact.email2 = "AddressAddress";
	contact.birthDay = "13";
	contact.birthMonth = "May";
	contact.birthYear ="1233";
	contact.groupName = "";
	contact.fillContactCreation(this);
    app.submitContactCreation();
    app.returnToHomePage();
  }
  @Test
  public void testEmptyContactCreation() throws Exception {
    app.openMainPage();
    app.openContactsPage();
    app.addNewContact();
    //ContactData contact = ;
	new ContactData(null, null,null,null,null,null,null,null,"-","-",null,"").fillContactCreation(this);
    app.submitContactCreation();
    app.returnToHomePage();
  }}







 


