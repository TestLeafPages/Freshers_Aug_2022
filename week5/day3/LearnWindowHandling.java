package week5.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {
public static void main(String[] args) {
	//Download the driver and set the  path
	WebDriverManager.chromedriver().setup();
	//Launch the chrome browser
	ChromeDriver driver=new ChromeDriver();
	//loadb the application url
	driver.get("https://leafground.com/window.xhtml;jsessionid=node011omqjplljr7w3r4tz1hpfs69414561.node0");
	//maximize the browser
	driver.manage().window().maximize();
	
	
	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
	String currentUrl = driver.getCurrentUrl();
	System.out.println("currentUrl"+currentUrl);
	String title = driver.getTitle();
	System.out.println("title:"+title);
	
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles.size());
	
	List<String>  openedWindow=new ArrayList<String>(windowHandles);
	driver.switchTo().window(openedWindow.get(1));
	String newWindow = driver.getCurrentUrl();
	System.out.println("newWindow"+newWindow);
	String title2 = driver.getTitle();
	System.out.println("title2:"+title2);
	
	driver.switchTo().window(openedWindow.get(0));
	
	
	
	
	
	
	
	
}
}
