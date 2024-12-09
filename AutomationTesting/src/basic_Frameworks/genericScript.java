package basic_Frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class genericScript 
{
	WebDriver ref;
	@Parameters("BrowserName")
	@BeforeMethod
	public void BrowserSetUp(String BrowserName) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		if (BrowserName.equals("chrome")) 
		{
			ref = new ChromeDriver();
		}
		else if(BrowserName.equals("fire"))
		{
			ref = new FirefoxDriver();
		}
		Thread.sleep(2000);
		ref.get("https://www.facebook.com");
		Thread.sleep(2000);
		ref.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowserSetUp() throws Exception
	{
		Thread.sleep(2000);
		ref.quit();
	}
}
