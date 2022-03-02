package webstaurantstore.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stainless_workTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Assignment_Project\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		
		
		String URL = "https://www.webstaurantstore.com"; 
		driver.get(URL);		
	
	
		WebElement Button_Search_Xpath = driver.findElement(By.xpath("//input[@id='searchval']")); 
		Button_Search_Xpath.sendKeys("stainless work table"); 
		Button_Search_Xpath.sendKeys(Keys.ENTER); 
	
		List<WebElement> resultsList = driver.findElements(By.xpath("//a[@class='block font-semibold text-sm-1/2 leading-none mb-3 first:mt-8 max-h-10 hover:max-h-full min-h-10 overflow-hidden hover:overflow-visible md:mb-3 mt-0 md:mt-1-1/2']"));
		System.out.println(resultsList.size());
		for (int i = 0; i <= resultsList.size(); i++) {
		
			
			
		}
		
		
		
		

	}

}
