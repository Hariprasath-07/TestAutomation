package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver a = new FirefoxDriver();
		a.manage().window().maximize();
		Thread.sleep(2000);
		a.get("https://demoapps.qspiders.com/ui");
		WebElement ne = a.findElement(By.name("name"));
		Thread.sleep(2000);
		ne.sendKeys("Its you");
		WebElement em = a.findElement(By.name("email"));
		Thread.sleep(2000);
		em.sendKeys("Qspiders1234@gmail.com");
		WebElement psw = a.findElement(By.cssSelector("input[placeholder='Enter your password']"));
		Thread.sleep(2000);
		psw.sendKeys("Qspider@1234");
		WebElement lgn = a.findElement(By.cssSelector("button[type='submit']"));
		Thread.sleep(2000);
		lgn.click();
	}

}
