package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Downloads {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions chorme = new ChromeOptions();
		chorme.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(chorme);		
		driver.get("https://www.leafground.com/file.xhtml"); 
		driver.findElement(By.xpath("//span[.='Download']")).click();
		Thread.sleep(5000);
		
//C:\Users\Arunnivetha\Downloads
		
		File files = new File("C:\\Users\\Arunnivetha\\Downloads");
		File[] Allfiles = files.listFiles();
		for (File Singlefile : Allfiles) {
			if (Singlefile.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File Downloaded");
				break;
				
			}
		}
		
	}

}
