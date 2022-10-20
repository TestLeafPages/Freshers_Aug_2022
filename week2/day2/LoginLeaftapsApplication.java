package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftapsApplication {
public static void main(String[] args) {
	//Download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	//Load the Application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//Maximize thge browser
	driver.manage().window().maximize();
	
	//enter the UserName as Demosalesmanager
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//enter the passsword as crmsfa
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//Click Login button
	driver.findElement(By.className("decorativeSubmit")).click();
	
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	
	String title = driver.getTitle();
	System.out.println(title);
	
	
	
	
}
}
