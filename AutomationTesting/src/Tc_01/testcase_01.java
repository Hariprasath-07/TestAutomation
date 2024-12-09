package Tc_01;

import org.testng.annotations.Test;

public class testcase_01 extends genericScript
{
	@Test
	public void login() {
		
		LoginPage lp = new LoginPage(ref);
		lp.Enterusn();
		lp.Enterpsw();
		ref.navigate().refresh();
		
	}
	
	
}
