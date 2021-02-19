package Special_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Database_Testing {

	public static void main(String[] args) throws SQLException {
		String host= "localhost";
		String port = "3306";
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo","root","Welcome@30061989");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo");
		while(rs.next())
		{
	    String myname = rs.getString("name");
	    String myid = rs.getString("id");
	    String mylocation = rs.getString("Location");
	    String myage = rs.getString("age");
	    System.out.print(myname+"    "+myid+"  "+mylocation+ "   "+myage);
	    System.out.println();
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(myname);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(mylocation);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		String text= driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println(text);
		}
		driver.close();
	}	
}


