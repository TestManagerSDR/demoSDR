package TalentozPackage;
/*import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Applogs {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("edureka@yahoo.com");
		} 
}*/
/*import java.awt.AWTException;
import java.util.List;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
 
//import io.github.bonigarcia.wdm.WebDriverManager;
 
/*public class Applogs {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		// Launching browser
        WebDriver driver = new ChromeDriver();
        // Loading URL
        driver.get("https://www.google.com/");
        // Mentioning type of Log 
        LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
        // Retrieving all log 
        List<LogEntry> logs= entry.getAll();
        // Print one by one
        for(LogEntry e: logs)
        {
        	System.out.println(e);
        }
        
        // Printing details separately 
        for(LogEntry e: logs)
        {
        	System.out.println("Message is: " +e.getMessage());
        	System.out.println("Level is: " +e.getLevel());
        }
       
        
        
	}
 
}*/


import static org.testng.Assert.fail;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Applogs {
    private WebDriver driver;
 /* @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");        
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
        driver = new ChromeDriver(caps);
    }

   @AfterMethod
    public void tearDown() {
        driver.quit();
    }*/

    public void analyzeLog(WebDriver driver) {
    	/*DesiredCapabilities caps = DesiredCapabilities.chrome();
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
       Logs logs = driver.manage().logs();
       LogEntries logEntries = logs.get(LogType.BROWSER);
       List<LogEntry> errorLogs = logEntries.filter(Level.SEVERE);
        if (errorLogs.size() != 0) {
         fail(errorLogs.size() + " Console error found");
        }
        if(logEntries== null) {
        for (LogEntry entry : logEntries) {
        	
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
           do something useful with the data
        }	
        } 
        JavascriptExecutor js = (JavascriptExecutor)driver;
  	    String script = "console.clear();";
  	    js.executeScript(script);
  	    
		String script = "console.log('Hi Google');";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript(script);
		
		script = "console.clear();";
	
		js.executeScript(script);
  	    */
  	      	    
	    LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
	  
    	 String errormsg = "";
    	 
    	 for (LogEntry logEntry: logEntries) 
    	 {
    		 errormsg = "error";
             System.out.println("Found error in logs: " + logEntry.getMessage() );
            // System.setProperty(logEntry.getMessage(),"./Chromelog.txt");
         }
    	 if(errormsg=="") {
    		 System.out.println("No error found!");
    		 
    	 }
    	
    	
    	
    }
    
      //else {
    //	System.out.println("No logs!");
    //	} }

    /*@Test
    public void testMethod() throws Exception {
    	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
      
    	  driver.get("http://demo1.talentoz.com");
    	  driver.manage().window().maximize();   
  	    //driver.navigate().refresh();
    	  TimeUnit.SECONDS.sleep(10); 
  		driver.findElement(By.id("txt_name")).sendKeys("sundar@forziatech.co");
          driver.findElement(By.id("txt_pass")).sendKeys("123");
          TimeUnit.SECONDS.sleep(2);
          driver.findElement(By.xpath("//div[@att]")).click();
          TimeUnit.SECONDS.sleep(20);
          analyzeLog();
          driver.findElement(By.xpath("//*[@id=\'undivname\']")).click();
          TimeUnit.SECONDS.sleep(5);
          driver.findElement(By.xpath("//*[@id=\'liitem0btnlistLog\']")).click();
          //TimeUnit.SECONDS.sleep(5);
          //driver.findElement(By.xpath("//*[@id=\'listhead1Component_30000_29042904\']")).click();
          TimeUnit.SECONDS.sleep(20);
        //do something on page
        analyzeLog();*/
    
}
 

