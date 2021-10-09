package testNGdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tests_03 
{
     @Test(groups="smoke")
	  public void Amazon()
	  {
		  Reporter.log("from amazon",true);
	  }
	
}
