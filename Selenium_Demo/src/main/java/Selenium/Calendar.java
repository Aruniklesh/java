package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chorme = new ChromeOptions();
		chorme.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(chorme);		
		driver.navigate().to("https://letcode.in/calendar"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='13']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'timepicker-next')]")).click();	
		driver.findElement(By.xpath("//span[contains(@class,'timepicker-next')]")).click();	
		WebElement status =driver.findElement(By.xpath("(//div[contains(@class,'content has-text')])[1]"));

		String show = status.getText();
		System.out.println(show);


	}

}
