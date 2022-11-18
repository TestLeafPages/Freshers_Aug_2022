package week6.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) {
		//Download the driver and set the  path
				WebDriverManager.chromedriver().setup();
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--disable-notifications");
				
				//Launch the chrome browser
				ChromeDriver driver=new ChromeDriver(option);
				//loadb the application url
				driver.get("https://www.snapdeal.com/");
				//maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//driver.findElement(By.xpath("//button[text()='✕']")).click();
				WebElement ele = driver.findElement(By.xpath("(//span[contains(text(),'Fashion')])[1]"));
				
				Actions builder=new Actions(driver);
				
				builder.moveToElement(ele).perform();
				
				
				driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
				
				//get the count of shoes
				String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
				System.out.println(text);
				
				//driver.close();
	}
}
