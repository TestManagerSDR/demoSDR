package TalentozPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
public class test {
	 public WebDriver driver;
	
	@BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver();			
		//Maximixe the window size
	    driver.manage().window().maximize();   
		 driver.get("https://stage.talentoz.com/");
        driver.findElement(By.id("txt_name")).sendKeys("sundar@forziatech.co");
        driver.findElement(By.id("txt_pass")).sendKeys("123");
        driver.findElement(By.xpath("//div[@att]")).click();
        
	    
    }
	
	  
	
	@Test
	public void test1() {
		
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		
		System.out.println("test3");
	}
	
	

   @AfterTest
    public void closeApp() {
        driver.quit();
    }

	
}
