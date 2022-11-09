package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		//Download the driver and set the  path
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//loadb the application url
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		
		frame1.click();
		String text = frame1.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		
		
	}
}
