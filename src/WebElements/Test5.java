package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement search = driver.findElement(By.name("q"));
		 Point l = search.getLocation();
		 System.out.println(l.getX()+"it is used to get x coordinates");
		 System.out.println(l.getY()+"it is used to get Y coordinates");
		 
		 driver.close();
		 
		
	     
	}

}
