package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script19_Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a =new ChromeDriver();
		
		a.manage().window().maximize();
		
		a.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleclick = a.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		
		Actions ac = new Actions(a);
		Thread.sleep(2000);
		ac.doubleClick(doubleclick).perform();
	}

}
