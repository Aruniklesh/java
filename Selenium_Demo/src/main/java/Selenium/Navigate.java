package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.xpath("//button[@id ='home']")).click();
		String after_click = driver.getCurrentUrl();
		System.out.println(after_click);
		
		driver.navigate().back();
		
		

	}

}
