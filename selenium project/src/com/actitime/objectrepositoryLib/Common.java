package com.actitime.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {
	@FindBy(linkText="Logout")
	private WebElement logOut;
	public void logOut()
	{
		logOut.click();
	}

}
