package pac1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureTrendingTopNews {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("https://yahoo.com");
	 String x="//li[@class='trending-list selected']/ul/li";
	 List<WebElement> lst=driver.findElements(By.xpath(x));
	 for(WebElement wb:lst)
	 {
		 System.out.println(wb.getText());
	 }
	 
	}

}
