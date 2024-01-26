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


import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OP_Patient_Self_Deposit_With_Multiple_Payment_Against_Account_Test {
	
	ATUTestRecorder recorder;
	public static WebDriver driver=null;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
    Date date = new Date();
	
	@Test
	  @Parameters({"Uesrid"})
	  public void TC_01_Verify_Login(String Uesrid) throws InterruptedException, IOException 
	  {
		  
		  OPDpages.Login LoginScreen=new OPDpages.Login(driver);
		  LoginScreen.login_Medcare(Uesrid);
		  
	  }
	

  @Test
  @Parameters({"PrimaryIdNumberPar","ExparyDatePar","SecondaryIdNumberPar","SecondaryExparyDatePar","FullNamePar","DateOfBirthPar","MotherNamePar","PatientNotes","ResidentialAddressPar","PostCodePar","MobileNumberPar","Emailpar","PersonalFaxpar","WorkFaxpar","WorkContactNopar","HomeContactNopar","DepositAmountPar","DepositRemarksPar","CashPar","ChequeAmountPar","ChequeNumberPar","BatchNoPar","CardAmountPar","CardNumberPar","ApprovalCodePar","ReceivedFromPar","IDNoPar","PaymentRemarksPar"})
  public void TC_02_OP_Patient_Deposit_Self_MutiplePayment_Against_Account(String PrimaryIdNumberPar,String ExparyDatePar,String SecondaryIdNumberPar,String SecondaryExparyDatePar,String FullNamePar,String DateOfBirthPar,String MotherNamePar,String PatientNotes,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String DepositAmountPar,String DepositRemarksPar,String CashPar,String ChequeAmountPar,String ChequeNumberPar,String BatchNoPar,String CardAmountPar,String CardNumberPar,String ApprovalCodePar,String ReceivedFromPar,String IDNoPar,String PaymentRemarksPar) throws InterruptedException, IOException 
  
  {
	  BillingPages.OP_Patient_Self_Deposit_With_Multiple_Payment_Against_Account_Page OPDepositSelfMultiplePaymentagainstaccount=new BillingPages.OP_Patient_Self_Deposit_Against_Account_Page(driver);
	  OPDepositSelfMultiplePaymentagainstaccount.OP_Patient_Deposit_Self_MutiplePayment_Against_Account(PrimaryIdNumberPar,ExparyDatePar,SecondaryIdNumberPar,SecondaryExparyDatePar,FullNamePar,DateOfBirthPar,MotherNamePar,PatientNotes,ResidentialAddressPar,PostCodePar,MobileNumberPar,Emailpar,PersonalFaxpar,WorkFaxpar,WorkContactNopar,HomeContactNopar,DepositAmountPar,DepositRemarksPar,CashPar,ChequeAmountPar,ChequeNumberPar,BatchNoPar,CardAmountPar,CardNumberPar,ApprovalCodePar,ReceivedFromPar,IDNoPar,PaymentRemarksPar);
	  
  }
  
  @BeforeTest
  
  public void startBrowser() throws ATUTestRecorderException, InterruptedException 
  {
	  
	  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://medcare-productqa.hatiintl.com/");
			Thread.sleep(8000);
			driver.manage().window().maximize(); 
			recorder = new ATUTestRecorder(".//Videos//","OP_Patient_Self_Deposit_With_Multiple_Payment_Against_Account_Test"+dateFormat.format(date),false);
			recorder.start();
	  
  } 
      @AfterMethod(alwaysRun=true)
      public void FailedScreenShot(ITestResult Result) throws IOException
      {
          if(ITestResult.FAILURE==Result.getStatus())
          {
              File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
              FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_OP_Patient_Self_Deposit_With_Multiple_Payment_Against_Account_Test"+ dateFormat.format(date)));
          }
         
  }
      
  @AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
		driver.quit();
		recorder.stop();;
      
  }
}