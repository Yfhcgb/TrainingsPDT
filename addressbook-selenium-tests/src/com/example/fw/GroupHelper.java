package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.GroupData;

public class GroupHelper extends HelperBase{

	public GroupHelper(ApplicationManager manager) {
		super(manager);
		
	}

	public void initNewGroupCreation() {
		click(By.name("new"));
	}

	public void fillGroupForm(GroupData group) {
		type(By.name("group_name"), group.name);
		type(By.name("group_header"), group.header);
		type(By.name("group_footer"), group.footer);
	    }

	public void submitGroupCreation() {
	
		click(By.name("submit"));
	}

	public void goToGroupPage() {
		click(By.linkText("group page"));
	}

	public void deleteGroup(int index) {
		selectGroupByIndex(index);
		click(By.name("delete"));
		
	}

	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]']["+ (index+1) +"]"));
	}

	public void initGroupModyfication(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
	}

	public void submitGroupModyfication(int index) {
		click(By.name("update"));
		
	}

	public List<GroupData> getGroups() {
		List<GroupData> groups =  new ArrayList<GroupData>();
		List<WebElement> chekboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : chekboxes) {
			GroupData group = new GroupData();
			String title  = checkbox.getAttribute("title");
			group.name = title.substring("Select (".length(), title.length()- ")".length());
			groups.add(group);
			
		}
		return groups;
	}

}
