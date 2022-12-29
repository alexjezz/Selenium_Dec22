package Week4_Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearntoMultipleWindow {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='open']")).click();
		
		//to get current window Handle
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		Set<String> allWindowhandles = driver.getWindowHandles();
		
		for(String eachwindowhandle : allWindowhandles) {
			System.out.println(eachwindowhandle);
			
		}
		
		List<String> lisofthandles = new ArrayList<String>(allWindowhandles);
		String secondWindow = lisofthandles.get(1);	
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getTitle());

	}

}
