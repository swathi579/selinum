package com.actitime.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	@FindBy(xpath="//div[text()='Tasks']/..")
	private WebElement taskImg;
	@FindBy(xpath="//div[text()='Users']/..")
	private WebElement UserImg;
	public void navigateToTaskPage() {
		taskImg.click();
		}
		public void navigateToUserPage() {
			UserImg.click();
	}
	
	

}
