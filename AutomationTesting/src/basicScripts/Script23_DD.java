package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script23_DD {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a =new ChromeDriver();
		a.manage().window().maximize();
		Thread.sleep(2000);
		a.get("file:///D:/PROJECT/HTML/SELENIUM/Dropdown.html");
		WebElement dd = a.findElement(By.id("celebrities"));
		Select s=new Select(dd);
		if(s.isMultiple())
		{
			s.selectByIndex(0);
			Thread.sleep(2000);
			s.selectByValue("k");
			Thread.sleep(2000);
			s.selectByVisibleText("PT Usha");
		}
		else
		{
			System.out.println("The dropdown is single select");
		}
		
		a.quit();
	}

}
