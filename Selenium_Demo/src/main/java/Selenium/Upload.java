package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chorme = new ChromeOptions();
		chorme.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(chorme);		
		driver.get("https://www.leafground.com/file.xhtml"); 
		driver.findElement(By.xpath("//span[@id='j_idt88:j_idt89']")).click();
		Thread.sleep(3000);
		String url = "C:\\Users\\Arunnivetha\\Downloads\\TestLeaf Logo.png";
		StringSelection select  =  new StringSelection(url);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		
	}

}
