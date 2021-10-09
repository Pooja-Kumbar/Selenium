package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{
	
		public static void main(String[] args) throws IOException, InterruptedException
		{
			
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/");
		 Thread.sleep(3000);
		 WebElement fnt=driver.findElement(By.name("username"));
		 //TakesScreenshot ts=(TakesScreenshot) driver;
		 File src=fnt.getScreenshotAs(OutputType.FILE);
		 File destFile=new File("./errorshots/ScreenshotofInsta.png");
		
		
		}


}
