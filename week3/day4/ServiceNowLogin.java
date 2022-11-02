package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowLogin {
public static void main(String[] args) {
	
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
		//Enter the user name as admin
		driver.findElement(By.xpath("(//div[@id='usernamegroup']//input)[1]")).sendKeys("ramkumar.ramaiah@testleaf.com");
		//enter the password as iX-66uY+DwSi
		driver.findElement(By.xpath("//form[@id='login_form']//input[@id='password']")).sendKeys("Password#123");
		//click login button
		driver.findElement(By.xpath("//div[@id='theloginform']//input[@id='Login']")).click();
		
}
}
