package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonp2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Masks and other safety supplies']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		//typcasting
		
		JavascriptExecutor j =(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(5000);
		
		ele.click();
		
		
		
	}

}
