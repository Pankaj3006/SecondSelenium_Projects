package Rahul_Arora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_Slider {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("----------------slider----------------");
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver.findElement(By.xpath("//div[@id='slider']"));
		System.out.println(source.getSize().width);
		WebElement target = driver.findElement(By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(target, source.getSize().width/2, 0).build().perform();
		
	}
}
