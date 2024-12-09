package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_04_Maps {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver a =new ChromeDriver();
	a.manage().window().maximize();
	Thread.sleep(2000);
	a.get("https://www.google.com/maps/@12.9989812,77.5504667,15z?entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D");
	Thread.sleep(2000);
	WebElement Direction = a.findElement(By.cssSelector("button[aria-label='Directions']"));
	Direction.click();
	Thread.sleep(2000);
	WebElement Start = a.findElement(By.xpath("//input[@autocomplete='off' and @aria-label='Choose starting point, or click on the map...']"));
	Start.sendKeys("Rajajinagar");
	Thread.sleep(2000);
	WebElement end = a.findElement(By.xpath("//div[2][@class='sbib_b' and @role='combobox']|//input[@aria-label='Choose destination, or click on the map...']"));
	end.sendKeys("Coonoor");
	Thread.sleep(2000);
	WebElement clk = a.findElement(By.className("google-symbols"));
	clk.click();
	
	}

}
