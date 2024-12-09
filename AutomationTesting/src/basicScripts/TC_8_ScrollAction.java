package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_8_ScrollAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver rf = new ChromeDriver();
		rf.manage().window().maximize();
		Thread.sleep(2000);
		rf.get("https://www.amazon.in/");
		WebElement fbk = rf.findElement(By.xpath("//a[contains(.,'Facebook')]"));
		Point loc = fbk.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor js=(JavascriptExecutor) rf;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}

}
