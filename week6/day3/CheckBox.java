package week6.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
public static void main(String[] args) {
	//Download the driver and set the  path
	WebDriverManager.chromedriver().setup();
	//Launch the chrome browser
	ChromeDriver driver=new ChromeDriver();
	//loadb the application url
	driver.get("https://leafground.com/checkbox.xhtml");
	//maximize the browser
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
	
	List<WebElement> textValue = driver.findElements(By.xpath("//ul[contains(@class,'content ui-widget ui-corner-all ui-helper-reset')]//label"));

	for (int i = 0; i <textValue.size(); i++) {
		String text = textValue.get(i).getText();
		driver.findElement(By.xpath("//label[text()='"+text+"']/preceding-sibling::div")).click();
		System.out.println(text);
	}





}
}
