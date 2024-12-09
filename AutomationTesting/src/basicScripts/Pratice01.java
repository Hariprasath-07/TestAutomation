package basicScripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Pratice01 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		Thread.sleep(2000);
		ref.navigate().to("https://remasto.com/");
		Thread.sleep(1000);
		WebElement search = ref.findElement(By.xpath("//input[@role='combobox']"));
//		
//		TakesScreenshot ts =(TakesScreenshot) ref;
		
		Thread.sleep(1000);
		File temp = search.getScreenshotAs(OutputType.FILE);
		File per =new File("./Screenshots/Interviw1.jpg");
		FileHandler.copy(temp, per);
		ref.quit();
		

	}

}
