package week6.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://leafground.com/checkbox.xhtml");
			
	List<WebElement> ele = driver.findElements(By.xpath("//table[@class='ui-selectmanycheckbox ui-widget']//div[@class='ui-chkbox ui-widget']"));
			System.out.println(ele.size());
	for (int i = 0; i < ele.size(); i++) {
		ele.get(i).click();
	}
}
}
