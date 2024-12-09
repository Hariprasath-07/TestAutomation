package basicScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice02 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		Thread.sleep(2000);
		ref.navigate().to("https://www.apple.com/in/store?afid=p238%7CsdUuvv563-dc_mtid_187079nc38483_pcrid_719882356459_pgrid_109516736379_pntwk_g_pchan__pexid__ptid_kwd-10778630_&cid=aos-IN-kwgo-brand--slid---product-");
		
		JavascriptExecutor js =(JavascriptExecutor) ref;
		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		js.executeScript("document.body.style.zoom='10%'");

	}

}
