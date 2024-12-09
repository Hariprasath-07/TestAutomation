package basic_Frameworks;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase02 extends genericScript
{
	@Test(priority = 1)
	public void psw()
	{
		boolean displayed = ref.findElement(By.id("pass")).isDisplayed();
		boolean enabled = ref.findElement(By.id("pass")).isEnabled();
		Reporter.log(displayed +" "+enabled);
	}
	
}
