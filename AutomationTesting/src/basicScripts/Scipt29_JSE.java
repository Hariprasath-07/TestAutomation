package basicScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scipt29_JSE {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver rf = new ChromeDriver();
		rf.manage().window().maximize();
		Thread.sleep(2000);
		rf.get("file:///D:/PROJECT/HTML/SELENIUM/JSE_DisabledElement.html");
		JavascriptExecutor js =(JavascriptExecutor) rf;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('a1').value=''");

	}

}
