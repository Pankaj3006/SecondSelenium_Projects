package Rahul_Arora;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaClick_WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> l = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th"));
		System.out.println(l.size());
		Iterator<WebElement> itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
		int rowcount = driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		int colcount = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[2]/td")).size();
		System.out.println(rowcount);
		System.out.println(colcount);
		for(int i=2; i<=rowcount; i++)
		{
			if(i==5)
				break;
			for(int j=1; j<=colcount; j++)
			{   
				System.out.print(driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
			}
			System.out.println();
		}
	}

}
