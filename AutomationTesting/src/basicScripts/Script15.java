package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script15 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.navigate().to("file:///D:/PROJECT/HTML/SELENIUM/webelement.html");
		WebElement usn = a.findElement(By.xpath("(//input[@type='text'])[1]"));
		if(usn.isDisplayed())
		{
			if(usn.isEnabled())
			{
				if(usn.isSelected())
				{
					usn.click();
					System.out.println("it is selected");
				}
				else 
				{
					System.out.println("it is not selected");
				}
			}
			else 
			{
				System.out.println("it is not enabled");
			}
		}
		else 
		{
			System.out.println("it is not displayed");
		}
	}

}
