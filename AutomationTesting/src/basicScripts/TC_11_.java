package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_11_ {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		ref.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) ref;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement child1 = ref.findElement(By.xpath("(//a[@class=\"card-link\"])[1]"));
				
		WebElement child2 =ref.findElement(By.xpath("(//a[@class='card-link'])[4]"));
		
		WebElement child3 =ref.findElement(By.xpath("(//a[@class='card-link'])[10]"));
		
		WebElement child4 =ref.findElement(By.xpath("(//a[@class='card-link'])[13]"));
		
		
		
		ArrayList<WebElement> arr =new ArrayList<WebElement>();
		arr.add(child1);
		arr.add(child2);
		arr.add(child3);
		arr.add(child4);
		Actions a =new Actions(ref);
		
		for(int i=1;i<arr.size();i++) 
		{
			WebElement value = arr.get(i);
			Thread.sleep(1000);
			a.contextClick(value).perform();
			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
		}
	}

}
