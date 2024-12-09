package basicScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script30_ScrollAction {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver rf = new ChromeDriver();
		rf.manage().window().maximize();
		Thread.sleep(2000);
		rf.get("https://www.amazon.in/");
		JavascriptExecutor js =(JavascriptExecutor) rf;
		for (int i = 0; i < 3; i++) 
		{
			js.executeScript("window.scrollBy(0,1000)");
		}
		for (int i = 0; i < 3; i++) 
		{
			js.executeScript("window.scrollBy(0,--1000)");
		}
		
		

	}

}
