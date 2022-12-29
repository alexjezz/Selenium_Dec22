package Week2_Assignment;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_FindAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Find Accounts")).click();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("//input[@text='Find Accounts']")).click();
		driver.findElement(By.linkText("accountlimit100")).click();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String account_name = driver.findElement(By.xpath("//span[@text='Account Name']")).getText();
		System.out.println("The text is "+account_name);
		if(account_name.contains("Account Name")) {
			System.out.println("The Text is matched");
		}else {
			System.out.println("The Text is not match");
		}
			
		String description = driver.findElement(By.xpath("//span[@text='Description']")).getText();
		System.out.println("The text is "+description);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Account Details";
		assertEquals(expectedTitle,actualTitle);

	}

}
