package Tc_01;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class genericScript 
{
	public WebDriver ref;
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void browserSetUp(String BrowserName)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		
		if(BrowserName.equals("chrome"))
		{
			ref = new ChromeDriver();
		}
		else if(BrowserName.equals("fire"))
		{
			ref = new FirefoxDriver();
		}
		ref.manage().window().maximize();
		//ref.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ref.navigate().to("https://www.facebook.com");
		
	}
	
	@AfterMethod
	public void closeBrowserSetUp() throws InterruptedException
	{
		Thread.sleep(3000);
		ref.quit();
	}
	

}
