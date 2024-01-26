package BillingTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BillingPages.OP_GLApproval_Status_Approved_Page;
import BillingPages.OP_GLApproval_Status_Pending_Page;
import OPDpages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OP_GLApproval_Status_Pending_Test {
	
	ATUTestRecorder recorder;
	public static WebDriver driver=null;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
    Date date = new Date();
	
	
	@Test
	  @Parameters({"Uesrid"})
	  public void TC_01_Verify_Login(String Uesrid) throws InterruptedException, IOException 
	  {
		  
		Login LoginScreen=new Login(driver);
		  LoginScreen.login_Medcare(Uesrid);
		  
	  }
 @Test
 @Parameters({"PrimaryIdNumberPar","ExparyDatePar","SecondaryIdNumberPar","SecondaryExparyDatePar","FullNamePar","DateOfBirthPar","MotherNamePar","PatientNotesPar","ResidentialAddressPar","PostCodePar","MobileNumberPar","Emailpar","PersonalFaxpar","WorkFaxpar","WorkContactNopar","HomeContactNopar","PolicyNoPar","HolderNamePar","CustomerNamePar","GLRefNOPar","GLAmountPar","CoverageAmountPar","ContactNamePar","DesignationPar","ContactNoPar","GLRemarksPar"})
 public void TC_02_User_Able_To_Update_GL_Approval_Pending(String PrimaryIdNumberPar,String ExparyDatePar,String SecondaryIdNumberPar,String SecondaryExparyDatePar,String FullNamePar,String DateOfBirthPar,String MotherNamePar,String PatientNotesPar,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String PolicyNoPar,String HolderNamePar,String CustomerNamePar,String GLRefNOPar,String GLAmountPar,String CoverageAmountPar,String ContactNamePar,String DesignationPar,String ContactNoPar,String GLRemarksPar) throws InterruptedException, IOException
 
 {
	 OP_GLApproval_Status_Pending_Page PendingStatus=new OP_GLApproval_Status_Pending_Page(driver);
	 PendingStatus.GLStatusPending(PrimaryIdNumberPar,ExparyDatePar,SecondaryIdNumberPar,SecondaryExparyDatePar,FullNamePar,DateOfBirthPar,MotherNamePar,PatientNotesPar,ResidentialAddressPar,PostCodePar,MobileNumberPar,Emailpar,PersonalFaxpar,WorkFaxpar,WorkContactNopar,HomeContactNopar,PolicyNoPar,HolderNamePar,CustomerNamePar,GLRefNOPar,GLAmountPar,CoverageAmountPar,ContactNamePar,DesignationPar,ContactNoPar,GLRemarksPar);
	
	 
  }
  
 @BeforeTest
 
 public void startBrowser() throws ATUTestRecorderException, InterruptedException 
 {
	 
	 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
		recorder = new ATUTestRecorder(".//Videos//","OP_GLApproval_Status_Pending_Test"+dateFormat.format(date),false);
		recorder.start();
		  
	  }
 
 
 @AfterMethod(alwaysRun=true)
 public void FailedScreenShot(ITestResult Result) throws IOException
 {
     if(ITestResult.FAILURE==Result.getStatus())
     {
         File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_OP_GLApproval_Status_Pending_Test"+ dateFormat.format(date)));
     }
 
 }
 
	      
	  @AfterSuite
		public void afterTest() throws ATUTestRecorderException {
			// driver =new ChromeDriver();
			driver.quit();
			recorder.stop();;
	      
	  }
	}