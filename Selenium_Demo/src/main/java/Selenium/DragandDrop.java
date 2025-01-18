package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class DragandDrop {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions chorme = new ChromeOptions();
		chorme.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(chorme);
	//	driver.navigate().to(null)
		
		driver.get("https://www.leafground.com/drag.xhtml"); 
		WebElement from =driver.findElement(By.id("form:drag_content"));
		WebElement to =driver.findElement(By.id("form:drop"));
		Actions act = new Actions(driver);
	act.dragAndDrop(from, to).perform();
		
		
	}

}
