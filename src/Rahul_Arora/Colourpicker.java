package Rahul_Arora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Colourpicker {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/slider/#colorpicker");
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
Thread.sleep(3000);
System.out.println(driver.findElement(By.xpath("//div[@id='swatch']")).getCssValue("color"));
int w1=driver.findElement(By.xpath("//div[@id='red']/div[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min']")).getSize().getWidth();
int w2=driver.findElement(By.xpath("//div[@id='green']/div[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min']")).getSize().getWidth();
int w3=driver.findElement(By.xpath("//div[@id='blue']/div[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min']")).getSize().getWidth();
System.out.println(w1);
System.out.println(w2);
System.out.println(w3);
WebElement Red = driver.findElement(By.xpath("//div[@id='red']/span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
WebElement Green = driver.findElement(By.xpath("//div[@id='green']/span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
WebElement Blue = driver.findElement(By.xpath("//div[@id='blue']/span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
Actions act= new Actions(driver);
act.dragAndDropBy(Red, -100, 0).perform();
act.dragAndDropBy(Green, -20, 0).perform();
act.dragAndDropBy(Blue, -10, 0).perform();
System.out.println(driver.findElement(By.xpath("//div[@id='swatch']")).getCssValue("color"));
		}
}
