package BillingTest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OP_Patient_Self_Deposit_Debit_Note_Partial_Consume_Test {
	
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
  @Parameters({"PrimaryIdNumber12","ExparyDatePar","SecondaryIdNumber12","SecondaryExparyDatePar","FullNamePar","DateOfBirthPar","MotherNamePar","PatientNotes","ResidentialAddressPar","PostCodePar","MobileNumberPar","Emailpar","PersonalFaxpar","WorkFaxpar","WorkContactNopar","HomeContactNopar","DepositAmountPar","DepositRemarksPar","IDNoPar","PaymentRemarksPar","ServiceNamePar","ServiceName2Par"})
  public void TC_02_OPCharge_Screen(String PrimaryIdNumber12,String ExparyDatePar,String SecondaryIdNumber12,String SecondaryExparyDatePar,String FullNamePar,String DateOfBirthPar,String MotherNamePar,String PatientNotes,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String DepositAmountPar,String DepositRemarksPar,String IDNoPar,String PaymentRemarksPar,String ServiceNamePar,String ServiceName2Par) throws InterruptedException, IOException 
  
  {
	  BillingPages.OP_Patient_Self_Deposit_Partial_Consume_Page OPPatientDepositSelf=new BillingPages.OP_Patient_Self_Deposit_Partial_Consume_Page(driver);
	  OPPatientDepositSelf.OPPatientDepositSelfPartialConsume(PrimaryIdNumber12,ExparyDatePar,SecondaryIdNumber12,SecondaryExparyDatePar,FullNamePar,DateOfBirthPar,MotherNamePar,PatientNotes,ResidentialAddressPar,PostCodePar,MobileNumberPar,Emailpar,PersonalFaxpar,WorkFaxpar,WorkContactNopar,HomeContactNopar,DepositAmountPar,DepositRemarksPar,IDNoPar,PaymentRemarksPar,ServiceNamePar,ServiceName2Par);
	  
  }
  
  @BeforeTest
  
  public void startBrowser() throws ATUTestRecorderException, InterruptedException 
  {
	  
	  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://medcare-productqa.hatiintl.com/");
			Thread.sleep(8000);
			driver.manage().window().maximize(); 
			recorder = new ATUTestRecorder(".//Videos//","OP_Patient_Self_Deposit_Debit_Note_Partial_Consume_Test"+dateFormat.format(date),false);
			recorder.start();
	  
  }
      
  @AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
		driver.quit();
		recorder.stop();;
      
  }
}