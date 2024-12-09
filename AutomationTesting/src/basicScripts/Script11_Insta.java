//Login into Instagram using CssSelector
package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script11_Insta {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver a = new FirefoxDriver();
		a.manage().window().maximize();
		Thread.sleep(2000);
		a.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement usn = a.findElement(By.cssSelector("input[name ='username']"));
		Thread.sleep(2000);
		usn.sendKeys("hariprasathyugan07@gmail.com");
		WebElement psw = a.findElement(By.cssSelector("input[type='password']"));
		Thread.sleep(2000);
		psw.sendKeys("Shiyamala7&");
		WebElement lgn = a.findElement(By.cssSelector("div[class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"));
		Thread.sleep(2000);
		lgn.click();
	}

}
