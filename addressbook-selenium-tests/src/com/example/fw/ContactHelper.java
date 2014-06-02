package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
		
	}

	
	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void fillContactForm(ContactData contact) {
		type(By.name("firstname"), contact.firstName);
		type(By.name("lastname"), contact.lastName);
		type(By.name("address"), contact.address);
		type(By.name("home"), contact.homePhone);
		type(By.name("mobile"), contact.mobilePhone);
		type(By.name("work"), contact.workPhone);
		type(By.name("email"), contact.email);
		type(By.name("email2"), contact.email2);  
	    if(contact.birthDay==""){System.out.println("-");}
	    else {selectByText(By.name("bday"),contact.birthDay);};
	    if(contact.birthMonth==""){System.out.println("-");}
	    else {selectByText(By.name("bmonth"),contact.birthMonth);};
	    type(By.name("byear"), contact.birthYear);	    
	    //selectByText(By.name("new_group"),contact.groupName);
	    type(By.name("address2"), contact.secondaryAddress);
	    type(By.name("phone2"), contact.secondaryHome);
	    
	}

	public void initNewContactCreation() {
		click(By.linkText("add new"));
	}


	public void initContactRemoval(int index) {
		click(By.xpath("//input[@name='selected[]']["+ index +"]"));
		click(By.cssSelector("img[alt=\"Edit\"]"));
		
	}

	public void deleteContact() {
		
		click(By.xpath("(//input[@name='update'])[2]"));
		
	}


	public void submitContactModyfication() {
		click(By.xpath("(//input[@name='update'])[1]"));
		
	}

}
