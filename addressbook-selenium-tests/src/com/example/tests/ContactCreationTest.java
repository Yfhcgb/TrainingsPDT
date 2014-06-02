package com.example.tests;


import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
  

  @Test
  public void testFullContactCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().initNewContactCreation();
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
   	app.getContactHelper().fillContactForm(contact);
   	app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToHomePageContact();
  }
  @Test
  public void testEmptyContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initNewContactCreation();
	    app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
	    app.getContactHelper().submitContactCreation();
	    app.getNavigationHelper().goToHomePageContact();
	  }
  @Test
  public void testAnotherEmptyContactCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initNewContactCreation();
	    app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "", "", "", "", "", "", "", "", "", ""));
	    app.getContactHelper().submitContactCreation();
	    app.getNavigationHelper().goToHomePageContact();
	  }
}
