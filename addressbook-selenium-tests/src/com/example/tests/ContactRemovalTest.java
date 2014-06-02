package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTest extends TestBase{
@Test
	public void deleteSomeGroup() {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactRemoval(1);
		app.getContactHelper().deleteContact();
		
	}

}
