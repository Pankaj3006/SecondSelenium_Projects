package Special_Programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet_DynamicDropdown 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click(); 
	Select s= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
	s.selectByVisibleText("3");
	Select s1= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
	s1.selectByVisibleText("2");
	Select s2= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']")));
	s2.selectByVisibleText("1");
	System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
	Select s3= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
	s3.selectByVisibleText("INR");
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
	driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),'MAA')]")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	driver.quit();
	}

}
