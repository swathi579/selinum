package pac;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;

	public class BaseClass1{
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void configBC(String bName) {
		if(bName.equals("firefox")) {
			driver=new FirefoxDriver();
				
	}else if(bName.equals("chrome")) {	
	System.setProperty("webdriver.chrome.driver", "‪/selenium project/chromedriver.exe");
	driver=new ChromeDriver();
	}
	}

	@AfterMethod
	public void configAM() {
		System.out.println("logout");
		driver.findElement(By.linkText("Logout")).click();
		}
	@AfterClass
	public void configAC() {
		System.out.println("===close browser===");
		driver.close();
	}
		
	}



