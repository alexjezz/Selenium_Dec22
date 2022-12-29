package Week3_Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone" , Keys.ENTER);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> amt = new ArrayList<Integer>();
		
			for(int i=0; i < price.size(); i++) {
			//System.out.println(price.size());
			String text = price.get(i).getText().replaceAll(",", "");
			if(!text.trim().equals("")){
			int finalprice = Integer.parseInt(text);
			
			System.out.println(text);
			if(finalprice > 0) {
				amt.add(finalprice);
				
			}
		}
	}	
		//HashSet<Integer>set = new HashSet<Integer>(price);
		List<Integer> list2 = new ArrayList<Integer>();
		for (Object ob: list2) {
			System.out.println("remove duplicate: "+ob);
			
		}
		
		Collections.sort(amt);
		System.out.println("min price" +amt.get(0));
		
	}

}
