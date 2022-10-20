package week2.day4;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnImplicitlyWait {
public static void main(String[] args) throws InterruptedException {
	//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//To add Implicitlywait
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//To maximize the browser
		driver.manage().window().maximize();
		//enter the username as demosalesmanager
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='username']"))
		.sendKeys("Demosalesmanger",Keys.TAB);
		
		//enter the password as crmsfa
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		//click login button
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
}
}
