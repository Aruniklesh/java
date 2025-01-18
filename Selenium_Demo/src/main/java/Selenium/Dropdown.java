package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		/*
		 * WebElement dropdown = driver.findElement(By.className("ui-selectonemenu"));
		 * Select value = new Select(dropdown); value.selectByIndex(1);
		 */


		
		
	
		driver.quit();
		}

}
