package com.acttime.customertest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.objectrepositoryLib.Common;
import com.actitime.objectrepositoryLib.CreateNewCustomer;
import com.actitime.objectrepositoryLib.Home;
import com.actitime.objectrepositoryLib.Login;
import com.actitime.objectrepositoryLib.OpenTask;
import com.actitime.objectrepositoryLib.ProjectAndCustomer;

import pac.BaseClass1;

public class CustomerTest {
	@Test
	public void CreateCustomerTest()  {
		System.out.println("create customer Test");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://hp/login.do");
				Login lp=PageFactory.initElements(driver, Login.class);
				lp.login("admin", "manager");
				Home hp=PageFactory.initElements(driver,Home.class);
				hp.navigateToTaskPage();
				OpenTask op=PageFactory.initElements(driver,OpenTask.class);
				op.navigateToProjectAndCustPage();
				ProjectAndCustomer p=PageFactory.initElements(driver,ProjectAndCustomer.class);
				p.navigateCreateNewCustomerPage();
				CreateNewCustomer cc=PageFactory.initElements(driver,CreateNewCustomer.class);
				cc.createCustomer("ICICI_090");
				Common comm=PageFactory.initElements(driver,Common.class);
				comm.logOut();
				driver.close();
					}
	}
