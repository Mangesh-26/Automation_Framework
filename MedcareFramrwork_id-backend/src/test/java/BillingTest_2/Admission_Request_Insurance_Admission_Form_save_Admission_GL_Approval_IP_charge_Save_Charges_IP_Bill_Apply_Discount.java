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

import BillingPages_2.ADTAdmissionForm_WIth_Reg_with_Insurance;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Admission_Request_Insurance_Admission_Form_save_Admission_GL_Approval_IP_charge_Save_Charges_IP_Bill_Apply_Discount 
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
	public void TC_04_Verify_User_Can_Fill_ADT_Admission_Form_With_Insurance(String LengthOfStayPar,String AdmittingDiagPar,String AddNotesPar,String PatientNotesPar,String AdmissionRemarksPar,String BillEstimationPar,String ReferralRemarksPar,String NamePar,String IdentificationNOPar,String PhoneNumberPar,String AddressPar,String ZipCodePar) throws InterruptedException, IOException
	{
		BillingPages_2.ADTAdmissionForm_WIth_Reg_with_Insurance ADTForm=new ADTAdmissionForm_WIth_Reg_with_Insurance(driver);
		ADTForm.ADT_Admission_Form_with_Insurance(LengthOfStayPar, AdmittingDiagPar, AddNotesPar, PatientNotesPar, AdmissionRemarksPar, BillEstimationPar, ReferralRemarksPar, NamePar, IdentificationNOPar, PhoneNumberPar,AddressPar,ZipCodePar);
	}	
	@Test(priority=5)
	@Parameters({"PolicyNoPar","PolicyDatePar","HolderNamePar","CustomerNamePar","GLRefNOPar","GLDatePar","ExpiryDatePar","GLAmountPar","CoverageAmountPar","ContactNamePar","DesignationPar","ContactNoPar","GLRemarksPar"})
	public void TC_05_Verify_User_Can_DO_GL_Approval_For_IP_Charges_And_IPD_BILL_Apply_Discount(String PolicyNoPar,String PolicyDatePar,String HolderNamePar,String CustomerNamePar,String GLRefNOPar,String GLDatePar,String ExpiryDatePar,String GLAmountPar,String CoverageAmountPar,String ContactNamePar,String DesignationPar,String ContactNoPar,String GLRemarksPar) throws InterruptedException, IOException
	{
		BillingPages_2.GLApproval_ADT_Requested_FOR_IP_Charge_IP_BILL_Apply_Discount GLIPChargesipbill=new BillingPages_2.GLApproval_ADT_Requested_FOR_IP_Charge_IP_BILL_Apply_Discount(driver);
		GLIPChargesipbill.GLApprovalForADT_Req_GL_Approval_IPCharges_IPBILL_Discount(PolicyNoPar,PolicyDatePar,HolderNamePar,CustomerNamePar,GLRefNOPar,GLDatePar,ExpiryDatePar,GLAmountPar,CoverageAmountPar,ContactNamePar,DesignationPar,ContactNoPar,GLRemarksPar);	 
	}
	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException 
	{
		recorder = new ATUTestRecorder(".//Videos//","Admission_Request_Insurance_Admission_Form_save_Admission_GL_Approval_IP_charge_Save_Charges_IP_Bill_Apply_Discount-"+dateFormat.format(date),false);
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
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_Admission_Request_Insurance_Admission_Form_save_Admission_GL_Approval_IP_charge_Save_Charges_IP_Bill_Apply_Discount.png"+dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}
}