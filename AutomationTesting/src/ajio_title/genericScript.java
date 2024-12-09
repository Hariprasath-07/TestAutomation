package ajio_title;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class genericScript 
{
	static WebDriver ref;
	
	@BeforeMethod
	public static void BrowserSetUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ref = new ChromeDriver();
		ref.manage().window().maximize();
		Thread.sleep(2000);
		ref.get("https://www.ajio.com");
		
	}
	
	@AfterMethod
	public static void CloseBrowserSetUp()
	{
		ref.quit();
	}
}
