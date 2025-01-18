package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chorme = new ChromeOptions();
		chorme.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(chorme);		
		driver.get("https://letcode.in/table");
		/*
		 * List<WebElement> Coloums =
		 * driver.findElements(By.xpath("//*[.='Sortable Tables']//following::th")); int
		 * Col = Coloums.size(); System.out.println("Coloums " + Col);
		 * 
		 * List<WebElement> rows =
		 * driver.findElements(By.xpath("//*[.='Sortable Tables']//following::tr")); int
		 * row = rows.size(); System.out.println("Row " + row);
		 * 
		 * WebElement values =
		 * driver.findElement(By.xpath("(//td[.='Ice cream']//following::td)[1]"));
		 * System.out.println(values.getText());
		 * 
		 * 
		 */	
		List<WebElement> Coloums = driver.findElements(By.xpath("//table[@name ='listtable']//th"));
		int Col = Coloums.size(); 
		System.out.println("Coloums " + Col);


		List<WebElement> rows =
				driver.findElements(By.xpath("//table[@name ='listtable']//tr")); int
				row = rows.size(); System.out.println("Row " + row);
				
				List<WebElement> Values = driver.findElements(By.xpath("//table[@name='listtable']//following::th[text()='Price']//following::tbody/tr"));
				for (WebElement webElements : Values) {
					int numbers = Integer.parseInt(webElements.getText());
					System.out.println(numbers);
					break;
				}
	driver.quit();


	}






}
