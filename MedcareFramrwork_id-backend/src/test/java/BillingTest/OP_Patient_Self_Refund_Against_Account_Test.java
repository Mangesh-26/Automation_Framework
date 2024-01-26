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

import BillingPages.OP_Company_Deposit_Singal_Payment_Method_Page;
import BillingPages.OP_Company_Full_Refund_Page;
import BillingPages.OP_Debit_Note_Against_Company_Payer_Page;
import BillingPages.OP_Debit_Note_OPCharge_Against_Company_Payer_Page;

import OPDpages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OP_Patient_Self_Refund_Against_Account_Test {
	
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
  @Parameters({"PrimaryIdNumberPar","ExparyDatePar","SecondaryIdNumberPar","SecondaryExparyDatePar","FullNamePar","DateOfBirthPar","MotherNamePar","PatientNotesPar","ResidentialAddressPar","PostCodePar","MobileNumberPar","Emailpar","PersonalFaxpar","WorkFaxpar","WorkContactNopar","HomeContactNopar","DepositAmountPar","DepositRemarksPar","IDNoPar","PaymentRemarksPar","RefundAmountPar"})
  public void TC_02_User_Able_To_Do_Partial_Refund_Against_Company (String PrimaryIdNumberPar,String ExparyDatePar,String SecondaryIdNumberPar,String SecondaryExparyDatePar,String FullNamePar,String DateOfBirthPar,String MotherNamePar,String PatientNotesPar,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String DepositAmountPar,String DepositRemarksPar,String IDNoPar,String PaymentRemarksPar,String RefundAmountPar) throws InterruptedException, IOException 
  
  {
	  BillingPages.OP_Patient_Self_Refund_Against_Account_Page AccountFullRefund=new BillingPages.OP_Patient_Self_Refund_Against_Account_Page(driver);
	  AccountFullRefund.OPRefundForSelfAgainstAccount(PrimaryIdNumberPar,ExparyDatePar,SecondaryIdNumberPar,SecondaryExparyDatePar,FullNamePar,DateOfBirthPar,MotherNamePar,PatientNotesPar,ResidentialAddressPar,PostCodePar,MobileNumberPar,Emailpar,PersonalFaxpar,WorkFaxpar,WorkContactNopar,HomeContactNopar,DepositAmountPar,DepositRemarksPar,IDNoPar,PaymentRemarksPar,RefundAmountPar);
	  
  }
  
  @BeforeTest
  
  public void startBrowser() throws ATUTestRecorderException, InterruptedException 
  {
	  
	  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://medcare-productqa.hatiintl.com/");
			Thread.sleep(8000);
			driver.manage().window().maximize(); 
			recorder = new ATUTestRecorder(".//Videos//","OP_Patient_Self_Refund_Against_Account_Test"+dateFormat.format(date),false);
			recorder.start();
	  
  }
      
  @AfterMethod(alwaysRun=true)
  public void FailedScreenShot(ITestResult Result) throws IOException
  {
      if(ITestResult.FAILURE==Result.getStatus())
      {
          File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_OP_Patient_Self_Refund_Test"+ dateFormat.format(date)));
      }
  
  }
  
  @AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
		driver.quit();
		recorder.stop();;
      
  }
}