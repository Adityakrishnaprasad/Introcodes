package Loginautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbAutomate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("aditya");
		driver.findElement(By.name("pass")).sendKeys("kittu");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		driver.getTitle();
		driver.getCurrentUrl();
		driver.close();
		
			
		
		
		

	}

}
