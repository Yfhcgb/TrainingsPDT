package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactData {
	public String firstName;
	public String lastName;
	public String address;
	public String homeNumber;
	public String mobileNumber;
	public String workNumber;
	public String email;
	public String email2;
	public String birthDay;
	public String birthMonth;
	public String birthYear;
	public String groupName;

	public ContactData(String firstName, String lastName, String address,
			String homeNumber, String mobileNumber, String workNumber,
			String email, String email2, String birthDay, String birthMonth,
			String birthYear, String groupName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.homeNumber = homeNumber;
		this.mobileNumber = mobileNumber;
		this.workNumber = workNumber;
		this.email = email;
		this.email2 = email2;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.groupName = groupName;
	}
	
	public ContactData() {
		
	}


	
}