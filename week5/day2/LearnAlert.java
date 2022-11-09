package week5.day2;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		//Download the driver and set the  path
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//loadb the application url
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		//maximize the browser
		driver.manage().window().maximize();
		
		
		WebElement findElement = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		List<WebElement> fin= driver.findElements(By.xpath("//button[text()='Alert Box']"));
	//	Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(3000);
	//	simpleAlert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert confirmationAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmationAlert.accept();
		
		
		
		
		
		
	}
}
