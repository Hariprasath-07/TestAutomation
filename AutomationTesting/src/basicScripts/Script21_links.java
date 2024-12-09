package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script21_links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.flipkart.com/");
		List<WebElement> links = a.findElements(By.xpath("//a"));
		int count=links.size();
		for (int i = 0; i < count; i++) 
		{
			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			System.out.println(i+" "+url);
		}
		a.quit();

	}

}
