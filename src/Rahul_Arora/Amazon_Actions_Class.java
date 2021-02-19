package Rahul_Arora;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Actions_Class
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		act.moveToElement(ele).contextClick().build().perform();
		WebElement ele1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//act.moveToElement(ele1).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		act.moveToElement(ele1).click().keyUp(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
}

}
