package Rahul_Arora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver_Action 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("way2automation");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='gNO89b'])[1]"))).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]")).click();
		WebElement res = driver.findElement(By.xpath("//a[text()='Resources']"));
		Actions act = new Actions(driver);
		act.moveToElement(res).perform();
		driver.findElement(By.linkText("Practice site 1")).click();
		System.out.println("Completed all the Steps");
		driver.close();
	}
}
