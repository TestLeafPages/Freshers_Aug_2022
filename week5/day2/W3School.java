package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3School {

	public static void main(String[] args) throws InterruptedException {
		//Download the driver and set the  path
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//loadb the application url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("TestLeaf");
		promptAlert.accept();
		
		
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
	}
}
