package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver w =new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.navigate().to("https://www.gmail.com");
		
		w.navigate().back();
		
		Thread.sleep(2000);
		
		w.navigate().forward();
		
		Thread.sleep(2000);
		
		w.navigate().refresh();
		
	}

}
