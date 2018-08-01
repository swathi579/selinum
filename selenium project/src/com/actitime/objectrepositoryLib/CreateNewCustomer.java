package com.actitime.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer {
	@FindBy(name="name")
	private WebElement customerNameEdit;
	@FindBy(name="description")
	private WebElement customerdescriptionEdit;
	@FindBy(name="createCustomerSubmit")
	private WebElement CreateCustomerBtn;
	public void createCustomer(String customerName) {
		customerNameEdit.sendKeys(customerName);
		CreateCustomerBtn.click();
	}
	public void createCustomer(String customerName,String desc) {
		customerNameEdit.sendKeys(desc);
		CreateCustomerBtn.click();
	}

}
