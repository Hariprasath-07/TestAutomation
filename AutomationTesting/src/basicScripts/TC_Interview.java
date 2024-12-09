package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Interview {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver ref = new ChromeDriver(op);
		ref.manage().window().maximize();
		ref.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
		WebDriverWait wait = new WebDriverWait(ref, 10);
		
		ref.findElement(By.id("txtOriginGeneral")).click();
		ref.findElement(By.xpath("(//div[@class=\"select2-result-label\"])[2]")).click();
		
		Thread.sleep(2000);
		ref.findElement(By.id("txtDestinationGeneral")).click();
		ref.findElement(By.xpath("(//div[@class=\"select2-result-label\"])[2]")).click();
		
		Thread.sleep(2000);
		ref.findElement(By.xpath("(//div[contains(.,'Depart Date')])[7]")).click();
		ref.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		ref.findElement(By.xpath("//a[.='20']")).click();
		
		Thread.sleep(2000);
		ref.findElement(By.id("btnBusSearchNewGeneral")).click();
		Thread.sleep(2000);
		ref.findElement(By.xpath("//button[.='Cheapest']")).click();
		
		JavascriptExecutor js =(JavascriptExecutor) ref;
		js.executeScript("window.scrollBy(0,500)");
		
		ref.findElement(By.xpath("(//b[.='SELECT'])[1]")).click();
		
		
		
		for (int i = 5; i < 8; i++) {
			WebElement seat = wait.until(ExpectedConditions.elementToBeClickable(
			By.xpath("//div[@class='seat' and .//small[text()='"+i+"B']]")));
			seat.click(); 
			WebElement seat1 = wait.until(ExpectedConditions.elementToBeClickable(
			By.xpath("//div[@class='seat' and .//small[text()='"+i+"C']]")));
			seat1.click();
		}
		
		WebElement proc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button' and .//span[.='Proceed']])[2]")));
		proc.click();
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		ref.quit();
	}
	
}
