package Week4_Day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateIrctc {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		String Firstwindowhandle = driver.getWindowHandle();
		System.out.println(Firstwindowhandle);
		
		Set<String> allWindowhandles = driver.getWindowHandles();
		
		for(String eachwindowhandle : allWindowhandles) {
			System.out.println(eachwindowhandle);
			
		}
		
		List<String> lisofthandles = new ArrayList<String>(allWindowhandles);
		String secondWindow = lisofthandles.get(1);	
		driver.switchTo().window(secondWindow);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/Flight.png");
		FileUtils.copyFile(source, target);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lisofthandles.get(0));
		System.out.println(driver.getTitle());
	}

}
