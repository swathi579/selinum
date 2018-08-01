package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeAssign {
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://hp/login.do");
		driver.findElementByName("username").sendKeys("admin");
		driver.findElementByName("pwd").sendKeys("manager");
		driver.findElementById("loginButton").click();
		driver.findElementByXPath("//div[text()='Tasks']").click();
		driver.findElementByLinkText("Projects & Customers").click();
		driver.findElementByXPath("//input[@type='text']").sendKeys("abc");
		driver.findElementByName("createCustomerSubmit").click();
	}

}
