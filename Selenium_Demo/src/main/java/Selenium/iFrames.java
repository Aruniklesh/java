package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.get("https://www.leafground.com/frame.xhtml");
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
		String tezt = driver.findElement(By.id("Click")).getText();
		System.out.println(tezt);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");	
		WebElement click = driver.findElement(By.id("Click"));
		click.click();

		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
