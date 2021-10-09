package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemonstractionOfActionClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://myntra.com");
		Thread.sleep(3000);
		WebElement Element = driver.findElement(By.linkText("WOMEN"));
		
		
		//Thread.sleep(3000);
		//Actions action = new Actions(driver);
	    //action.contextClick(Element);
		
		

	}

}
