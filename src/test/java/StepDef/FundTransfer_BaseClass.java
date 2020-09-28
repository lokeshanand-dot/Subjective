package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FundTransfer_BaseClass
{
	static WebDriver driver;
	
	public static void chrome()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\CucumberMaven\\CucumberMaven\\driver\\chromedriver.exe");
			
		 driver=new ChromeDriver();
		driver.get("http://demo.rapidtestpro.com/login.php");
	 }
	
	public static void login()
	{
		
	}
}
