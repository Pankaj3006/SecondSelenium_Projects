package Rahul_Arora;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QAClick_PracticeForm 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String text=null;
		List<WebElement> ls = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(ls.size());
		for(int i=0; i<ls.size(); i++)
		{
			if(ls.get(i).getAttribute("value").equalsIgnoreCase("Option1"))
			{
				ls.get(i).click();
				break;
			}
		}
		for(int i=0; i<ls.size(); i++)
		{
			if(ls.get(i).isSelected())
			text = ls.get(i).getAttribute("Value");
		}
		System.out.println(text);
		Select s= new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		s.selectByValue(text);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		List<WebElement> lss = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int j=1; j<=lss.size(); j++)
		{
			if(lss.get(j).getAttribute("value").equalsIgnoreCase("Radio3"))
			{
			lss.get(j).click();
			break;
			}
		}
	}
}
