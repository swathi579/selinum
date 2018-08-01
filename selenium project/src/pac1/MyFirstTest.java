package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

	public static void main(String[] args)  {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("swathipenubolu");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElementByName("password").sendKeys("aruna#123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[@class=\"gb_db gbii\"]")).click();
		driver.findElement(By.id("gb_71")).click();
		driver.close();

		

	}

}
