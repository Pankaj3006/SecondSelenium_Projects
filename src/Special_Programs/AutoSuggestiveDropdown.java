package Special_Programs;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("UNI");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for(WebElement option: options)
		{
			//System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("United States Minor Outlying Islands"))
			{
				option.click();
				break;
			}
		}
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		driver.quit();

	}

}
