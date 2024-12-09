package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_34_Hiddenpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		ref.get("https://www.redbus.com");
		ref.findElement(By.id("date-box")).click();
		ref.findElement(By.xpath("//span[.='21']")).click();
		
		Thread.sleep(5000);
		ref.quit();

	}

}
