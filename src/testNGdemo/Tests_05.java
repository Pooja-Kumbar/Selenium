package testNGdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tests_05
{
	 @Test(groups="smoke")
	  public void meesho()
	  {
		  Reporter.log("from meesho",true);
	  }
}
