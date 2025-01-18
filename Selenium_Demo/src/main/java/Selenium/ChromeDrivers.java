package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;

public class ChromeDrivers {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("fullName")).sendKeys("Arun");
		driver.findElement(By.id("join")).sendKeys(" person",Keys.TAB);
		String myValue = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(myValue);
		driver.findElement(By.id("clearMe")).clear();
		boolean is_Displayed = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(is_Displayed);
		
		driver.quit();
		
	}

}
