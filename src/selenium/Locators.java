package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 ChromeDriver d = new ChromeDriver();
		 d.manage().window().maximize();
		 
		 d.get("https://www.instagram.com/");
		 
		 d.findElement(By.id("Firstnametextfield")).sendKeys("hello");
		 
		 d.findElement(By.id("Firstnametextfield")).sendKeys("hello");
		 
		 d.findElement(By.name("lastnametextfield")).sendKeys("fromHyperActiveBatch");
		 
		 d.findElement(By.className("username")).sendKeys("TYHTD");
		 
		 d.findElement(By.name("password")).sendKeys("demo");
		 
		 //d.findElement(By.tagName("a")).click();
		 
		 d.findElement(By.linkText("Google")).click();
		 
		 d.findElement(By.partialLinkText("Goo")).click();
		 
		 d.findElement(By.cssSelector("input")).click();
	}

}
