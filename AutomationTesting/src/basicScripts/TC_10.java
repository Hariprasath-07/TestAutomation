package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		Thread.sleep(1000);
		ref.navigate().to("https://www.amazon.com/");
		ref.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement value = ref.findElement(By.id("twotabsearchtextbox"));
		value.sendKeys("Wrist Watch");
		
		Thread.sleep(1000);
		WebElement search = ref.findElement(By.id("nav-search-submit-button"));
		search.click();
		
		JavascriptExecutor js=(JavascriptExecutor) ref;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement olveyaa = ref.findElement(By.xpath("//span[.=\"OLEVS\"]"));
		olveyaa.click();
		
		WebElement lea = ref.findElement(By.xpath("//span[.='Leather']"));
		lea.click();
		
		WebElement first = ref.findElement(By.xpath("(//div[@class=\"a-section a-spacing-base\"])[1]"));
		first.click();
		
	}

}
