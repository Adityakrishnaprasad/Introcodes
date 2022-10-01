package Loginautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutomation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("australia@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("england");
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    
        
	}

}
