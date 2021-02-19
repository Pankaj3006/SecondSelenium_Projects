package Special_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutor_KSRTC 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		int count=0;
		driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
		Thread.sleep(2000);
     	JavascriptExecutor js = (JavascriptExecutor)driver;
     	String script= "return document.getElementById(\"fromPlaceName\").value;";
     	String text= (String)js.executeScript(script);
     	
     	while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
     	{
     		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
     		text= (String)js.executeScript(script);
     		System.out.println(text);
     	}
     	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER); 
     	
     	driver.findElement(By.id("toPlaceName")).sendKeys("Mys");
     	Thread.sleep(2000);
     	String script1= "return document.getElementById(\"toPlaceName\").value;";
     	String text1= (String)js.executeScript(script1);
     	
     	while(!text1.equalsIgnoreCase("MYSURU"))
     	{
     		driver.findElement(By.id("toPlaceName")).sendKeys(Keys.DOWN);
     		text1= (String)js.executeScript(script1);
     		System.out.println(text1);
     	}
     	driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
     	driver.findElement(By.id("txtJourneyDate")).click();
     	//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
     	while(!driver.findElement(By.cssSelector(".ui-datepicker-title")).getText().contains("November 2020"))
     	{
     	driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
     	}
     	int rowcount = driver.findElements(By.xpath("//table/tbody/tr")).size();
     	int colcount = driver.findElements(By.xpath("//table/tbody/tr[1]/td")).size();
     	for(int i=1; i<=rowcount; i++)
     	{
     		for(int j=1; j<=colcount; j++)
     		{
     			if((driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"))).getText().contains("3"))
     			{   
     				count++;
     				driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).click();
     				break;
     			}
     		}
     		if(count==1)
     		{
     			break;
     		}
     	}
     	driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg.btn-block.btn-booking")).click();
	}

}
