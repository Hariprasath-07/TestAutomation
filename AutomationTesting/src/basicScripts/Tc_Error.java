package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_Error 
{
		public static void main(String[] args) throws Exception 
		{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//WebDriverWait Wd = new WebDriverWait(driver, 10);
			driver.manage().window().maximize();
			driver.navigate().to("https://www.facebook.com");
			WebElement usn = driver.findElement(By.id("email"));
			usn.sendKeys("admin");
			WebElement psw = driver.findElement(By.id("pass"));
			psw.sendKeys("admin");
			Thread.sleep(2000);
			driver.navigate().refresh();
			/*Because of using same ref variable again refreshing also when the object add has 
			 * changed so its showing StateElementReferenceException*/
			 
			usn.sendKeys("admin");
			psw.sendKeys("admin");
		}
}
