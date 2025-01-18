package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrrenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		File firstSrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img.png");
		driver.quit();
		
	}

}
