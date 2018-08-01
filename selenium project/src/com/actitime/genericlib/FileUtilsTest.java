package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class FileUtilsTest {
	@Test
	public void FileUtilTest() throws IOException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://flipkart.com");
	EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
	File srcFile=edriver.getScreenshotAs(OutputType.FILE);
	File destFile=new File("H:\\ss\\testimg.png");
	FileUtils.copyFile(srcFile, destFile);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
