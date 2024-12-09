package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_33_Aupopup {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		
		ref.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");

	}

}
