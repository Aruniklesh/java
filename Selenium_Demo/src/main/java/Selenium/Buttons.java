package Selenium;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		/*
		 * position of the buttton WebElement buttonposition =
		 * driver.findElement(By.xpath("(//span[text() = \"Submit\"])[1]"));
		 * org.openqa.selenium.Point x = buttonposition.getLocation();
		 * System.out.println(x.getX()); System.out.println(x.getY());
		 */
		/*
		 * WebElement button =
		 * driver.findElement(By.xpath("(//span[text() = \"Submit\"])[2]"));
		 * System.out.println("heigjtt" + button.getSize().getHeight());
		 * System.out.println("width" + button.getSize().getWidth());
		 */
		/*
		 * 
		 * WebElement button = driver.findElement(By.xpath("//span[.=\"Disabled\"]"));
		 * System.out.println(button.isEnabled());
		 */
		WebElement button = driver.findElement(By.xpath("//span[.=\"Save\"]"));
		String color = button.getCssValue("color");
		System.out.println(color);
		driver.quit();

	}

}
