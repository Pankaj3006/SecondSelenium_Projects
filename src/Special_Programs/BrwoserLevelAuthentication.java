package Special_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrwoserLevelAuthentication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		Use
//		http://username:password@site.com/page
//		instead of
//		http://site.com/page

	}

}
