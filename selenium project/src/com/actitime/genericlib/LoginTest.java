package com.actitime.genericlib;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest  extends BaseClass{
	@Test
	public void VerifyHomePage() {
		String expTitle="actiTime-Tasks";
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		}
	@Test
	public void VerifyHomePageLogo() {
		boolean imgStat=driver.findElement(By.xpath("//img[contains(@src,'default-logo')]")).isDisplayed();
		Assert.assertTrue(imgStat);
	}

}
