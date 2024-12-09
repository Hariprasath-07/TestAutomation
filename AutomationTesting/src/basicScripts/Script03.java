package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script03 {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	}

}
