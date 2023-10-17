package BrighInfotech_Practice.BrighInfotech_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void SelectDrop() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(2000);
		WebElement products=driver.findElement(By.id("first"));
		products.click();
		Thread.sleep(2000);
		Select sel=new Select(products);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		driver.close();
	}
	

}
