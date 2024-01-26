package BillingTest;

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

import OPDpages.OPD_registration;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill {

	ATUTestRecorder recorder;
	public static WebDriver driver=null;

	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();


	@Test(priority=1)
	@Parameters({"Uesrid"})
	public void TC_01_Verify_Login(String Uesrid) throws InterruptedException, IOException 
	{

		OPDpages.Login LoginScreen=new OPDpages.Login(driver);
		LoginScreen.login_Medcare(Uesrid);

	}
	


	@Test(priority=2)
	@Parameters({"PrimaryIdNumber12", "QuickExparyDatePar", "QuickFullNamePar", "QuickDateOfBirthPar", "QuickMobileNumberPar", "QuickEncounterRemarksPar", "QuickAddNotesPar", "QuickEncounterNotesPar", "QuickPatientNotesPar", "QuickReferralRemarksPar", "PolicyNoPar","PolicyDatePar","HolderNamePar","CustomerNamePar","GLRefNOPar","GLDatePar","ExpiryDatePar","GLAmountPar","CoverageAmountPar","ContactNamePar","DesignationPar","ContactNoPar","GLRemarksPar"})
	public void TC_02_GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill(String PrimaryIdNumber12,String QuickExparyDatePar,String QuickFullNamePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar,String PolicyNoPar,String PolicyDatePar,String HolderNamePar,String CustomerNamePar,String GLRefNOPar,String GLDatePar,String ExpiryDatePar,String GLAmountPar,String CoverageAmountPar,String ContactNamePar,String DesignationPar,String ContactNoPar,String GLRemarksPar) throws InterruptedException, IOException, AWTException 

	{
		
		BillingPages.GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill_Page OPDBill=new BillingPages.GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill_Page(driver);
		OPDBill.GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill_Page_func( PrimaryIdNumber12, QuickExparyDatePar, QuickFullNamePar, QuickDateOfBirthPar, QuickMobileNumberPar, QuickEncounterRemarksPar, QuickAddNotesPar, QuickEncounterNotesPar, QuickPatientNotesPar, QuickReferralRemarksPar, PolicyNoPar, PolicyDatePar, HolderNamePar, CustomerNamePar, GLRefNOPar, GLDatePar, ExpiryDatePar, GLAmountPar, CoverageAmountPar, ContactNamePar, DesignationPar, ContactNoPar, GLRemarksPar);
		
	} 

	@BeforeTest

	public void startBrowser() throws ATUTestRecorderException 
	{

		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder(".//Videos//","GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill -"+dateFormat.format(date),false);
		recorder.start();  

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");

	}
	@AfterMethod(alwaysRun=true)
	public void FailedScreenShot(ITestResult Result) throws IOException
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failed_Search_GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill"+ dateFormat.format(date)));
		}
	}

	@AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		driver.quit();
		recorder.stop();   
	}
}