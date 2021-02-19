package Special_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa_selectmenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
    driver.findElement(By.xpath("//*[@id='withOptGroup']/div/div[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='withOptGroup']/div")).sendKeys(Keys.DOWN);
    driver.findElement(By.xpath("//*[@id='withOptGroup']/div")).sendKeys(Keys.DOWN);
    driver.findElement(By.xpath("//*[@id='withOptGroup']/div")).sendKeys(Keys.ENTER);
	}

}
