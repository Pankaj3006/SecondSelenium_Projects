package Rahul_Arora;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Complete_Practice_form 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pankaj");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gupta");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Vijaynagar 2nd Stage");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("PankajKit@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7795856145");
		driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/label[1]")).click();
		for(int i=0; i<driver.findElements(By.xpath("//input[@type='checkbox']")).size(); i++)
		{
			driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
		}
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Dutch')]")).click();
		Select s= new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		s.selectByIndex(8);
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		s1.selectByVisibleText("India");
		driver.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Select s3= new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		List<WebElement> ls = s3.getOptions();
		s3.selectByIndex(ls.size()-1);
		Select s4= new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		s4.selectByVisibleText("December");
		Select s5= new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
		s5.selectByValue("31");
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Pankaj3006");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Pankaj3006");
		driver.findElement(By.xpath("//button[@id='submitbtn']")).submit();
		System.out.println(driver.findElement(By.xpath("//div[@class='container-fluid ng-scope']")).getText());
	}
}
