package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteUser {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
    driver.get("http://hp/login.do");
    driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("//div[text()='Users']/..")).click();
	driver.findElement(By.linkText("p, swa (swa)")).click();
	driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
	Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	}

}
