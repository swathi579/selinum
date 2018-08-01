package pac1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTest {

	public static void main(String[] args) throws Throwable {
		FirefoxDriver driver=new FirefoxDriver();
				driver.navigate().to("https://gmail.com");
		driver.findElementByXPath("//span[text()='Create account']").click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
			
	}

}
