package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		Thread.sleep(2000);
		a.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement txt = a.findElement(By.name("search_query"));
		txt.sendKeys("tamil music");
		Thread.sleep(2000);
		WebElement search = a.findElement(By.id("search-icon-legacy"));
		search.click();
		Thread.sleep(2000);
		WebElement play = a.findElement(By.id("thumbnail-container"));
		play.click();

	}

}
