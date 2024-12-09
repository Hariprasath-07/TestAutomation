package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script31_JSE_WithoutID {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver rf = new ChromeDriver();
		rf.manage().window().maximize();
		Thread.sleep(2000);
		rf.get("https://en.wikipedia.org/wiki/India");
		
	WebElement ele = rf.findElement(By.xpath("//h3[.='Ancient India']"));	
	JavascriptExecutor js = (JavascriptExecutor) rf;
//	js.executeScript("arguments[0].value=''",usn);
	Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView()",ele);
	
	
		

	}

}
