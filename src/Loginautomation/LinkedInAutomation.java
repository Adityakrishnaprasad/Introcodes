package Loginautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInAutomation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.id("username")).sendKeys("awskk@gmail.com");
		driver.findElement(By.id("password")).sendKeys("agsqwe123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.close();
		
	}

	
	
}
