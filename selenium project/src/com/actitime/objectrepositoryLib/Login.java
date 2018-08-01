package com.actitime.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(name="username")
	private WebElement UsernameEdt;
	@FindBy(name="pwd")
	private WebElement PasswordEdt;
	@FindBy(id="loginButton")
	private WebElement LoginButton;
	public WebElement getUsernameEdt() {
		return UsernameEdt;
	}
	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	

	public void login(String UserName,String Password)
	{
		UsernameEdt.sendKeys(UserName);
		PasswordEdt.sendKeys(Password);
		LoginButton.click();
		
		
	}
}
