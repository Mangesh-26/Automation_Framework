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

import BillingPages.OP_FinalBill_Partial_Settlement_Self_Page;
import OPDpages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OP_FinalBill_Partial_Settlement_Self_Test {
	
	ATUTestRecorder recorder;
	public static WebDriver driver=null;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
    Date date = new Date();
	
  @Test
  @Parameters({"Uesrid"})
  public void TC_01_Verify_Login_Page(String Uesrid) throws InterruptedException, IOException 
  {
	  Login LoginScreen=new Login(driver);
	  LoginScreen.login_Medcare(Uesrid);
	  
  }
  
  @Test
  @Parameters({"QuickPrimaryIdNumberPar","QuickExparyDatePar","QuickFullNamePar","QuickDateOfBirthPar","QuickMobileNumberPar","QuickEncounterRemarksPar","QuickAddNotesPar","QuickEncounterNotesPar","QuickPatientNotesPar","QuickReferralRemarksPar","ServiceNamePar","ServiceName2Par","ReceivedFromPar","IdentificationNoPar","RemarksPar"})
  public void TC_02_User_Able_To_Generate_OPBill_Partial_Settlement(String QuickPrimaryIdNumberPar,String QuickExparyDatePar,String QuickFullNamePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar,String ServiceNamePar,String ServiceName2Par,String ReceivedFromPar,String IdentificationNoPar,String RemarksPar) throws InterruptedException, IOException 
  
  {
	  OP_FinalBill_Partial_Settlement_Self_Page OPDPartialBill=new OP_FinalBill_Partial_Settlement_Self_Page(driver);
	  OPDPartialBill.OPFinalBillPartialSettle(QuickPrimaryIdNumberPar,QuickExparyDatePar,QuickFullNamePar,QuickDateOfBirthPar,QuickMobileNumberPar,QuickEncounterRemarksPar,QuickAddNotesPar,QuickEncounterNotesPar,QuickPatientNotesPar,QuickReferralRemarksPar,ServiceNamePar,ServiceName2Par,ReceivedFromPar,IdentificationNoPar,RemarksPar);
	  
  }
  
@BeforeTest
  
  public void startBrowser() throws ATUTestRecorderException, InterruptedException 
  {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://medcare-productqa.hatiintl.com/");
	Thread.sleep(8000);
	driver.manage().window().maximize(); 
	recorder = new ATUTestRecorder(".//Videos//","OP_FinalBill_Partial_Settlement_Self_Test"+dateFormat.format(date),false);
	recorder.start();
      
  }

@AfterMethod(alwaysRun=true)
public void FailedScreenShot(ITestResult Result) throws IOException
{
    if(ITestResult.FAILURE==Result.getStatus())
    {
        File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_OP_FinalBill_Partial_Settlement_Self_Test"+ dateFormat.format(date)));
    }

}

      @AfterSuite
  	public void afterTest() throws ATUTestRecorderException {
  		// driver =new ChromeDriver();
  		driver.quit();
  		recorder.stop();;
      
}
}
