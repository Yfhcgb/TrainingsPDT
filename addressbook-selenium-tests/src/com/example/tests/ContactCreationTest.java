package com.example.tests;


import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
  

  @Test
  public void testFullContactCreation() throws Exception {
    openMainPage();
    initNewContactCreation();
    ContactData contact = new ContactData();
   	contact.firstName = "FirstName1";
   	contact.lastName = "LastName1";
   	contact.address = "AddressAddress";
   	contact.homePhone = "AddressAddress";
   	contact.mobilePhone = "AddressAddress";
   	contact.workPhone = "AddressAddress";
   	contact.email = "AddressAddress";
   	contact.email2 = "AddressAddress";
   	contact.birthDay = "13";
   	contact.birthMonth = "May";
   	contact.birthYear ="1233";
   	contact.groupName = "";
   	fillContactForm(contact);
   	submitContactCreation();
    goToHomePageContact();
  }
  @Test
  public void testEmptyContactCreation() throws Exception {
	    openMainPage();
	    initNewContactCreation();
	    fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
	    submitContactCreation();
	    goToHomePageContact();
	  }
  @Test
  public void testAnotherEmptyContactCreation() throws Exception {
	    openMainPage();
	    initNewContactCreation();
	    fillContactForm(new ContactData("", "", "", "", "", "", "", "", "", "", "", "", "", ""));
	   submitContactCreation();
	    goToHomePageContact();
	  }
}
