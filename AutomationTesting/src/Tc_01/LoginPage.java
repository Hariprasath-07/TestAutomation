package Tc_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	@FindBy(id="email")
	private WebElement usn;
	@FindBy(id="pass")
	private WebElement psw;
	@FindBy(name="login")
	private WebElement login;
	
	LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Enterusn()
	{
		usn.sendKeys("admin");
	}
	
	public void Enterpsw()
	{
		psw.sendKeys("admin");
	}
	
	public void clickLogin()
	{
		login.click();;
	}
}
