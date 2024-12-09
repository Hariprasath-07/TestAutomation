package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script24 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a =new ChromeDriver();
		a.manage().window().maximize();
		Thread.sleep(2000);
		a.get("file:///D:/PROJECT/HTML/SELENIUM/Dropdown.html");
		WebElement dd = a.findElement(By.id("celebrities"));
		Select s = new Select(dd);
		
		if (s.isMultiple()) 
		{
			List<WebElement> all_values = s.getOptions();
			System.out.println(all_values.size());
			
			ArrayList<String> Final = new ArrayList<String>();
			
			LinkedList<String> Final1 = new LinkedList<String>();
			
			
			
			for(int i=0;i<all_values.size();i++)
			{
				WebElement opt = all_values.get(i);
				String txt = opt.getText();
				Final.add(txt);
				Final1.add(txt);
			}
			
			System.out.println("Sorting in ASCENDING VALUES");
			Collections.sort(Final);
			for (String ar : Final) 
			{
				System.out.println(ar);
			}
			
			System.out.println("Sorting in DESCENDING VALUES");
			Collections.sort(Final1,Collections.reverseOrder());
			for (String ar : Final1) 
			{
				System.out.println(ar);
			}
			a.quit();
		}
		
		else
		{
		
				System.out.println("The drop down is Single Select");
		}
		
	}

}
