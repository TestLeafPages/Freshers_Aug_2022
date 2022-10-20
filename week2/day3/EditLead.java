package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
public static void main(String[] args) {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//To maximize the browser
	driver.manage().window().maximize();
	
	//enter the username as demosalesmanager
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//2. Enter UserName and Password Using Id Locator
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	//  3. Click on Login Button using Class Locator
	driver.findElement(By.className("decorativeSubmit")).click();
//	  4. Click on CRM/SFA Link
	driver.findElement(By.linkText("CRM/SFA")).click();
//	  5. Click on Leads Button
	driver.findElement(By.linkText("Leads")).click();
//	  6. Click on Create Lead 
	driver.findElement(By.linkText("Create Lead")).click();
//	  7. Enter CompanyName Field Using id Locator
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
//	  8. Enter FirstName Field Using id Locator
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravind");
//	  9. Enter LastName Field Using id Locator
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RK");
//	  10. Enter FirstName(Local) Field Using id Locator
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test");
//	  11. Enter Department Field Using any Locator of Your Choice
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
//	  12. Enter Description Field Using any Locator of your choice
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Hellow");
//	  13. Enter your email in the E-mail address Field using the locator of your choice
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aravind@gmail.com");
    
	//	  14. Click on Create Button
    driver.findElement(By.className("smallSubmit")).click();
    
    String title = driver.getTitle();
    String title2="view Lead | opentaps CRM";
    
    if(title2.equals(title)) {
    	System.out.println("Create lead Created Successfully");
    }else {
    	System.out.println("Create lead Created not Successfully");
    }
    
    
    
//            15. Click on edit button
//            16. Clear the Description Field using .clear()
//	  17. Fill ImportantNote Field with Any text
//	  18. Click on update button 
//	  29. Get the Title of Resulting Page. using driver.getTitle()
}
}
