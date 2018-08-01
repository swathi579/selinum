package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest1 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Desktop/mypage.html");
WebElement wb=driver.findElement(By.name("sel"));
Select sel=new Select(wb);
boolean status=sel.isMultiple();
if(status) {
	for(int i=0;i<6;i++)
	{
		sel.selectByIndex(i);
	}
}
else 
{
	System.out.println("its not a multi select drop down");
}sel.deselectAll();
driver.close();

}

}

