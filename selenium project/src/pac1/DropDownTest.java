package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement dwb=driver.findElement(By.id("day"));
		Select sel2=new Select(dwb);
		sel2.selectByVisibleText("14");
WebElement mwb=driver.findElement(By.id("month"));
	Select sel=new Select(mwb);
	sel.selectByVisibleText("Dec");
	WebElement ywb=driver.findElement(By.id("year"));
	Select sel1=new Select(ywb);
	sel1.selectByVisibleText("1988");
	}
}


