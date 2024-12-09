package basic_Frameworks;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase03 extends genericScript
{
	@Test(priority = 2)
	public void title()
	{
		Reporter.log(ref.getTitle());
	}
	
}
