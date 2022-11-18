package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {
public static void main(String[] args) {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//Launch the browser
	ChromeDriver driver = new ChromeDriver();
	//Load the  application url
	driver.get("https://www.leafground.com/waits.xhtml");
	//maximize the browser
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement until = wait
			.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));
	until.click();
	String visible = until.getText();
	System.out.println(visible);
	
	
} 

}
