package Loginautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTimeAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.xpath("(//div[text()='Login '])")).click();
		Thread.sleep(3000);
		String d = driver.getTitle();
		
		if(d.equals("actiTIME -  Enter Time-Track"))
		{
			System.out.println("pass : page is taking to home page");
		}
		else
		{
			System.out.println("fail : page is not loading");
		}
		
	}

}
