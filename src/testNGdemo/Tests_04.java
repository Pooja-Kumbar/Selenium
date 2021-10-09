package testNGdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tests_04
{
	 @Test(groups="functional")
	  public void ajio()
	  {
		  Reporter.log("from ajio",true);
	  }
}
