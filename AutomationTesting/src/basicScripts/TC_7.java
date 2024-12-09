package basicScripts;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TC_7 {

	public static void main(String[] args) throws InterruptedException, Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		Thread.sleep(2000);
		
		ref.get("https://www.Ajio.com/");
		List<WebElement> Links = ref.findElements(By.xpath("//img"));
		int noOfLinks = Links.size();
		
		for (int i = 1; i < noOfLinks; i++) 
		{
			WebElement link = Links.get(i);
			File temp = link.getScreenshotAs(OutputType.FILE);
			File perm = new File("./Screenshots/" + i + "_link.png");
			FileHandler.copy(temp, perm);
		}
		
		ref.quit();
	}

}
