package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_6 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a =new ChromeDriver();
		a.manage().window().maximize();
		Thread.sleep(2000);
		a.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		WebElement dd = a.findElement(By.xpath("(//select[@aria-invalid='false'])[1]"));
		Select s =  new Select(dd);
		
		if(s.isMultiple())
		{
		List<WebElement> all_values = s.getOptions();
		for(int i=0;i<all_values.size();i++)
			{
				Thread.sleep(1000);
				s.selectByIndex(i);
				WebElement clk = a.findElement(By.xpath("//button[.='Add']"));
				clk.click();
		
			}
		}
		else
		{
			System.out.println("the dropdown is single select");
		}
		a.quit();

	}

}
