package week6.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://WWW.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	By ele = By.xpath("//input[@name='firstname']");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.presenceOfElementLocated(ele));
	
	driver.findElement(ele).sendKeys("Test");
	
	
	File source = driver.getScreenshotAs(OutputType.FILE);
	File destination=new File("./snap/img.png");
	FileUtils.copyFile(source, destination);
	
	WebElement lastName = driver.findElement(By.name("lastname"));
	File source1 = lastName.getScreenshotAs(OutputType.FILE);
	File destination2=new File("./snap/img2.png");
	FileUtils.copyFile(source1, destination2);
	
	//FileHandler.copy(source1, destination2);
//	
//	driver.findElement(By.name("reg_email__")).sendKeys("rpushaishwarya@gmail.com");
//	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("rpushaishwarya@gmail.com");
//	driver.findElement(By.name("reg_passwd__")).sendKeys("**");
//	
//	WebElement birth=driver.findElement(By.name("birthday_day"));
//	Select dd1=new Select(birth);
//	dd1.selectByValue("19");
//	
//	WebElement month=driver.findElement(By.name("birthday_month"));
//	Select dd2=new Select(month);
//	dd2.selectByVisibleText("Mar");
//	
//	WebElement year=driver.findElement(By.name("birthday_year"));
//	Select dd3=new Select(year);
//	dd3.selectByVisibleText("2002");
//	driver.findElement(By.xpath("//label[text()='Female']")).click();
}
}
