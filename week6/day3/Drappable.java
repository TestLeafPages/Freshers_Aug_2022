package week6.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drappable {

	public static void main(String[] args) {
		//Download the driver and set the  path
				WebDriverManager.chromedriver().setup();
				//Launch the chrome browser
				ChromeDriver driver=new ChromeDriver();
				//loadb the application url
				driver.get("https://jqueryui.com/droppable/");
				//maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
			  driver.switchTo().frame(0);
			  WebElement source = driver.findElement(By.id("draggable"));
			  
			  WebElement dest = driver.findElement(By.id("droppable"));
			  Actions builder=new Actions(driver);
			  
			  
			  builder.dragAndDrop(source, dest).perform();
			  
			  
			  
			  
			
	}
}
