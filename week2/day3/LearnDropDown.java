package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
public static void main(String[] args) {
	   //download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		//To maximize the browser
		driver.manage().window().maximize();
		
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select dd1=new Select(dropDown1);
		dd1.selectByVisibleText("Selenium");
		
		
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select dd2=new Select(dropDown2);
		//dd2.selectByValue("4");
		dd2.selectByIndex(2);
		
		
		
		
		
		
		
		
		
		
//		WebElement ele = driver.findElement(By.id("dropdown1"));
//		ele.clear();
//		ele.sendKeys("");
//		
		
		
		
		
		
}
}
