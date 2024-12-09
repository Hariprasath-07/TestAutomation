package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice03 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		Thread.sleep(2000);
		ref.navigate().to("https://www.zomato.com/bangalore/restaurants");
		
		JavascriptExecutor js = (JavascriptExecutor) ref;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
		WebElement filter = ref.findElement(By.xpath("//div[@class='sc-jhaWeW bWqDUj pill_undefined']"));
		filter.click();
		
		Thread.sleep(1000);
		WebElement cur = ref.findElement(By.xpath("//p[.='Cuisines']"));
		cur.click();
		
		Thread.sleep(1000);
		List<WebElement> checkbox = ref.findElements(By.xpath("//input[@type='checkbox']"));
		int noofcountry = checkbox.size();
		
		for (int i = 0; i < noofcountry ; i++)
		{
			WebElement value = checkbox.get(i);
			value.click();
		}
	}

}
