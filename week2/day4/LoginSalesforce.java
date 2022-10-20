package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSalesforce {
public static void main(String[] args) {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://quadrantresource3-dev-ed.my.salesforce.com/");
	//To add Implicitlywait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//To maximize the browser
	driver.manage().window().maximize();
	//Enter the UserName
	driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
	//Enter the password
	driver.findElement(By.id("password")).sendKeys("Password#123");
	
	//click login Button
	driver.findElement(By.id("Login")).click();
	
	
	//click view icon
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	//click view all
	driver.findElement(By.xpath("//button[text()='View All']")).click();
}
}
