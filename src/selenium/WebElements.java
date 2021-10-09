package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("hellooo");
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("helloo");
		//Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Log In']")).click();
        System.out.println(password.isDisplayed());
        //System.out.println(loginButton.is.Enabled());
        }

}
