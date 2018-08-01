package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyFaceBook {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
Thread.sleep(5000);
WebElement imgwb=driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yc/r/GwFs3_KxNjS.png']"));
boolean  imgStat=imgwb.isDisplayed();
if(imgStat) {
	System.out.print("image is displayed");
}else {
	System.out.print("image is not displayed");
}
Thread.sleep(5000);
driver.findElement(By.id("email")).sendKeys("swathipenubolu");
driver.findElement(By.id("pass")).sendKeys("lakshmi@aruna");
Thread.sleep(2000);
driver.findElement(By.id("u_0_8")).submit();

	}

}
