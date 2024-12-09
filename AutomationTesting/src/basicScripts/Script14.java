package basicScripts;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script14 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver w =new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		
		Point p=new Point(250,500);
		
		w.manage().window().setPosition(p);
		

	}

}
