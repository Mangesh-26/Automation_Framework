package BillingTest_2;

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

public class ADTRequest_AdmissionForm_saveAdmission_IPBill_AddCharges_ApplyDiscount_FullSettlement 
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
	@Parameters ({"PriNumberPar","PatientNamePar","ExpiryDatePar","DOBPar","MobilePar","EmailPar","DOAPar","LengthPar","NotesPar","RemarksPar"})
	public void TC_02_User_Able_To_Do_AdmissionRequestform(String PriNumberPar,String PatientNamePar,String ExpiryDatePar,String DOBPar,String MobilePar,String EmailPar,String DOAPar,String LengthPar,String NotesPar,String RemarksPar) throws InterruptedException, IOException
	{
		BillingPages_2.ADTRequestForm ADT=new BillingPages_2.ADTRequestForm (driver);
		ADT.ADTFORREQUEST(PriNumberPar,PatientNamePar,ExpiryDatePar,DOBPar,MobilePar,EmailPar,DOAPar,LengthPar,NotesPar,RemarksPar);
	}
	@Test(priority=3)
	@Parameters({"AddressPar"})
	public void TC_03_User_Able_to_Do_ADTRegistartionForm(String AddressPar) throws InterruptedException, IOException
	{		
		BillingPages_2.AdmissionRegScreen ADTReg=new BillingPages_2.AdmissionRegScreen(driver);
		ADTReg.Registration(AddressPar);		
	}
	@Test(priority=4)
	@Parameters({"LengthOfStayPar","AdmittingDiagPar","AddNotesPar","PatientNotesPar","AdmissionRemarksPar","BillEstimationPar","ReferralRemarksPar","NamePar","IdentificationNOPar","PhoneNumberPar","AddressPar","ZipCodePar"})
	public void TC_04_Verify_User_Can_Fill_ADT_Admission_Form(String LengthOfStayPar,String AdmittingDiagPar,String AddNotesPar,String PatientNotesPar,String AdmissionRemarksPar,String BillEstimationPar,String ReferralRemarksPar,String NamePar,String IdentificationNOPar,String PhoneNumberPar,String AddressPar,String ZipCodePar) throws InterruptedException, IOException
	{
		BillingPages_2.ADTAdmissionForm_WIth_Reg ADTForm=new BillingPages_2.ADTAdmissionForm_WIth_Reg(driver);
		ADTForm.ADT_Admission_Form(LengthOfStayPar, AdmittingDiagPar, AddNotesPar, PatientNotesPar, AdmissionRemarksPar, BillEstimationPar, ReferralRemarksPar, NamePar, IdentificationNOPar, PhoneNumberPar,AddressPar,ZipCodePar);
	}
	@Test(priority=5)
	public void TC_05_Verify_That_User_Is_Able_Create_IP_BILL_FullSettelment_Apply_Discount() throws InterruptedException, IOException
	{
		BillingPages_2.ADTRequestedForm_IP_Bill_Full_Settlement_Cash_Apply_Discount  ip=new BillingPages_2.ADTRequestedForm_IP_Bill_Full_Settlement_Cash_Apply_Discount (driver);
		ip.IPCharges_IPD_BIll_FullSettelment_Apply_Discount();
	}
	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException 
	{
		recorder = new ATUTestRecorder(".//Videos//","ADTRequest_AdmissionForm_saveAdmission_IPBill_AddCharges_ApplyDiscount_FullSettlement-"+dateFormat.format(date),false);
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
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_ADTRequest_AdmissionForm_saveAdmission_IPBill_AddCharges_ApplyDiscount_FullSettlement.png"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}
}