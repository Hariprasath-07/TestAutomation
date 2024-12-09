package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_05 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver a =new FirefoxDriver();
		a.navigate().to("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		
		WebElement first= a.findElement(By.xpath("(//button[.='Yes'])[1]"));
		first.click();
		
		Thread.sleep(2000);
		
		WebElement Second= a.findElement(By.xpath("(//button[.='Yes'])[2]"));
		Second.click();
		
		Thread.sleep(2000);
		
		WebElement one = a.findElement(By.xpath("//button[@id='btn4']"));
		one.click();
		Thread.sleep(2000);
		
		WebElement two = a.findElement(By.xpath("//button[@id='btn5']"));
		two.click();
		Thread.sleep(2000);
		
		WebElement three = a.findElement(By.xpath("//button[@id='btn6']"));
		three.click();
		Thread.sleep(2000);
		
		WebElement four = a.findElement(By.xpath("//button[@id='btn7']"));
		four.click();
		Thread.sleep(2000);
		
		WebElement five = a.findElement(By.xpath("//button[@id='btn8']"));
		five.click();
		Thread.sleep(2000);
		
		
	}

}
