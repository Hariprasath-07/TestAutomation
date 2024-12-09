package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script09_id {

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("file:///D:/PROJECT/HTML/SELENIUM/DummyLink.html");
		a.manage().window().maximize();
		Thread.sleep(2000);
		WebElement op = a.findElement(By.id("l1"));
		op.click();
	}

}
