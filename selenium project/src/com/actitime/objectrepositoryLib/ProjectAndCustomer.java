package com.actitime.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomer {
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement createCustomerBtn;
	public void navigateCreateNewCustomerPage() {
		createCustomerBtn.click();
	}
	
		
	}


