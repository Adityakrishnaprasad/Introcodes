package Loginautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.qspiders.com/student");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[type='email']")).sendKeys("jefewhrf@gmail.com");
		driver.findElement(By.xpath("//input[text()='tel ']")).sendKeys("1234567890");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[type()= Login']")).click();
		


	}

}
