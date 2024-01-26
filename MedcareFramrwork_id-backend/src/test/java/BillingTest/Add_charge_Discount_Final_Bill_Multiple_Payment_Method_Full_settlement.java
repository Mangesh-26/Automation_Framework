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
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_charge_Discount_Final_Bill_Multiple_Payment_Method_Full_settlement {

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
	@Parameters({"QuickPrimaryIdNumberPar","QuickExparyDatePar","QuickDateOfBirthPar","QuickMobileNumberPar","QuickEncounterRemarksPar","QuickAddNotesPar","QuickEncounterNotesPar","QuickPatientNotesPar","QuickReferralRemarksPar","ServiceNamePar","ServiceName2Par","ReceivedFromPar","IdentificationNoPar","RemarksPar"})
	public void TC_02_Add_charge_Discount_Final_Bill_Multiple_Payment_Method_Full_settlement(String QuickPrimaryIdNumberPar,String QuickExparyDatePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar,String ServiceNamePar,String ServiceName2Par,String ReceivedFromPar,String IdentificationNoPar,String RemarksPar) throws InterruptedException, IOException, AWTException 

	{
		BillingPages.Add_charge_Discount_Final_Bill_Multiple_Payment_Method_Full_settlement Discount=new BillingPages.Add_charge_Discount_Final_Bill_Multiple_Payment_Method_Full_settlement(driver);
		Discount.Add_charge_Discount_Final_Bill_Multiple_Payment_Method_Full_settlementfunc(QuickPrimaryIdNumberPar,QuickExparyDatePar,QuickDateOfBirthPar,QuickMobileNumberPar,QuickEncounterRemarksPar,QuickAddNotesPar,QuickEncounterNotesPar,QuickPatientNotesPar,QuickReferralRemarksPar,ServiceNamePar,ServiceName2Par,ReceivedFromPar,IdentificationNoPar,RemarksPar);

	}

	@BeforeTest

	public void startBrowser() throws ATUTestRecorderException 
	{

		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder(".//Videos//","Add_charge_Discount_Final_Bill_Multiple_Payment_Method_Full_settlement -"+dateFormat.format(date),false);
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
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Add_charge_Discount_Final_Bill_Multiple_Payment_Method_Full_settlement"+ dateFormat.format(date)));
		}
	}

	@AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		driver.quit();
		recorder.stop();   
	}
}