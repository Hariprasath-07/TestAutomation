package basicScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_09 
{

	public static void main(String[] args) throws Exception
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
		
		Thread.sleep(1000);
		WebElement first = ref.findElement(By.xpath("(//div [@class=\"inventory_item_name \"])[1]"));
		first.click();
		
		WebElement name = ref.findElement(By.xpath("//div[@class=\"inventory_details_name large_size\"]"));
		String valuename = name.getText();
		
		
		WebElement price = ref.findElement(By.xpath("//div[@class=\"inventory_details_price\"]"));
		String valueprice = price.getText();
		
		 String org = valueprice.replace("$","");
		 System.out.println(org);
		
		 
		Thread.sleep(1000);
		WebElement addtoCart = ref.findElement(By.id("add-to-cart"));
		addtoCart.click();
		
		WebElement cart = ref.findElement(By.id("shopping_cart_container"));
		cart.click();
		
		WebElement name1 = ref.findElement(By.xpath("//div[@class=\"inventory_item_name\"]"));
		String value1name = name1.getText();
		
		WebElement price1 = ref.findElement(By.xpath("//div[@class=\"inventory_item_price\"]"));
		String value1price = price1.getText();
		
		if(valuename.equals(value1name) && org.equals(value1price))
		{
			System.out.println("The values are matching  "+valuename+ "   "+valueprice);
		}
		else
		{
			System.out.println("The values are not matching");
		}
		
		
		WebElement Hamburger = ref.findElement(By.id("react-burger-menu-btn"));
		Hamburger.click();
		
		Thread.sleep(1000);
		WebElement Logout = ref.findElement(By.id("logout_sidebar_link"));
		Logout.click();
		
		ref.quit();
		
		
		

	}

}
