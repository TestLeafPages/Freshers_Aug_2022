package week6.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
public static void main(String[] args) {
	//Download the driver and set the  path
	WebDriverManager.chromedriver().setup();
	//Launch the chrome browser
	ChromeDriver driver=new ChromeDriver();
	//loadb the application url
	driver.get("https://jqueryui.com/selectable/");
	//maximize the browser
	driver.manage().window().maximize();
	//Use Implicitly wait ,its applicable for findElement() and findElements()
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.switchTo().frame(0);
	
	WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement ele3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	
	Actions builder=new Actions(driver);
	
//	builder.clickAndHold(ele1).clickAndHold(ele3).release().perform();
	builder.keyDown(Keys.CONTROL)
	.click(ele1)
	.click(ele3)
	.keyUp(Keys.CONTROL)
	.perform();
	
	
	
	
	
	
	

}
}
