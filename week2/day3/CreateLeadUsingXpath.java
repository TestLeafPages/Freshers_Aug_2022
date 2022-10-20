package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadUsingXpath {
public static void main(String[] args) {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//To maximize the browser
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanger");
	
	driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
	
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	
	
	
	
	
}
}
