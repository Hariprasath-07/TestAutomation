package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script20_Count {

	public static void main(String[] args) 
	{
			
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=17399748546615254030&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198441&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		List<WebElement> links = a.findElements(By.xpath("//a"));
		int count=links.size();
		System.out.println(count);
		a.quit();

	}

}
