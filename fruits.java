package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class fruits {
		public static void main(String[] args)
		{
			System.out.println("hai");
			System.setProperty("webdriver.chrome.driver","F:\\New folder\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String baseURL = "https://demo.guru99.com/test/newtours/register.php";
			driver.get(baseURL);
		
					Select drpCountry = new Select(driver.findElement(By.name("country")));
					drpCountry.selectByVisibleText("ANTARCTICA");

					//Selecting Items in a Multiple SELECT elements
					driver.get("http://jsbin.com/osebed/2");
					Select fruits = new Select(driver.findElement(By.id("fruits")));
					fruits.selectByVisibleText("Banana");
					fruits.selectByIndex(1);
			 
			
		
		}

	}
