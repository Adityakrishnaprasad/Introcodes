package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("aditya");
		driver.findElement(By.id("pass")).sendKeys("123465");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println("");
		
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Pass: element is displayed");
		}
		else
		{
			System.out.println("Fail: element is not displayed");
		}
		
		driver.close();

	}

}
