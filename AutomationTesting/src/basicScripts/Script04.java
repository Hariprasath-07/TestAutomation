package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script04 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	}
}
