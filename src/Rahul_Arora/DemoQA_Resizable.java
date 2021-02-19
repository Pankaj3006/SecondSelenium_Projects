package Rahul_Arora;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQA_Resizable 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/resizable");	
		System.out.println("--------------Resizable-------------");
	    Dimension width = driver.findElement(By.xpath("//div[@class='constraint-area']")).getSize();
	    System.out.println(width);
	    WebElement target = driver.findElement(By.cssSelector(".react-resizable-handle.react-resizable-handle-se"));
        Actions act= new Actions(driver);
        act.dragAndDropBy(target, 50, 50).perform();
	}
}
