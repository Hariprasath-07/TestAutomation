package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Script27_SC {

	public static void main(String[] args) throws InterruptedException, Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		Thread.sleep(2000);
		ref.get("https://www.meesho.com");
		
		TakesScreenshot ts =(TakesScreenshot) ref;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File per =new File("./Screenshots/Defect1.png");
		FileHandler.copy(temp, per);
		ref.quit();

	}

}
