package BillingTest_2;
import java.awt.AWTException;
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

import BillingPages_2.OPD_Registration_Encounter_For_Billing;
import BillingPages_2.OPD_registration_For_Billing;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OP_Patient_Registration_EncounterCreationADT_OP_to_IP_convert_IP_Charges_Test 
{
	public WebDriver driver;
	ATUTestRecorder recorder;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();

	@Test(priority=1)
	@Parameters({"Uesrid"})
	public void TC_01_Verify_Login(String Uesrid) throws InterruptedException, IOException 
	{
		//Login
		BillingPages_2.Login LoginScreen=new BillingPages_2.Login(driver);
		LoginScreen.login_Medcare(Uesrid);
	}	
	@Test(priority=2)
	 @Parameters({"PrimaryIdNumber12","ExparyDatePar","SecondaryIdNumber12","SecondaryExparyDatePar","FullNamePar","DateOfBirthPar","MotherNamePar","PatientNotes","ResidentialAddressPar","PostCodePar","MobileNumberPar","Emailpar","PersonalFaxpar","WorkFaxpar","WorkContactNopar","HomeContactNopar","EmploymentNoPar","WorkFromPar","ContactNumberPar","ResAddPar","PostCodePar12"})

	  public void TC_02_Verify_That_User_Is_Able_Fill_The_Basic_Information_To_Registration_Page(String PrimaryIdNumber12,String ExparyDatePar,String SecondaryIdNumber12,String SecondaryExparyDatePar,String FullNamePar,String DateOfBirthPar,String MotherNamePar,String PatientNotes,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String EmploymentNoPar,String WorkFromPar,String ContactNumberPar,String ResAddPar,String PostCodePar12) throws InterruptedException, IOException, AWTException 
	  {
		OPD_registration_For_Billing registration=new OPD_registration_For_Billing(driver);
		  registration.OPD_REGISTRATION(PrimaryIdNumber12,ExparyDatePar,SecondaryIdNumber12,SecondaryExparyDatePar,FullNamePar,DateOfBirthPar,MotherNamePar,PatientNotes,ResidentialAddressPar,PostCodePar,MobileNumberPar,Emailpar,PersonalFaxpar,WorkFaxpar,WorkContactNopar,HomeContactNopar,EmploymentNoPar,WorkFromPar,ContactNumberPar,ResAddPar,PostCodePar12);	  
	}
	 @Test(priority=3)
	 @Parameters({"EncounterRemarksPar","AddNotesPar","NamePar","IdentificationNOPar","PhoneNoPar","AddressPar","PostcodeParAdetailsPar"})
	  public void TC_03_Verify_That_User_Is_Able_TO_Fill_Encounter_Details(String EncounterRemarksPar,String AddNotesPar,String NamePar,String IdentificationNOPar,String PhoneNoPar,String AddressPar,String PostcodeParAdetailsPar) throws InterruptedException, IOException, AWTException
	  {
		 OPD_Registration_Encounter_For_Billing  enc=new OPD_Registration_Encounter_For_Billing (driver);
		  enc.Encounter(EncounterRemarksPar,AddNotesPar,NamePar,IdentificationNOPar,PhoneNoPar,AddressPar,PostcodeParAdetailsPar);
	  } 
	 @Test(priority=4)
		@Parameters({"LengthOfStayPar","AdmittingDiagPar","AddNotesPar","PatientNotesPar","AdmissionRemarksPar","ReferralRemarksPar","NamePar","IdentificationNOPar","PhoneNumberPar","AddressPar"})
		public void TC_04_Verify_User_Can_Fill_ADT_Admission_Form_Convert_Charges_For_OP_To_IP(String LengthOfStayPar,String AdmittingDiagPar,String AddNotesPar,String PatientNotesPar,String AdmissionRemarksPar,String ReferralRemarksPar,String NamePar,String IdentificationNOPar,String PhoneNumberPar,String AddressPar) throws InterruptedException, IOException
		{
			BillingPages_2.ADTAdmissionFormwith_Convert_Charges_OP_To_IP ADT=new BillingPages_2.ADTAdmissionFormwith_Convert_Charges_OP_To_IP(driver);
			ADT.ADT_Admission_Form_Convert_Charges(LengthOfStayPar,AdmittingDiagPar,AddNotesPar,PatientNotesPar,AdmissionRemarksPar,ReferralRemarksPar,NamePar,IdentificationNOPar,PhoneNumberPar,AddressPar);
		}
	 @Test(priority=5)
		public void TC_05_Verify_That_User_Is_Able_to_Add_IP_Charges_For_Patient() throws InterruptedException, IOException
		{
			BillingPages_2.IP_Charges_For_Self_Payer ip=new BillingPages_2.IP_Charges_For_Self_Payer(driver);
			ip.IPChargesForSelPayer();
		}
	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException 
	{
		recorder = new ATUTestRecorder(".//Videos//","AdmissionTest-"+dateFormat.format(date),false);
		recorder.start();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
	}	
	@AfterMethod(alwaysRun=true)
	public void FailedScreenShot(ITestResult Result) throws IOException
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_AdmissionTest"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}
}
