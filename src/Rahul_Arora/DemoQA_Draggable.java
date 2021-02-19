package Rahul_Arora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQA_Draggable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		System.out.println("-----------------Draggable-----------------");
		WebElement target = driver.findElement(By.id("dragBox"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(target, 100, 100).perform();
		System.out.println("Dragging is Done");
		driver.findElement(By.xpath("//a[@id='draggableExample-tab-axisRestriction']")).click();
		WebElement xbox = driver.findElement(By.cssSelector("div[id='restrictedX']"));
		act.dragAndDropBy(xbox, 100, 0).perform();
		System.out.println("Dragging is Done");
		WebElement ybox = driver.findElement(By.cssSelector("div[id='restrictedY']"));
		act.dragAndDropBy(ybox, 0, 100).perform();
		System.out.println("Dragging is Done");

	}

}
