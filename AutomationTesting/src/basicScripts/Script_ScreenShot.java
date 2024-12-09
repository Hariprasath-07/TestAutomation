package basicScripts;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Script_ScreenShot {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a =new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.nature.com");
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) a;
		File Src = screenshot.getScreenshotAs(OutputType.FILE);
		File des = new File("H:/ScreenShot.jpg");
		
		try {
			
			FileHandler.copy(Src, des);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		a.quit();
		
	}

}
