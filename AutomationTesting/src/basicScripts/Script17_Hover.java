package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script17_Hover {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a =new ChromeDriver();
		
		a.manage().window().maximize();
		
		a.navigate().to("https://www.amazon.in/s?k=flipkart&adgrpid=58988620935&ext_vrnc=hi&hvadid=617779696253&hvdev=c&hvlocphy=9198441&hvnetw=g&hvqmt=e&hvrand=3279731715337371242&hvtargid=kwd-11079835835&hydadcr=5716_2362046&tag=googinhydr1-21&ref=pd_sl_8fz1ehbfup_e");
		
		WebElement men = a.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[1]"));
		
		Actions ac = new Actions(a);
		
		Thread.sleep(2000);
		
		ac.moveToElement(men).perform();
		

	}

}
