package pac1;



import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstProg {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		String actUrl=driver.getCurrentUrl();
		System.out.println(actUrl);
		String acthtmlcode=driver.getPageSource();
		System.out.println(acthtmlcode);
		driver.close();

	}

}
