package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		Actions action = new Actions(driver);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement srcElement = driver.findElement(By.linkText("BANK"));
		WebElement destElement = driver.findElement(By.id("bank"));
		Thread.sleep(3000);
		//action.dragAndDrop(srcElement, destElement).perform();
		action.contextClick(srcElement).perform();		

	}

}
