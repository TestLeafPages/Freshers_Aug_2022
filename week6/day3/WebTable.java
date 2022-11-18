package week6.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
public static void main(String[] args) {
	//Download the driver and set the  path
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver(option);
		//loadb the application url
		driver.get("https://erail.in/");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS",Keys.TAB);
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU",Keys.TAB);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
		int size = ele.size();
		System.out.println(size);
		
		String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td")).getText();
		System.out.println(text);

		
		String text2 = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[2]/td")).getText();
        System.out.println(text2);

}
}
