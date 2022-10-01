package Windowmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.get("https://www.mi.com/in/");
		
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();

	}

}
