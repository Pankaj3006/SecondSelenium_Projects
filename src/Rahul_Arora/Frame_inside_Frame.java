package Rahul_Arora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_inside_Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Frames')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		WebElement outerframe = driver.findElement(By.xpath("//div[@id='Multiple']/iframe[contains(text(),'Your browser does not support iframes')]"));
		driver.switchTo().frame(outerframe);
		WebElement innerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerFrame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Divyank");
		System.out.println("divyank written inside the frame");
		System.out.println(driver.findElements(By.tagName("a")).size());
		driver.switchTo().defaultContent();
		System.out.println(driver.findElements(By.tagName("a")).size());
		driver.switchTo().frame(outerframe);
		System.out.println(driver.findElements(By.tagName("a")).size());
	}

}
