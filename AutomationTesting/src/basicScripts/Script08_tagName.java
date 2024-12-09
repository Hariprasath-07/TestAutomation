package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script08_tagName {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver a = new FirefoxDriver();
		Thread.sleep(2000);
		a.manage().window().maximize();
		a.get("file:///D:/PROJECT/HTML/SELENIUM/DummyLink.html");
		Thread.sleep(2000);
		WebElement op = a.findElement(By.tagName("a"));
		op.click();
		
	}

}
