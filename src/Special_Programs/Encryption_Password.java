package Special_Programs;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encryption_Password {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pankajkit@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		String password = "pankaj30061";
		String Encodepass =  new String(Base64.encodeBase64(password.getBytes()));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Encodepass);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]"
				+ "/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		System.out.println(new String(Base64.decodeBase64(Encodepass)));
		System.out.println(driver.findElement(By.xpath("//div[@id='error_box']")).getText());
		driver.close();
	}

}
