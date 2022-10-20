package week2.day4;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
}
}
