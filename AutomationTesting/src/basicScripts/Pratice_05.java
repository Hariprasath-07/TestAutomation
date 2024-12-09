package basicScripts;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice_05 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver ref = new ChromeDriver();
        ref.manage().window().maximize();
        ref.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ref.navigate().to("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
        Thread.sleep(2000);
        WebElement button = ref.findElement(By.id("browserButton3"));
        button.click();
        Thread.sleep(2000);
        Set<String> brow = ref.getWindowHandles();
        ArrayList<String> e = new ArrayList<String>(brow);
        int count = e.size();
        for (int i = 0; i < count; i++) 
        {
        	if(i!=0)
        	{
        		Thread.sleep(2000);
			String win = e.get(i);
			ref.switchTo().window(win);
			String title = ref.getTitle();
			System.out.println(title);
			ref.close();
        	}
		}
        
    }
}
