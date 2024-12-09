package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_01 {

	
		@Test
		public void testcase1()
		{
			Reporter.log("hello",true);
		}
		
		@Test
		public void testcase2()
		{
			Reporter.log("Good morning",true);
		}
	

}
