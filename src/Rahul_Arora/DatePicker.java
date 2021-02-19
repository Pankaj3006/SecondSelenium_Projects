package Rahul_Arora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		System.out.println("---------Select Date-------------");
		driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
		while (!driver.findElement(By.xpath(
				"//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']"))
				.getText().contains("January 2021"))
		{
			driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")).click();
		}
		int rowcount = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div")).size();
		int colcount = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div[1]/div")).size();
		int count = 0;
		System.out.println(rowcount);
		System.out.println(colcount);
		for (int i = 2; i <= rowcount; i++) {
			for (int j = 1; j <= colcount; j++) {
				if (driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[" + i + "]/div[" + j + "]")).getText().contains("28"))
				{
					driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[" + i + "]/div[" + j + "]")).click();
					count++;
					break;
				}
			}
			if (count == 1)
				break;
		}
		System.out.println(driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).getAttribute("value"));
		System.out.println("------- Date And Time---------------");
		driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']")).click();
		while (!driver.findElement(By.xpath(
				"//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']"))
				.getText().contains("January 2021")) 
		{
			driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next react-datepicker__navigation--next--with-time']"))
					.click();
		}
		int row = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div")).size();
		int col = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div[1]/div")).size();
		int count1 = 0;
		System.out.println(row);
		System.out.println(col);
		for (int i = 2; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[" + i + "]/div[" + j + "]")).getText().contains("28")) 
				{
					driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[" + i + "]/div[" + j + "]")).click();
					count1++;
					break;
				}
			}
			if (count1 == 1)
				break;
		}
		driver.findElement(By.xpath("//li[contains(text(),'00:15')]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']")).getAttribute("value"));
	}
}
