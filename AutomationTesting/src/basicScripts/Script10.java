package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script10 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver a = new FirefoxDriver();
		a.manage().window().maximize();
		Thread.sleep(2000);
		a.get("file:///D:/PROJECT/HTML/SELENIUM/CssSelector_Automation.html");
		WebElement txt= a.findElement(By.cssSelector("input[type='text']"));
		Thread.sleep(2000);
		txt.sendKeys("Haripeasath C");
		WebElement cb= a.findElement(By.cssSelector("input[type='checkbox']"));
		Thread.sleep(2000);
		cb.click();
		WebElement rb= a.findElement(By.cssSelector("input[type='radio']"));
		Thread.sleep(2000);
		rb.click();
		WebElement link= a.findElement(By.cssSelector("a[href='https://www.youtube.com']"));
		Thread.sleep(2000);
		link.click();
		Thread.sleep(2000);
		a.quit();

	}

}
