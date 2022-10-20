package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
public static void main(String[] args) {
	//Download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url1
	//https://www.facebook.com/
	driver.get("https://www.facebook.com/");
	//Maximize the browser
	driver.manage().window().maximize();
}
}
