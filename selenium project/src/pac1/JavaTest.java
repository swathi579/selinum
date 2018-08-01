package pac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/user/Desktop/mypage.html");
String expval="java";
boolean flag=false;
WebElement wb=driver.findElement(By.name("sel"));
Select sel=new Select(wb);
List<WebElement>lst=sel.getOptions();
System.out.println(lst.size());
for(WebElement wbOption:lst)
{
	String actVal=wbOption.getText();
	if(expval.equals(actVal))
	{
		sel.selectByVisibleText(expval);
		
	}
	System.out.println(expval+"==>option is available==PASS");
	flag=true;
	break;
}
	
	if(flag==false) {
		System.out.println(expval+"==>option is not available==FAIL");		
	
}

	}

}
