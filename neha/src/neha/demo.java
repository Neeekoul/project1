package neha;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\neha\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\user\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver=new  ChromeDriver();
		// TODO Auto-generated method stub
		
driver.manage().window().maximize();
driver.get("https://juice-shop.herokuapp.com/#/login");
// Locate the password input field

driver.findElement(By.id("email")).sendKeys("admin");
Thread.sleep(5000);
driver.findElement(By.id("password")).sendKeys("neha@123");
driver.findElement(By.id("loginButton")).click();
//Perform a controlled SQL injection attack



} 
}

	


