package com.actitime.genericlib;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.genericlib.SampleListener.class)
public class CustomerTest extends BaseClass{
	@Test
	public void createCustomerTest() {
		driver.findElement(By.xpath("//span[text()='task']")).click();
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
				
		
	}

}
