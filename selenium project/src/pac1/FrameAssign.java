package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameAssign {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://yahoo.com");
		driver.switchTo().frame("my-adsLREC-iframe");
		driver.switchTo().frame("sb_rel_my-adsLREC-iframe");
		driver.switchTo().frame("my-adsLREC");

	}

}
