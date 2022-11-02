package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNavigationComments {
public static void main(String[] args) throws InterruptedException {
	
	//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://login.salesforce.com/");
		//To add Implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//To maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		
		
		driver.navigate().forward();
		
		
		driver.navigate().refresh();
		
		
}
}
