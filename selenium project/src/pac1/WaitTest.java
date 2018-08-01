package pac1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaitTest {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("swathipenubolu");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("aruna#123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		String x="//table[@class='F cf zt']/tbody/tr[*]/td[6]/*";
		List<WebElement> lst=driver.findElements(By.xpath(x));
		String expmsg="How to stop doing visual testing manually - Live Webinar";
		for(int i=0;i<lst.size();i++) {
			String subject=lst.get(i).getText();
			if(expmsg.equals(subject))
			{
				lst.get(i).click();
				break;
			}
		}
		
	}

}
