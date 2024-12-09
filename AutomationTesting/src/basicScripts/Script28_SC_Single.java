package basicScripts;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Script28_SC_Single {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		Thread.sleep(2000);
		ref.get("https://www.meesho.com/search?q=denem%20jacket%20men&searchType=autosuggest&searchIdentifier=text_search");
		
		Date d = new Date();
		System.out.println(d.toString());
		
		WebElement search = ref.findElement(By.xpath("//div[@class='sc-ftTHYK cRaSHh']"));
		File temp = search.getScreenshotAs(OutputType.FILE);
		File per = new File("./Screenshots/Defect2.png");
		FileHandler.copy(temp, per);
		Thread.sleep(2000);
		ref.quit();
	}

}
