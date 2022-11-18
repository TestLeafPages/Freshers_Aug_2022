package week6.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggble {

	public static void main(String[] args) {
		//Download the driver and set the  path
				WebDriverManager.chromedriver().setup();
				//Launch the chrome browser
				ChromeDriver driver=new ChromeDriver();
				//loadb the application url
				driver.get("https://jqueryui.com/draggable/");
				//maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//handle thge frame
			  driver.switchTo().frame(0);
			  //find the element
			  WebElement ele = driver.findElement(By.id("draggable"));
			  
			  Actions builder=new Actions(driver);
			  
			  
			  
			 builder.dragAndDropBy(ele, 100, 100).perform();
			  
			  
			  
			  
			
	}
}
