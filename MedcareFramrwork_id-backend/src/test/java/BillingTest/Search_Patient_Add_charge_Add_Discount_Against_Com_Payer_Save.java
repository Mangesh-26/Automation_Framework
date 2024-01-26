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

public class Search_Patient_Add_charge_Add_Discount_Against_Com_Payer_Save {

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
	@Parameters({"PrimaryIdNumber12", "QuickExparyDatePar", "QuickFullNamePar", "QuickDateOfBirthPar", "QuickMobileNumberPar", "QuickEncounterRemarksPar", "QuickAddNotesPar", "QuickEncounterNotesPar", "QuickPatientNotesPar", "QuickReferralRemarksPar"})
	public void TC_02_Search_Patient_Add_charge_Add_Discount_Against_Com_Payer_Save(String PrimaryIdNumber12,String QuickExparyDatePar,String QuickFullNamePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar) throws InterruptedException, IOException, AWTException 

	{
		
		BillingPages.Search_Patient_Add_charge_Add_Discount_Against_Com_Payer_Save OPDBill=new BillingPages.Search_Patient_Add_charge_Add_Discount_Against_Com_Payer_Save(driver);
		OPDBill.Search_Patient_Add_charge_Add_Discount_Against_Com_Payer_Save_func( PrimaryIdNumber12, QuickExparyDatePar, QuickFullNamePar, QuickDateOfBirthPar, QuickMobileNumberPar, QuickEncounterRemarksPar, QuickAddNotesPar, QuickEncounterNotesPar, QuickPatientNotesPar, QuickReferralRemarksPar);

	}

	@BeforeTest

	public void startBrowser() throws ATUTestRecorderException 
	{

		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder(".//Videos//","Search_patient_Add_charge_Against_Com_Payer_Save -"+dateFormat.format(date),false);
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
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failed_Search_patient_Add_charge_Against_Com_Payer_Save"+ dateFormat.format(date)));
		}
	}

	@AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		driver.quit();
		recorder.stop();   
	}
}