package BillingPages_2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GLApproval {

	WebDriver driver;

	//Menu icon 
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADT=By.xpath("//*[@id='mat-menu-panel-16']/div/div/div[1]/div[1]/div[3]/div/img");
	By AdmissionDashboard=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]");
	//clicking on billing menu
	By BillingMenuClik=By.xpath("//span[contains(text(),'Billing')]");
	//SideBar
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");

	//BillingDisappear
	By BillDisappear=By.cssSelector("a[id='31']");

	//GLScreen
	By GLScreen=By.cssSelector("a[id='453']");

	//GLAttachement 
	By GLAttachement=By.cssSelector("a[ng-reflect-router-link='glapproval,glattachment']");

	//Advance
	By GLSearch=By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	//GLMRN
	By GLMRN=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");

	//GLSearchclick
	By GLSearchClick=By.cssSelector("button[ng-reflect-message='Search']");

	//GLEdit 
	By GLEdit=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-gl-approval/div[2]/div/div[1]/table/tbody/tr/td[12]/mat-icon");

	//PolicyNumber
	By PolicyNumber=By.cssSelector("input[ng-reflect-name='policyNumber']");

	//PolicyDate 
	By PolicyDate=By.cssSelector("input[ng-reflect-name='policyDate']");

	//HolderName
	By HolderName=By.cssSelector("input[ng-reflect-name='holderName']");

	//RelationClick
	By RelationClick=By.cssSelector("mat-select[ng-reflect-name='relation']");

	//RelationSelect
	By RelationSelect=By.xpath("//span[contains(text(),'Mother')]");

	//CustomerGroup
	By CustomerGroupclick=By.cssSelector("mat-select[ng-reflect-name='customerGroup']");

	//CustometGroupselect
	By CustomerGroupselect=By.xpath("//span[contains(text(),'CS Group')]");

	//CustometName 
	By CustomerName=By.cssSelector("input[ng-reflect-name='customerName']");

	//Status 
	By Statusclick=By.cssSelector("mat-select[ng-reflect-placeholder='PENDING GL']");

	//StatusSelect
	By StatusSelect=By.xpath("//span[contains(text(),'APPROVED GL')]");

	//GLReferanceNumber
	By GLReferanceNumber=By.cssSelector("input[ng-reflect-name='glReferenceNumber']");

	//GLDate
	By GLDate=By.cssSelector("input[ng-reflect-name='glDate']");
	
	//GlEffective Date
	By GlEffectiveDate=By.cssSelector("input[ng-reflect-name='glEffectiveDate']");

	//ExpiryDate
	By ExpiryDate=By.cssSelector("input[ng-reflect-name='expiryDate']");

	//GLAmount 
	By GLAmount=By.cssSelector("input[ng-reflect-name='glAmount']");

	//CoverageAmount
	By CoverageAmount=By.cssSelector("input[ng-reflect-name='coverageAmount']");

	//ContactInformation 

	//ContactName
	By ContactName=By.cssSelector("input[ng-reflect-name='name']");

	//Designation
	By Designation=By.cssSelector("input[ng-reflect-name='designation']");

	//ContactNumber
	By ContactNumber=By.cssSelector("input[ng-reflect-name='contactNumber']");

	//GLRemarks 
	By GLRemarks=By.cssSelector("input[ng-reflect-name='remark']");

	//GLRemarksAdd
	By GLRemarksAdd=By.cssSelector("mat-icon[ng-reflect-message='Add GL Remarks']");

	//GLSave 
	By GLSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By MRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[2]");

	//IP Charges
	By IPChargesClick=By.xpath("//span[contains(text(),'IP Charges')]");
	//By ADT=By.xpath("//span[contains(text(),'ADT')]");
	//By AdmissionDashboard=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]");

	//advanced search
	By AdvancedSearchClick2=By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	//MRN 
	By MRNCLick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchButtonClick2=By.cssSelector("button[ng-reflect-message='Search']");

	//Taking MRN From dashboard
	By MRNClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[2]");
	//service Type
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");
	By ServiceTypeClick=By.cssSelector("mat-select[ng-reflect-name='serviceType']");
	By ServiceSelOpt=By.xpath("//span[contains(text(),'Service')]");

	//Service Name
	By ServiceNameClick=By.cssSelector("input[ng-reflect-name='serviceName']");
	By ServiceNameSelOpt=By.xpath("//span[contains(text(),'Laparotomy - exploratory')]");

	//Specialty
	By SpecialityClick=By.cssSelector("mat-select[ng-reflect-name='department']");
	By SpecialitySelOpt=By.xpath("//span[contains(text(),'Rehabilitation')]");

	//Payer
	By PayerClick=By.cssSelector("mat-select[ng-reflect-name='payer']");
	By PayerSelOpt=By.xpath("//span[contains(text(),'Self')]");
	//Add Service Button
	By ServiceButtonClick=By.cssSelector("button[ng-reflect-message='Add Service']");
	//Save Button
	By SaveButtonClick=By.cssSelector("button[type='submit']");
	//Yes Button 
	By YesButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	
	//Billing menu Click
	By BillingMenuClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[2]/a/span[1]");
	public GLApproval (WebDriver driver)

	{
		this.driver=driver;

	}
	public void GLStatus(String PolicyNoPar,String PolicyDatePar,String HolderNamePar,String CustomerNamePar,String GLRefNOPar,String GLDatePar,String ExpiryDatePar,String GLAmountPar,String CoverageAmountPar,String ContactNamePar,String DesignationPar,String ContactNoPar,String GLRemarksPar ) throws InterruptedException, IOException 

	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		Date nowdate = new Date();
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(mainmenu);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();

		
		//Thread.sleep(2000);
		
		Thread.sleep(3000);
		driver.findElement(ADT).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide1).build().perform();

		Thread.sleep(3000);
		driver.findElement(AdmissionDashboard).click();
		Thread.sleep(6000);

		WebElement PtMRN=driver.findElement(MRN);
		String PatientMRN=PtMRN.getText();
		System.out.println("MRN"+PatientMRN);

		Thread.sleep(3000);
		Actions act1 = new Actions(driver);
		Thread.sleep(5000);
		WebElement ele3=driver.findElement(mainmenu);
		act1.moveToElement(ele3).build().perform();
		act1.click(ele3).perform();
		
		//BillIcon
		Thread.sleep(4000);
		driver.findElement(BillingMenuClik).click();

		//SideMenuBar
		Thread.sleep(3000);
		WebElement SidebarMenu=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(SidebarMenu).build().perform();


		//BillDisappear
		Thread.sleep(2000);
		driver.findElement(BillDisappear).click();

		//GLSCreen 
		Thread.sleep(2000);
		driver.findElement(GLScreen).click();

		//GLAttachement 
		Thread.sleep(2000);
		driver.findElement(GLAttachement).click();

		//Advance
		Thread.sleep(2000);
		driver.findElement(GLSearch).click();

		//GLMRN
		Thread.sleep(2000);
		driver.findElement(GLMRN).sendKeys(PatientMRN);

		//GLSearchClick
		Thread.sleep(2000);
		driver.findElement(GLSearchClick).click();

		//GLEDIT
		Thread.sleep(2000);
		driver.findElement(GLEdit).click();

		//PolicyNumber
		Thread.sleep(2000);
		driver.findElement(PolicyNumber).sendKeys(PolicyNoPar);

		//PolicyDate 
		Thread.sleep(2000);
		driver.findElement(PolicyDate).sendKeys(PolicyDatePar);

		//HolderName 
		Thread.sleep(2000);
		driver.findElement(HolderName).sendKeys(HolderNamePar);

		//RelationClick 
		Thread.sleep(2000);
		driver.findElement(RelationClick).click();

		//RelationSelect
		Thread.sleep(2000);
		driver.findElement(RelationSelect).click();

		//CustomerGroup
		Thread.sleep(2000);
		driver.findElement(CustomerGroupclick).click();

		//CustomerGroupselect
		Thread.sleep(2000);
		driver.findElement(CustomerGroupselect).click();

		//CustomerName 
		Thread.sleep(2000);
		driver.findElement(CustomerName).sendKeys(CustomerNamePar);

		//Status 
		Thread.sleep(2000);
		driver.findElement(Statusclick).click();
		driver.findElement(StatusSelect).click();

		//GLReferanceNumber
		Thread.sleep(2000);
		driver.findElement(GLReferanceNumber).sendKeys(GLRefNOPar);

		//GLDate
		Thread.sleep(2000);
		driver.findElement(GLDate).sendKeys(dateFormat.format(nowdate));
		
		//GL Effective date
		Thread.sleep(2000);
		WebElement toClear = driver.findElement(GlEffectiveDate);
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		driver.findElement(GlEffectiveDate).sendKeys(dateFormat.format(nowdate));
		
		//ExpiryDate
		Thread.sleep(2000);
		driver.findElement(ExpiryDate).sendKeys(ExpiryDatePar);

		//GLAmount
		Thread.sleep(2000);
		driver.findElement(GLAmount).sendKeys(GLAmountPar);

		//CoverageAmount 
		Thread.sleep(2000);
		driver.findElement(CoverageAmount).sendKeys(CoverageAmountPar);

		//ContactName
		Thread.sleep(2000);
		driver.findElement(ContactName).sendKeys(ContactNamePar);

		//Destination
		Thread.sleep(2000);
		driver.findElement(Designation).sendKeys(DesignationPar);

		//ContactNo
		Thread.sleep(2000);
		driver.findElement(ContactNumber).sendKeys(ContactNoPar);

		//GLRemarks 
		Thread.sleep(2000);
		driver.findElement(GLRemarks).sendKeys(GLRemarksPar);

		//GLRemarksAdd
		Thread.sleep(2000);
		driver.findElement(GLRemarksAdd).click();

		//GLSave
		Thread.sleep(2000);
		driver.findElement(GLSave).click();

		//ScreenShot
		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File(".//ScreenShots//GLApproval.png"));

		//Over the slide bar in Billing menu Screen
		Thread.sleep(4000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide2).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(BillingMenuClick).click();

		Thread.sleep(3000);
		driver.findElement(IPChargesClick).click();

		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick2).click();

		Thread.sleep(2000);
		driver.findElement(MRNCLick).sendKeys(PatientMRN);

		Thread.sleep(3000);
		driver.findElement(SearchButtonClick2).click();

		/*//Selecting type of Service
				Thread.sleep(2000);
				driver.findElement(ServiceTypeClick).click();
				//Thread.sleep(1000);
				//driver.findElement(AllDropDownSearch).sendKeys("Service");
				Thread.sleep(1000);
				driver.findElement(ServiceSelOpt).click();*/

		//Selecting Service Name
		Thread.sleep(2000);
		driver.findElement(ServiceNameClick).sendKeys("Laparotomy");
		Thread.sleep(2000);
		driver.findElement(ServiceNameSelOpt).click();

		//Selecting type of Specialty
		Thread.sleep(2000);
		driver.findElement(SpecialityClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Rehabilitation");
		Thread.sleep(1000);
		driver.findElement(SpecialitySelOpt).click();

		/*//Selecting type of Service
				Thread.sleep(2000);
				driver.findElement(PayerClick).click();
				//Thread.sleep(1000);
				//driver.findElement(AllDropDownSearch).sendKeys("");
				Thread.sleep(1000);
				driver.findElement(PayerSelOpt).click();*/

		//Service button click
		Thread.sleep(2000);
		driver.findElement(ServiceButtonClick).click();

		//Save button click
		Thread.sleep(2000);
		driver.findElement(SaveButtonClick).click();

		//Yes Button Click
		Thread.sleep(2000);
		driver.findElement(YesButtonClick).click();

		/*if (driver.getPageSource().contains("Order update Successfully.")) 
				{
					System.out.println("Order update Successfully");
				}
				else
				{
					File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(screenshot1, new File("C:\\Selenium Eclipse WorkSpace\\Medcare_Hati\\ScreenShot\\FailedIP_Charges_For_Self_Payer.png"+ dateFormat.format(date)));
					Assert.assertTrue(false,"Charegs not saved");
				}*/



	}
}
