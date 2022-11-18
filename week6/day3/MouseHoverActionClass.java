package week6.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverActionClass {

	public static void main(String[] args) {
		//Download the driver and set the  path
				WebDriverManager.chromedriver().setup();
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--disable-notifications");
				
				//Launch the chrome browser
				ChromeDriver driver=new ChromeDriver(option);
				//loadb the application url
				driver.get("https://www.flipkart.com/");
				//maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.findElement(By.xpath("//button[text()='✕']")).click();
				WebElement ele = driver.findElement(By.xpath("//div[text()='Fashion']"));
				
				Actions builder=new Actions(driver);
				
				builder.moveToElement(ele).perform();
				
				
				driver.findElement(By.xpath("//a[contains(text(),'T-Shirts')]")).click();
				
	}
}
