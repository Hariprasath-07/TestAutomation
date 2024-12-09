package basicScripts;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script13 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver w =new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		
		Dimension d=new Dimension(200, 400);
		w.manage().window().setSize(d);

	}

}
