package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_24 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver address = new FirefoxDriver();
		address.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(address, 10);
		address.navigate().to("https://www.flipkart.com");
		
		List<WebElement> links = address.findElements(By.xpath("//a"));
		int count = links.size();
		
		for (int i = 0; i < count; i++) 
		{
			WebElement link = links.get(i);
			String text = link.getText();
			System.out.println(text);
		}
		address.quit();
		
	}

}
