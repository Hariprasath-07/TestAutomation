// open Chrome --> enter the URl Flipkart and close after 5sec and immediately 
// open firefox browser and enter url --> Netflix and quit the browser after 10 sec...


package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		a.close();
		
		System.out.println("The chrome application has opened");
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver b = new FirefoxDriver();
		b.get("https://www.netflix.com/");
		Thread.sleep(10000);
		b.quit();
		
		System.out.println("The firefox application has opened");

	}

}
