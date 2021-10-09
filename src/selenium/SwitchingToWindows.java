package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToWindows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://naukri.com");
		
		String ParentWinId = driver.getWindowHandle();
		Set<String> childId =driver.getWindowHandles();
		for(String winID:childId)
		{
			driver.switchTo().window(winID);
			String titleOfPage = driver.getTitle();
			if(titleOfPage.equalsIgnoreCase("tech mahindra"))
			{
				driver.manage().window().maximize();
			}
			else
			{
				driver.close();
			}
			
		}
	}

}
