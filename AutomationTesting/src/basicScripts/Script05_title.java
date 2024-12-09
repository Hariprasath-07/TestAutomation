package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script05_title {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a = new ChromeDriver();
		Thread.sleep(2000);
		a.get("https://www.Ajio.com");
		a.manage().window().maximize();
		Thread.sleep(2000);
		String title = a.getTitle();
		System.out.println(title);
		

	}

}
