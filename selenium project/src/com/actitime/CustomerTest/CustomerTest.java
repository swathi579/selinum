package com.actitime.CustomerTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;

public class CustomerTest extends BaseClass{
	@Test
	public void createCustomerTest()
	{
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("pravi");
		driver.findElement(By.name("createCustomerSubmit")).click();
		System.out.println("create customerTest");
	}
	@Test
	public void modifyCustomerTest()
	{
		System.out.println("create and modify customerTest");
	}
	@Test
	public void deleteCustomerTest()
	{
		System.out.println("create and delete customerTest");
	}
}
