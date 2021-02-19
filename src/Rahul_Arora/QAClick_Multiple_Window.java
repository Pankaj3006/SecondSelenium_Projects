package Rahul_Arora;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAClick_Multiple_Window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement Sectiondriver =  driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println("No. of Links present in that section is: "+Sectiondriver.findElements(By.tagName("a")).size());
		for(int i=0; i<Sectiondriver.findElements(By.tagName("a")).size(); i++)
		{
			String key=  Keys.chord(Keys.CONTROL,Keys.ENTER);
			Sectiondriver.findElements(By.tagName("a")).get(i).sendKeys(key);
		}
		Set<String> str =  driver.getWindowHandles();
		Iterator<String> itr = str.iterator();
		while(itr.hasNext())
		{
			if(driver.switchTo().window(itr.next()).getCurrentUrl().contains("https://www.soapui.org/"))
		    itr.remove();
			else
           	System.out.println(" "+ driver.getCurrentUrl()+"   |    "+ driver.getTitle());
		}
		driver.quit();
	}
}
