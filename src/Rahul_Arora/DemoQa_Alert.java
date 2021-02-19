package Rahul_Arora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQa_Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		System.out.println(driver.switchTo().alert().getClass().getName());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//span[@id='confirmResult']")).getText());
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Pankaj gupta");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//span[@id='promptResult']")).getText());
	}
}
