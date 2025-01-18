package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement alertclick = driver.findElement(By.xpath("(//span[.='Show'])[3]"));
		alertclick.click();

		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.quit();
	}

}
