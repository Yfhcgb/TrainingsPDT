package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{
	@Test
	public void modifySomeGroup() {
		app.getNavigationHelper().openMainPage();
	    app.getNavigationHelper().goToGroupsPage();
		app.getGroupHelper().initGroupModyfication(1);
		GroupData group= new GroupData();
		group.name="New_name";
		app.getGroupHelper().fillGroupForm(group);
		app.getGroupHelper().submitGroupModyfication(1);
		app.getGroupHelper().goToGroupPage();
		
	}

}
