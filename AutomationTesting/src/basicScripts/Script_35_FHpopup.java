package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_35_FHpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");		
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		
		ref.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		Thread.sleep(2000);
		ref.findElement(By.id("fileInput")).sendKeys("H:\\Resume\\Hariprasath_C.pdf");
		
	}

}
