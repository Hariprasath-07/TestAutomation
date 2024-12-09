package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script07_PS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver a = new FirefoxDriver();
		a.get("https://www.Ajio.com");
		Thread.sleep(2000);
		a.manage().window().maximize();
		
		String ps = a.getPageSource();
		System.out.println(ps);

	}

}
