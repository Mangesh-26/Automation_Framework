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

import BillingPages.Existing_Patient_OPCharge_WithGroup_Discount_Save_Self_Page;
import OPDpages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Existing_Patient_OPCharge_WithGroup_Discount_Save_Self_Test {
	
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
  @Parameters({"PrimaryIdNumber12","ExparyDatePar","SecondaryIdNumber12","SecondaryExparyDatePar","FullNamePar","DateOfBirthPar","MotherNamePar","BirthPlacePar","PatientNotes","ResidentialAddressPar","PostCodePar","MobileNumberPar","Emailpar","PersonalFaxpar","WorkFaxpar","WorkContactNopar","HomeContactNopar","EmploymentNoPar","WorkFromPar","ContactNumberPar","ResAddPar","PostCodePar12","EncounterRemarksPar","ServiceNamePar","ServiceName2Par"})
  public void TC_02_Existing_Patient_OP_Charge_With_Group_Discount_Save_Self(String PrimaryIdNumber12,String ExparyDatePar,String SecondaryIdNumber12,String SecondaryExparyDatePar,String FullNamePar,String DateOfBirthPar,String MotherNamePar,String BirthPlacePar,String PatientNotes,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String EmploymentNoPar,String WorkFromPar,String ContactNumberPar,String ResAddPar,String PostCodePar12,String EncounterRemarksPar,String ServiceNamePar,String ServiceName2Par) throws InterruptedException, IOException 
  
  {
	  Existing_Patient_OPCharge_WithGroup_Discount_Save_Self_Page ExistingPatientOpChargeSaveWithGroupDiscountSelf=new Existing_Patient_OPCharge_WithGroup_Discount_Save_Self_Page(driver);
	  ExistingPatientOpChargeSaveWithGroupDiscountSelf.ExistingPatientOPChargeWithGroupDiscount(PrimaryIdNumber12,ExparyDatePar,SecondaryIdNumber12,SecondaryExparyDatePar,FullNamePar,DateOfBirthPar,MotherNamePar,BirthPlacePar,PatientNotes,ResidentialAddressPar,PostCodePar,MobileNumberPar,Emailpar,PersonalFaxpar,WorkFaxpar,WorkContactNopar,HomeContactNopar,EmploymentNoPar,WorkFromPar,ContactNumberPar,ResAddPar,PostCodePar12,EncounterRemarksPar,ServiceNamePar,ServiceName2Par);
	  
  }
  
  @BeforeTest
  
  public void startBrowser() throws ATUTestRecorderException, InterruptedException 
  {
	  
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
		recorder = new ATUTestRecorder(".//Videos//","Existing_Patient_OPCharge_WithGroup_Discount_Save_Self_Test"+dateFormat.format(date),false);
		recorder.start();
	  
  }
  
  
  
  @AfterMethod(alwaysRun=true)
  public void FailedScreenShot(ITestResult Result) throws IOException
  {
      if(ITestResult.FAILURE==Result.getStatus())
      {
          File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_Existing_Patient_OPCharge_WithGroup_Discount_Save_Self_Test"+ dateFormat.format(date)));
      }
  
  }
      
  @AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
		driver.quit();
		recorder.stop();;
      
  }
}