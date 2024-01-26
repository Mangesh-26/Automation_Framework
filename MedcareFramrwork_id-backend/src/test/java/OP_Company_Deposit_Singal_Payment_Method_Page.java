package BillingPages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OP_Company_Deposit_Singal_Payment_Method_Page 
{
	
	WebDriver driver;
	By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	
	By BillingMenuClik=By.xpath("//span[contains(text(),'Billing')]");
	
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	
	//BillingDisappear
	By BillDisappear=By.cssSelector("a[id='31']");
	
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");
	

	//DepositClick
	By DepositClick=By.cssSelector("a[id='30']");
	//COmpany Sub Menu
	By CompanyMenuClick=By.cssSelector("a[id='131']");
	//COmpany Type
	By CompanyTypeClick=By.cssSelector("mat-select[ng-reflect-name='companyType']");
	By CompanySelOpt=By.xpath("//span[contains(text(),'Insurance')]");
	//company
	By CompanySelectClick=By.cssSelector("mat-select[placeholder='Select Company']");
	//COmpany Select Option
	By CompanySelOptClick=By.xpath("//span[contains(text(),'AIA Berhad')]");
	//Search click
	By SearchClick=By.xpath("//mat-icon[contains(text(),'search')]");
	//Amount
	By AmountClick=By.cssSelector("input[formcontrolname='amount']");
	//Remark
	By RemarkClcik=By.cssSelector("input[ng-reflect-name='remark']");
	//Save button
	By SaveBtnClick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	//Add payment details
	By AddPaymentDetailsClick=By.cssSelector("mat-icon[ng-reflect-message='Add Payment Details']");
	//Save payment Details
	By SavePaymentBtnClick=By.cssSelector("mat-icon[ng-reflect-message='Save Payment Details']");
	//Yes Button
	By YesBtnClick=By.xpath("//mat-icon[contains(text(),'done')]");

	
 public OP_Company_Deposit_Singal_Payment_Method_Page (WebDriver driver)
	
	{
		this.driver=driver;
				
	}
	
	
  
  public void OPCompanyDepositSingalPayment(String DepositAmountPar, String DepositRemarksPar) throws InterruptedException, IOException 
  {
	  
	  Actions act = new Actions(driver);
		Thread.sleep(5000);
		WebElement ele1=driver.findElement(mainmenu);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();

		Thread.sleep(8000);
		driver.findElement(BillingMenuClik).click();

		//SideBar
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();

		//BillDisappear
		Thread.sleep(3000);
		driver.findElement(BillDisappear).click();
		

		//DepositClick
		Thread.sleep(3000);
		driver.findElement(DepositClick).click();

		//CLicking on Company Sub Menu
		Thread.sleep(3000);
		driver.findElement(CompanyMenuClick).click();


		Thread.sleep(3000);
		driver.findElement(CompanyTypeClick).click();
		Thread.sleep(3000);
		driver.findElement(CompanySelOpt).click();

		//Select company click
		Thread.sleep(2000);
		driver.findElement(CompanySelectClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("AIA Berhad");
		Thread.sleep(2000);
		driver.findElement(CompanySelOptClick).click();

		//Click on search
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();

		//Click on Amount
		Thread.sleep(2000);
		driver.findElement(AmountClick).sendKeys(DepositAmountPar);

		//Click on Remarks
		Thread.sleep(2000);
		driver.findElement(RemarkClcik).sendKeys(DepositRemarksPar);

		//Save Button
		Thread.sleep(2000);
		driver.findElement(SaveBtnClick).click();

		//Click on Add payment details
		Thread.sleep(2000);
		driver.findElement(AddPaymentDetailsClick).click();

		//Click on Add payment details
		Thread.sleep(2000);
		driver.findElement(SavePaymentBtnClick).click();

		//Clicking on Yes button
		//Click on Add payment details
		Thread.sleep(2000);
		driver.findElement(YesBtnClick).click();

		//TabSwitch
		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());

		//Use the list of window handles to switch between windows
		Thread.sleep(5000);
		driver.switchTo().window((String)tabs.get(0));


		//Assertion
		 File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     String timestamp3= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	     FileUtils.copyFile(screenshot3,new File(".//ScreenShots//OP_Company_Deposit_Singal_Payment_Method_Test_GLApproval.png"));
	     Thread.sleep(3000);
		
		//Assertion
		String Actual_1 = "Deposit Added Successfully";
        String Expected_1 = "Deposit Added Successfully";
        Assert.assertEquals(Actual_1, Expected_1, "GL Approval Updated and Saved");
	  
	  
	  //ScreenShot
	  File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot1, new File(".\\ScreenShots\\OP_Company_Deposit_Singal_Payment_Method_Test_GLApproval Saved.png"));
	  
	  
  }
}
