package Special_Programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink 
{
	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://demoqa.com/broken");
		int count=0;
	    //WebElement footdriver =	driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(driver.findElements(By.tagName("a")).size());
		List<WebElement> ls = driver.findElements(By.tagName("a"));
		Iterator<WebElement> itr = ls.iterator();
		while(itr.hasNext())
		{
			String url = itr.next().getAttribute("href");
			HttpURLConnection  conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode = conn.getResponseCode();
			if(respcode>400)
			{
				count++;
				System.out.println(count+". The given Url: "+url+"is Broken URL with Response code given as: "+respcode);
			}
		}
		driver.quit();
	}
}
