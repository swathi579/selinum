package pac1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDriven {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Desktop\\eclipse-java-oxygen-1a-win32-x86_64\\eclipse\\selenium project\\src\\pac1\\Commondata.Properties");
Properties pObj=new Properties();
pObj.load(fis);
String USER=pObj.getProperty("username");
String PSW=pObj.getProperty("password");
String URL=pObj.getProperty("url");
System.out.println(USER);
System.out.println(PSW);
System.out.println(URL);
WebDriver driver=new FirefoxDriver();
driver.get(URL);
driver.findElement(By.name("username")).sendKeys(USER);
driver.findElement(By.name("pwd")).sendKeys(PSW);

	}

}
