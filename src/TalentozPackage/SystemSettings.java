package TalentozPackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class SystemSettings {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");  
		//System.setProperty("webdriver.chrome.logfile", "./Chromelog.txt");
		/*DesiredCapabilities caps = DesiredCapabilities.chrome();
	    LoggingPreferences logPrefs = new LoggingPreferences();
	    logPrefs.enable(LogType.BROWSER, Level.ALL);
	    caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);*/
	    WebDriver driver = new ChromeDriver();			
		//Maximixe the window size
	    driver.manage().window().maximize();   
		TimeUnit.SECONDS.sleep(5);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
        driver.get("https://stage.talentoz.com/");
        TimeUnit.SECONDS.sleep(5);
	    driver.findElement(By.id("txt_name")).sendKeys("sundar@forziatech.co");
        driver.findElement(By.id("txt_pass")).sendKeys("123");
        driver.findElement(By.xpath("//div[@att]")).click();
        /*JavascriptExecutor js = (JavascriptExecutor)driver;
	    String script = "console.clear();";
	    js.executeScript(script);*/
		Settings[] arr = new Settings[9]; 
		 arr[0] = new Settings(1,"Organization");
		 arr[1] = new Settings(2,"Recruitment");
		 arr[2] = new Settings(3,"Employee");
		 arr[3] = new Settings(4,"Performance");
		 arr[4] = new Settings(5,"L&D");
		 arr[5] = new Settings(6,"Leave");
		 arr[6] = new Settings(7,"Claims");
		 arr[7] = new Settings(8,"Time");
		 arr[8] = new Settings(9,"Payroll");
		TimeUnit.SECONDS.sleep(3);
		SubSettings[] arr1 = new SubSettings[32]; 
     	 arr1[0] = new SubSettings(1,1,0,"Company Information","//*[@id=\'tpremove_CompanyInformation\']");
     	 /*arr1[1] = new SubSettings(1,1,1,"Roles","//*[@id=\'tpremove_cmp_RoleList\']");
     	 arr1[2] = new SubSettings(1,1,2,"Users","//*[@id=\'tpremove_cmp_Adm_EmpList\']");
     	 arr1[3] = new SubSettings(1,1,3,"Report Privileges","//*[@id=\'tpremove_div_DatzieReports_sett_202904\']");
     	 arr1[4] = new SubSettings(1,1,4,"Dashboard Privileges","//*[@id=\'tpremove_div_DatzieDashBoard__sett_202904\']");
     	 arr1[5] = new SubSettings(1,1,5,"Financial Year","//*[@id=\'tpremove_FinancialYear\']");
     	 arr1[6] = new SubSettings(1,1,6,"Currency List","//*[@id=\'tpremove_div_Curr__src_\']");
     	 arr1[7] = new SubSettings(1,2,0,"Lookup Master","//*[@id=\'tpremove_PickList\']");
     	 arr1[8] = new SubSettings(1,2,1,"Employee Group","//*[@id=\'tpremove_Emp_Group_2904\']");*/
     	arr1[1] = new SubSettings(2,1,0,"Recruitment General Settings","//*[starts-with(@id,'tpremove_NewTab_REC_GenSett_')]");
     	/********************************************PAYROLL**********************************************************************/
     	/*-----------------------------------------Payroll General Configuration----------------------------------------------------------------------*/
     	arr1[2] = new SubSettings(9,1,0,"Pay Cycle","//*[@id=\'tpremove_PR_PayCycle_Mslist\']");
     	arr1[3] = new SubSettings(9,1,1,"Pay Components","//*[@id=\'tpremove_PR_PayComponent_Mslist']");
     	arr1[4] = new SubSettings(9,1,2,"Pay Template","//*[starts-with(@id,'tpremove_PR_PayCycle_Mslist')]");
     	arr1[5] = new SubSettings(9,1,3,"Employee Salary Master Access Privileges","//*[@id=\'tpremove_PR_ESMAP_Lst\']");
     	arr1[6] = new SubSettings(9,1,4,"Revise Salary","//*[starts-with(@id,'tpremove_ReviseSalary_')]");
     	arr1[7] = new SubSettings(9,1,5,"Revise Salary List","//*[starts-with(@id,'tpremove_Revise_SALARY__LIST\')]");
     	arr1[8] = new SubSettings(9,1,6,"Customize Component Formula","//*[@id=\'tpremove_dv_dv_pIT_DEC_Export\']");
     	arr1[9] = new SubSettings(9,1,7,"Overtime Pay Settings","//*[@id=\'tpremove_div_OT_Pay_Setting\']");
     	arr1[10] = new SubSettings(9,1,8,"Payslip Templates","//*[@id=\'tpremove_div_Custom_Payslip_\']");
     	arr1[11] = new SubSettings(9,1,9,"Gratuity Generation","//*[@id=\'tpremove_div_Gratuity_Sett\']");
     	arr1[12] = new SubSettings(9,1,10,"Bonus Configuration","//*[@id=\'tpremove_div_Bonus_config\']");
     	arr1[13] = new SubSettings(9,1,11,"Conditional Formula Engine","//*[starts-with(@id,'tpremove_PR_ConditionalFormulaEngine_')]");
     	arr1[14] = new SubSettings(9,1,12,"View Manual Overtime","//*[starts-with(@id,'tpremove_div_Import_OverTime_')]");
     	arr1[15] = new SubSettings(9,1,13,"Add/Remove Pay Cycle Components","//*[starts-with(@id,'tpremove_PR_PayCycle_Linkcomponents')]");
     	arr1[16] = new SubSettings(9,1,14,"Mapping PT Worklocation","//*[@id=\'tpremove_PR_MapPtWorklocation_\']");
     	arr1[17] = new SubSettings(9,1,15,"Work Week Template Settings","//*[starts-with(@id,'tpremove_div_work_week_config')]");
     	arr1[18] = new SubSettings(9,1,16,"Configure CTC Template	","//*[starts-with(@id,'tpremove_div_Config_CTC_Template')]");
     	/*-----------------------------------------Income tax Configuration----------------------------------------------------------------------*/
     	arr1[19] = new SubSettings(9,2,0,"Statutory Component Settings","//*[@id=\'tpremove_div_Payroll_Setting_\']");
     	arr1[20] = new SubSettings(9,2,1,"Create Financial Year","//*[@id=\'tpremove_div_Payroll_financial_\']");
     	arr1[21] = new SubSettings(9,2,2,"Exemption Component Settings","//*[@id=\'tpremove_div_Payroll_financial_\']");
     	arr1[22] = new SubSettings(9,2,3,"FORM16 Generation","//*[@id=\'tpremove_div_nw_tab_F16Gen_\']");
     	arr1[23] = new SubSettings(9,2,4,"PIC Detail for Reports","//*[starts-with(@id,'tpremove_div_dzPIC_')]");
     	arr1[24] = new SubSettings(9,2,5,"Post IT declaration","//*[starts-with(@id,'tpremove_BackPay_')]");
     	arr1[25] = new SubSettings(9,2,6,"IT declaration Excel Import","//*[@id=\'tpremove_div_IT_Del_ExcelImport\']");
     	/*-----------------------------------------Reimbursement Configuration----------------------------------------------------------------------*/
     	arr1[26] = new SubSettings(9,3,0,"Reimbursement Components","//*[@id=\'tpremove_New_Tab_RI_Config_SettCon_\']");
     	arr1[27] = new SubSettings(9,3,1,"Reimbursement Entitlement Process","//*[@id=\'tpremove_div_nw_tab_REP_\']");
     	arr1[28] = new SubSettings(9,3,2,"Reimbursement Process","//*[@id=\'tpremove_New_Tab_RI_Proc_\']");
     	arr1[29] = new SubSettings(9,3,3,"Reimbursement Processed List","//*[@id=\'tpremove_New_Tab_RI_Proc_lst\']");
     	/*-----------------------------------------JV Configuration----------------------------------------------------------------------*/
     	arr1[30] = new SubSettings(9,4,0,"JV Template","//*[@id=\'tpremove_div__JV_Template_Sett\']");
     	arr1[31] = new SubSettings(9,4,1,"JV Template Result","//*[@id=\'tpremove_div_1_JV_Template_Result_\']");
     	/********************************************PAYROLL**********************************************************************/
     	/*arr[1] = new SubSettings();
     	arr[1] = new SubSettings();
     	arr[1] = new SubSettings();
     	arr[1] = new SubSettings();
     	arr[1] = new SubSettings();
     	arr[1] = new SubSettings();
     	*/
        Applogs app = new Applogs();
		app.analyzeLog(driver);
		settingsDetails(driver);
		for (int i=0;i<arr.length;i++){
	          try {   	      
			    	  String sID = "//*[@id='div_sys_moduledet_"+arr[i].SettingId+"']";	
			    	  //*[@id="div_sys_modulelist_1"]
			    	  driver.findElement(By.xpath(sID)).click();
			          TimeUnit.SECONDS.sleep(5); 
			          System.out.println("****************************"+ arr[i].DisplayName	+ "***********************************");
			     	  for (int j=0;j<arr1.length;j++){
			     	  if(arr1[j].subSettingsId==arr[i].SettingId) {
			        	System.out.println((j+1)+"."+arr1[j].SettingDisplayName + " logs started to capture...Please wait... ");
			        	System.out.println("----------------------------------------------------------------------");
			        	String subSettingOpenID = "//*[@id='div_subgrp_item_"+arr1[j].subSettingsId+"_"+arr1[j].groupID+"_"+arr1[j].innerSettingID+"']";
				     	//String subSettingOpenID = "//*[@id='div_subgrp_item_1_1_0']";
				     	driver.findElement(By.xpath(subSettingOpenID)).click();
				        TimeUnit.SECONDS.sleep(20); 
				        app.analyzeLog(driver);
				        String ShotID = "C://Screenshots//Settings//"+arr1[j].SettingDisplayName + "Screenshot.png";
				       // C://Screenshots//ApplyLeaveforEmployees.png
				        ScreenShot sc = new ScreenShot();
				        ScreenShot.takeSnapShot(driver,ShotID);
				     	driver.findElement(By.xpath(arr1[j].subSettingCloseId)).click(); 
				     	TimeUnit.SECONDS.sleep(2); 
				     	System.out.println("----------------------------------------------------------------------");
				     	System.out.println((j+1)+"."+arr1[j].SettingDisplayName + " logs captured sucessfully!!!");
				     	System.out.println("=======================================================================");
			     	 }
			     	 }
			            driver.findElement(By.xpath(sID)).click();
			            //driver.findElement(By.xpath(arr[i].SettingName+arr[i].SettingId)).click();
			            TimeUnit.SECONDS.sleep(3); 
			            //System.out.println("------------------------------------"+ arr[i].DisplayName	+ "-----------------------------------");	
			         }
	          catch (InterruptedException e) {
	      		  // TODO Auto-generated catch block
	        	  JavascriptExecutor js1 = (JavascriptExecutor)driver;	
	     		  js1.executeScript("window.scrollBy(0,30)");	
	              e.printStackTrace();
	      	} 
	          }
		 closeSystemSettings(driver);
		  }

public static void settingsDetails(WebDriver driver) {
	 try {
		 driver.findElement(By.id("div_Setting_Id_")).click();
		 TimeUnit.SECONDS.sleep(10);
		 System.out.println("Capturing error on System settings..Please wait..");
		 Applogs app = new Applogs();
		 app.analyzeLog(driver);
		 System.out.println("Captured error on system settings..");
		 System.out.println("Now,started to capture logs in module system settings..");
	} 
	 catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}	

public static void closeSystemSettings(WebDriver driver) {
	try {
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.xpath("//*[@id=\'tpremove_adminLand\']")).click();
		System.out.println("System Settings logs completed!");
	} 
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}