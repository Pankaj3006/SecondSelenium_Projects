package Special_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Image {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/broken_images");
		//driver.get("https://demoqa.com/broken");
		//Number of Images on the page
		System.out.println(driver.findElements(By.cssSelector("img")).size());
		//Number of Broken images on the page
		for (WebElement image : driver.findElements(By.cssSelector("img")))
		{
			if (image.getAttribute("naturalWidth").equals("0"))
		       System.out.println(image.getAttribute("outerHTML") + " is broken");
		}
		driver.quit();
	}
}
