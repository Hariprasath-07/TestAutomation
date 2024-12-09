package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Pratice03_ChatGTP1 {
//	Task: Automate a Login Page
//	Open a browser and navigate to https://www.saucedemo.com/.
//	Maximize the browser window.
//	Locate and fill in the username (standard_user) and password (secret_sauce).
//	Click the Login button.
//	Verify if the login was successful by checking if the URL contains /inventory.html.
//	Log the result in the console: "Login Successful" or "Login Failed".
//	Close the browser.
//	Bonus Challenge:
//	Use explicit wait to ensure elements are interactable before performing actions.
//	Capture a screenshot of the logged-in page.
//	Once Done:
//	Share your approach and results with me.
//	I'll review it and provide feedback with a rating. 😊

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		Thread.sleep(1000);
		ref.navigate().to("https://www.saucedemo.com/");
		ref.manage().window().maximize();
		
		WebElement usn = ref.findElement(By.id("user-name"));
		usn.sendKeys("standard_user");
		
		Thread.sleep(1000);
		WebElement pwd = ref.findElement(By.id("password"));
		pwd.sendKeys("secret_sauce");
		
		Thread.sleep(1000);
		WebElement lgn = ref.findElement(By.id("login-button"));
		lgn.click();
		
		String url = ref.getCurrentUrl();
		System.out.println(url);
		String check = "/inventory.html";
		if(url.contains(check))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
		TakesScreenshot ts = (TakesScreenshot) ref;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File per = new File("./Screenshots/Screenshot1.jpg");
		FileHandler.copy(temp, per);
		ref.close();

	}

}
