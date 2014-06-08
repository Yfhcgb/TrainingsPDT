package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class GroupRemovalTest extends TestBase{
@Test
	public void deleteSomeGroup() {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().goToGroupsPage();
    // save old state
    List<GroupData> oldList = app.getGroupHelper().getGroups();
    //actions
    
    Random rnd = new Random();
    int index= rnd.nextInt(oldList.size()-1);
    
	app.getGroupHelper().deleteGroup(index);
	app.getGroupHelper().goToGroupPage();
	//save new state
    List<GroupData> newList = app.getGroupHelper().getGroups();
    //compare states
    //assertEquals(newList.size(), oldList.size() + 1); is not nesessary anymore
    //compare inputs
    oldList.remove(index);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
	
	}
}
