package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureWindowHandle {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕'']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone x",Keys.ENTER);

	}

}
