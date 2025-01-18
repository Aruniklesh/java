package activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textbox {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--start-maximized");


		WebDriver driver = new ChromeDriver(chrome);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.leafground.com/input.xhtml");
		
		String title = 	driver.getTitle();
		System.out.println(title);

		
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys(", India.");
	//	driver.quit();

	}

}
