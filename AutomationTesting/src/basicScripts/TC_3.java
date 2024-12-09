package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver a = new FirefoxDriver();
		a.manage().window().maximize();
		Thread.sleep(2000);
		a.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");	
		WebElement dropdown = a.findElement(By.id("select2"));
		Select s=new Select(dropdown);
		//int count=s.getOptions().size();
		s.selectByIndex(0);

	}

}
