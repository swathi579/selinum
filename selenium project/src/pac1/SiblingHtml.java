package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SiblingHtml {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/user/Desktop/sibling.html");
driver.findElement(By.xpath("//img[@src='image1.png']/following-sibling::input[@value='add to cart']")).click();;

	
	}

}
