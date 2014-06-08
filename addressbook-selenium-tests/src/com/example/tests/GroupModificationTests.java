package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{
	@Test(dataProvider="randomValidGroupGenerator")
	public void modifySomeGroup(GroupData group) {
		app.getNavigationHelper().openMainPage();
	    app.getNavigationHelper().goToGroupsPage();
	    // save old state
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    Random rnd = new Random();
	    int index= rnd.nextInt(oldList.size()-1);
	    //actions
		app.getGroupHelper().initGroupModyfication(index);
		app.getGroupHelper().fillGroupForm(group);
		app.getGroupHelper().submitGroupModyfication(index);
		app.getGroupHelper().goToGroupPage();
		//save new state
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    //compare states
	    //assertEquals(newList.size(), oldList.size() + 1); is not nesessary anymore
	    //compare inputs
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
		
	}

}
