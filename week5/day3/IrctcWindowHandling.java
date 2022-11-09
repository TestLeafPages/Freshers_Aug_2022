package week5.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcWindowHandling {
public static void main(String[] args) {
	//Download the driver and set the  path
	WebDriverManager.chromedriver().setup();
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	
	//Launch the chrome browser
	ChromeDriver driver=new ChromeDriver(option);
	//loadb the application url
	driver.get("https://www.irctc.co.in/nget/train-search");
	//maximize the browser
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
 driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
 String title = driver.getTitle();
 System.out.println(title);
 String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
}
}
