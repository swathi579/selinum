package pac1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaTest3 {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/user/Desktop/mypage.html");
		WebElement wb=driver.findElement(By.name("sel"));
		Select sel=new Select(wb);
	List<WebElement>lst=sel.getOptions();
		
	for(WebElement wbOption:lst) {
		String actVal=wbOption.getText();
		if(actVal.startsWith("a"))
		sel.selectByVisibleText(actVal);
		
	}

}
}

