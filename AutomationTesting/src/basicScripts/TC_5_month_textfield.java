package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_5_month_textfield {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a =new ChromeDriver();
		a.manage().window().maximize();
		Thread.sleep(2000);
		a.get("https://www.facebook.com/r.php");
		WebElement dd = a.findElement(By.id("month"));
		Select s = new Select(dd);
		
		List<WebElement> All_values = s.getOptions();
		System.out.println(All_values.size());
		
		for (int i = 0; i < All_values.size(); i++) 
		{
			WebElement options = All_values.get(i);
			String text = options.getText();
			System.out.println(text);
		}
		
		a.quit();
	}

}
