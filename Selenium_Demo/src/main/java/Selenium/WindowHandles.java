package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.get("https://letcode.in/windows");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String oldWindow = driver.getWindowHandle();
		System.out.println("Old Window " + oldWindow);
		
		driver.findElement(By.id("home")).click();
		Set<String> windows = 	driver.getWindowHandles();
		
		for (String newWindow : windows) {
			driver.switchTo().window(newWindow);
			
		}
		String newwindowtitle = driver.getTitle();
		System.out.println(newwindowtitle);
		driver.switchTo().defaultContent();
			
		}
	

}
