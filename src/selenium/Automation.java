package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automation
{
   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		//Demonstration of get method
		d.get("https://www.instagram.com/");
		
		//Demonstration of getTitle method
		System.out.println(d.getTitle());
		
		//Demonstration of getCurrentUrl method
		System.out.println(d.getCurrentUrl());
   }
}
