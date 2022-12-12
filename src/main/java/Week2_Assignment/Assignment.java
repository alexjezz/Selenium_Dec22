package Week2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Alex");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("9698577890");
		driver.findElement(By.name("reg_passwd__")).sendKeys("alex2426");
		
		Select date = new Select(driver.findElement(By.name("birthday_day")));
		date.selectByValue("24");
		
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByIndex(6);
		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1984");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();  
		
		driver.findElement(By.name("websubmit")).click();

	}

}
