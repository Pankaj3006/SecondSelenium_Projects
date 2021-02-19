package Rahul_Arora;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Window_Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Actions act = new Actions(driver);
		WebElement ele= driver.findElement(By.xpath("//button[@id='openwindow']"));
		//String key= Keys.chord(Keys.CONTROL, Keys.ENTER);
		act.moveToElement(ele).keyDown(Keys.CONTROL).click().build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[@id='opentab']"))).click().build().perform();
		Set<String> str = driver.getWindowHandles();
		Iterator<String> itr = str.iterator();
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getCurrentUrl()+"  |  "+driver.getTitle());
		}
	}
}
