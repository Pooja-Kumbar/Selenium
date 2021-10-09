package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShoot {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/");
	    
        TakesScreenshot ts=(TakesScreenshot) driver;//UPcasted
        File Screenshot = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./errorshots/ScreenshotofInsta.png");
        FileUtils.copyFile(Screenshot,destFile);
	}

}
