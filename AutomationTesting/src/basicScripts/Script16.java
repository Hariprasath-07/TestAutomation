package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script16 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		Thread.sleep(2000);
		a.navigate().to("https://www.hotstar.com/in/explore");
		WebElement search = a.findElement(By.xpath("//input[@type='text' and @id='searchBar']"));
		String text = search.getAttribute("placeholder");
		Thread.sleep(2000);
		System.out.println(text);
		a.quit();

	}

}
