package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Object btn = driver.findElement(By.id("keepLoggedInLabel"));
		if(((WebElement) btn).isSelected())
		{
			System.out.println("pass: element is displayed");
			
		}
		else
		{
			System.out.println("Fail: element is not displayed");
		}
		
		driver.close();
	}

}
