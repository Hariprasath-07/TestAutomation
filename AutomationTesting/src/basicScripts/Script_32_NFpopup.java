package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Script_32_NFpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-Notifications");
		
		WebDriver ref = new ChromeDriver(op);
		ref.manage().window().maximize();
		
		ref.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		
		Thread.sleep(2000);
		WebElement ntf = ref.findElement(By.id("browNotButton"));
		ntf.click();
	}

}
