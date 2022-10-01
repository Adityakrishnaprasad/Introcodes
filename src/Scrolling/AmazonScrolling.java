package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//typecasting
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		//top to bottom
		
		js.executeScript("window.scrollBy(0,6000)");
		
		Thread.sleep(3000);
		
		//bottom to top
		
		js.executeScript("window.scrollBy(0,-6000)");


	}

}
