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
public class IPBILL_For_Self
{
	WebDriver driver;
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
	public void Verify_That_User_Is_Able_to_Add_IP_Bill_For_Patient() throws InterruptedException, IOException
	{
		BillingPages_2.IP_Bill_For_Self  ip=new BillingPages_2.IP_Bill_For_Self (driver);
		ip.IPDBillForSelPayer();
	}
	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException 
	{
		
		recorder = new ATUTestRecorder(".//Videos//","IPBILL_For_Self-"+dateFormat.format(date),false);
		recorder.start();
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Eclipse WorkSpace\\Medcare_Hati\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 //WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.get("https://medcare-productqa.hatiintl.com/");
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
		/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");
		*/	
	}
	@AfterMethod(alwaysRun=true)
	public void FailedScreenShot(ITestResult Result) throws IOException
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_IPBILL_For_Self"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}

}
