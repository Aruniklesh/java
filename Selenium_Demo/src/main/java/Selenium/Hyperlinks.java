package Selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chorme = new ChromeOptions();
		chorme.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(chorme);		
		driver.navigate().to("https://www.leafground.com/link.xhtml"); 
		
		driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		WebElement urlDestination = driver.findElement(By.partialLinkText("Find the URL without"));
		String Whereitwillgot = urlDestination.getAttribute("href");
		System.out.println(Whereitwillgot);
		
		
		WebElement brokenLink  = driver.findElement(By.partialLinkText("Broken?"));
		brokenLink.click();
	
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("This page is broken");
			
		}
		driver.navigate().back();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
	
		}
		
		
		
		
		
	}


