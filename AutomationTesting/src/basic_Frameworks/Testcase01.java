package basic_Frameworks;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase01 extends genericScript
{
	@Test(priority = 0)
	public void usn()
	{
		boolean displayed = ref.findElement(By.id("email")).isDisplayed();
		boolean enabled = ref.findElement(By.id("email")).isEnabled();
		Reporter.log(displayed +" "+enabled);
	}
	
}
