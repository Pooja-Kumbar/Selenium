package testNGdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tests_01
{
	public class Tests_02
	{
	  /*@Test(priority=1)//we can for both
	  public void Myntra()
	  {
		  Reporter.log("from Myntra",true);
	  }
	  
	    @Test(priority=3)
	    public void Flipkart()
	    {
	  	  Reporter.log("from flipkart",true);
	    }*/
		
		@Test(invocationCount=3)
		  public void Myntra()
		  {
			  Reporter.log("from Myntra",true);
		  }
	  
		 /*@Test(enabled=false)
		    public void Flipkart()
		    {
		  	  Reporter.log("from flipkart",true);
		    }*/
	}
	

}
