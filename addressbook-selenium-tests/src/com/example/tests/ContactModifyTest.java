package com.example.tests;

import org.testng.annotations.Test;

public class ContactModifyTest extends TestBase{
@Test
public void modifySomeContact() {
	app.getNavigationHelper().openMainPage();
	app.getContactHelper().initContactRemoval(1);
	ContactData contact= new ContactData();
	contact.address="New_address";
	app.getContactHelper().fillContactForm(contact);
	app.getContactHelper().submitContactModyfication();
	app.getNavigationHelper().goToHomePageContact();
	
}}
