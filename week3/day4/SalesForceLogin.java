package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceLogin {
public static void main(String[] args) {
	
	//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://dev141581.service-now.com");
		//To add Implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//To maximize the browser
		driver.manage().window().maximize();
		//Enter the user name as admin
		driver.findElement(By.xpath("//div[@class='login-form-field']/input")).sendKeys("admin");
		//enter the password as iX-66uY+DwSi
		driver.findElement(By.xpath("//div[@class='input-group password-group']/input")).sendKeys("iX-66uY+DwSi");
		//click login button
		driver.findElement(By.xpath("//form[@id='loginPage']/button")).click();
		
}
}
