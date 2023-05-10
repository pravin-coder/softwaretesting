package selenium;
import java.time.Duration;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class selnm {
		 public static void main(String s[]) {
		   
		        WebDriver driver = new ChromeDriver();
		        System.setProperty("webdriver.chrome.driver","F:\\New folder\\chromedriver_win32\\chromedriver.exe");
		        driver.get("https://www.selenium.dev//selenium//web//web-form.html");

		        String title = driver.getTitle();
		        assertEquals("Web form", title);

		        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		        WebElement textBox = driver.findElement(By.name("my-text"));
		        WebElement submitButton = driver.findElement(By.cssSelector("button"));

		        textBox.sendKeys("Selenium");
		       // submitButton.click();

		        WebElement message = driver.findElement(By.id("message"));
		        String value = message.getText();
		        System.out.println("VALUE :"+value);
		        assertEquals("Received!",value);
		       // driver.quit();
		}
		}
