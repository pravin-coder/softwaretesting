package selenium;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class arms {

		public static void main(String[] args) {
			
			
			System.out.println("hai");
			System.setProperty("webdriver.chrome.driver","F:\\New folder\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.get("https://arms.sse.saveetha.com");
			WebElement username=driver.findElement(By.name("txtusername"));
			System.out.println(username);
			WebElement password=driver.findElement(By.name("txtpassword"));
			System.out.println(password);
			WebElement login=driver.findElement(By.name("btnlogin"));
			System.out.println(login);
			username.sendKeys("192110177");
			
			password.sendKeys("pravinraj");
			login.click();

		}
	}
