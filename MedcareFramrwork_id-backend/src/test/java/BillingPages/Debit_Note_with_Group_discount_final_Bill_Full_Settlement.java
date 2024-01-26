package BillingPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import OPDTest.ReadExcelRowWithSelenium;

public class Debit_Note_with_Group_discount_final_Bill_Full_Settlement {

	WebDriver driver=null;

	//----QuickRegistration---//



	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//span[contains(text(),'OPD')]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By RegistrationMenu=By.xpath("//*[@id='2004']");
	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
	//Quick Registration
	By QuickRegistrationClick=By.xpath("//span[contains(text(),'Quick Registration')]");

	//Basic Information
	//for all search same xPath
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//PrimaryID
	By Primaryidclick=By.cssSelector("mat-select[ng-reflect-name='primaryId']");
	By Primaryidselectvalue=By.xpath("//span[contains(text(),' Passport ')]");

	//PrimaryIDnumber
	By PrimaryIDnumberclick=By.cssSelector("input[formcontrolname='primaryNumber']");

	//ExpiryDate
	By Expirydateclick=By.cssSelector("input[formcontrolname='expiryDate']");

	//Title
	By Titleclick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By Titleselectvalue=By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");

	//Name 
	By Nameclick=By.cssSelector("input[formcontrolname='firstName']");

	//Gender
	By Genderclick=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By Genderselectvalue=By.xpath("//span[contains(text(),' FEMALE ')]");

	//DOB
	By DOBclick=By.cssSelector("input[ng-reflect-name='dateOfBirth']");

	//CountryCode
	By CountryCodeclick=By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
	By CountryCodeselectvalue=By.xpath("//span[contains(text(),' +213 ')]");

	//MobielNo
	By Mobilenoclick=By.cssSelector("input[formcontrolname='mobileNumber']");

	//Encounter Details
	//EncounterType
	By EncoujnterTypeclick=By.cssSelector("mat-select[ng-reflect-name='encounterType']");
	By EncounterTypeselectvalue=By.xpath("//span[contains(text(),' New Case ')]");

	//SpecialityField
	By Specialityfieldclick=By.cssSelector("mat-select[ng-reflect-name='department']");
	By Specialityfieldselect=By.xpath("//span[contains(text(),' General Surgery ')]");

	//Doctor
	By Doctorclick=By.cssSelector("mat-select[ng-reflect-name='doctor']");
	By Doctorselect=By.xpath("//span[contains(text(),'Dr. Micheal Tan')]");

	//Clinic
	By Clinicclick=By.cssSelector("mat-select[ng-reflect-name='clinic']");
	By Clinicselect=By.xpath("//span[contains(text(),'Consultation Room 1')]");

	//Counter 
	By Counterclick=By.cssSelector("mat-select[ng-reflect-name='cashCounter']");
	By Counterselect=By.xpath("//span[contains(text(),' REGISTRATION COUNTER 1 ')]");

	//ENcounter Remarks
	By EncounterRemarksclick=By.cssSelector("textarea[formcontrolname='remarks']");

	//Encounter Notes Button
	By EncounterNotesButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Encounter Notes']");

	//Add Notes
	By AddNotesClick=By.cssSelector("input[ng-reflect-name='notes']");

	//Add Remark Button
	By AddRemarkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Remark']");

	//Close Button
	By CloseButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Close']");

	//Referral Details
	//Visit Reason
	By VisitReasonClick=By.cssSelector("mat-select[ng-reflect-name='visittype']");
	By VisitReasonSelOpt=By.xpath("//span[contains(text(),' Consultation & Treatment ')]");

	//ReferralType
	By ReferralTypeClick=By.cssSelector("mat-select[ng-reflect-name='referralType']");
	By ReferralTypeSelOpt=By.xpath("//span[contains(text(),' Emergency Referral ')]");

	//Referral
	By ReferralClick=By.cssSelector("mat-select[ng-reflect-name='referral']");
	By ReferralSelOpt=By.xpath("//span[contains(text(),\"Dato' Dr. Jefri Zain \")]");

	//Patient Category
	By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	By PatientCategorySelOpt=By.xpath("//span[contains(text(),' Senior Citizen ')]");

	//Encounter Notes
	By EncounterNotesClick=By.cssSelector("input[formcontrolname='practiceNotes']");

	//Patient Notes
	By PatientNotes=By.cssSelector("textarea[formcontrolname='reportRemarks']");

	//Referral Remarks
	By ReferralRemarksClick=By.cssSelector("textarea[formcontrolname='referralRemarks']");	

	//Tariff
	By Tariffclick12=By.cssSelector("mat-select[aria-labelledby='mat-select-value-55']");
	By Tariffselect12=By.xpath("//span[contains(text(),'Self Tariff')]");	

	//Add Payer Button
	By AddPayerButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Payer']");

	//Payer Type Click
	By PayerTypeClick=By.xpath("//*[@id='mat-select-value-71']");
	By PayerTypeSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");

	//Payer
	By PayerCLick=By.xpath("//*[@id='mat-select-value-73']"); 
	By PayerSelOpt=By.xpath("//span[contains(text(), 'Allianz Life Insurance Malaysia Berhad (PAYER003)')]");

	//Tariff2
	By Tariff22Click=By.xpath("//*[@id='mat-select-value-75']");
	By Tariff22Selopt=By.xpath("//span[contains(text(),'Insurance Tariff')]");

	//Save 
	By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By Saveconfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");





	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");


	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

	//OPBill
	By OPBill=By.cssSelector("a[id='59986']");

	//SearchClick
	By AdvanceSearch=By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	//MRN
	By MRNsearch=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");

	//SearchClick
	By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");

	//ServiceName
	By ServiceName=By.cssSelector("input[ng-reflect-name='serviceName']");
	By ServiceSelect=By.xpath("//span[contains(text(),'CT Brain')]");


	//AddButton
	By AddButton=By.cssSelector("button[ng-reflect-message='Add Service']");

	//ServiceName2
	By ServiceName2=By.cssSelector("input[ng-reflect-name='serviceName']");
	By ServiceSelect2=By.xpath("//span[contains(text(),'MRI Brain')]");

	//SaveButton
	By SaveButton1=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//Confirm
	By Confirm1=By.cssSelector("mat-icon[ng-reflect-message='Yes']");


	//Add Discount 

	By CheckAllServices= By.cssSelector("mat-checkbox[ng-reflect-id='Check All Services']");
	By discountType= By.name("discountType");
	By Amount=By.xpath("//span[contains(text(),'Amount')]");
	By Discount=By.cssSelector("input[ng-reflect-placeholder='Discount']");
	By discountCategory=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-debit-note/app-opdbill/div[4]/div/div/div[1]/div/div/mat-grid-list[1]/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span");
	By Hospital_Discount = By.xpath("//span[contains(text(),'Hospital Discount')]");
	By Given_By = By.cssSelector("input[ng-reflect-placeholder='Given By']");
	By ApplyDiscount = By.cssSelector("button[ng-reflect-message='Apply Discount']");
	By yes = By.cssSelector("mat-icon[ng-reflect-message='Yes']");


	//FinalBill
	By FinalBill=By.cssSelector("mat-checkbox[ng-reflect-id='Final Bill']");


	//SaveButton
	By SaveButton=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//Confirm
	By Confirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//PaymentAdd
	By PaymentAdd=By.cssSelector("mat-icon[ng-reflect-message='Add Payment Details']");

	//ReceivedFrom
	By ReceivedFrom=By.cssSelector("input[ng-reflect-name='receivedFrom']");

	//IDNo
	By IdentificatioNo=By.cssSelector("input[ng-reflect-name='indentificationNumber']");

	//Remarks 
	By Remarks=By.cssSelector("input[ng-reflect-placeholder='Remark']");

	//Save
	By SaveButton2=By.cssSelector("mat-icon[ng-reflect-message='Save Payment Details']");

	//Confirm2
	By Confirm2=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//CheckIn 
	By CheckIn=By.cssSelector("mat-icon[ng-reflect-message='No']");




	//CReatedMRN
	By CreatedMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");


	//BillSummary 
	By BillingSummary=By.cssSelector("a[ng-reflect-router-link='bill,billing-summary']");

	//BillSearchClick
	By BillSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Collapse']");

	//MRNInput
	By MRNInput=By.cssSelector("input[ng-reflect-name='mrn']");

	//Search
	By BillMRNSearch=By.cssSelector("button[ng-reflect-message='Search']");
	By PartialAmount = By.cssSelector("input[ng-reflect-name='amount']");	
	By Click = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-billing-payment-dialog/div/form/div[2]/div/div[4]/div[1]/span");


	//**********************Credit card*****************//
	By Select_Payment_Type = By.cssSelector("mat-select[id='Payment Type']");
	By Credit_Card=By.xpath("//span[contains(text(),'Credit Card')]");
	By Number = By.cssSelector("input[ng-reflect-placeholder='Number']");
	By Card_Type = By.cssSelector("mat-select[ng-reflect-name='cardType']");
	By MASTER=By.xpath("//span[contains(text(),'MASTER')]");
	By bank =By.cssSelector("mat-select[ng-reflect-name='bank']");
	By selectbank=By.xpath("//span[contains(text(),'Hong Leong Bank')]");
	By approvalCode=By.cssSelector("input[ng-reflect-name='approvalCode']");
	//**********************Cheque*****************//
	By Cheque=By.xpath("//span[contains(text(),'Cheque')]");
	By Cheque_bank =By.cssSelector("mat-select[ng-reflect-name='RHB Bank']");
	By Branch = By.cssSelector("mat-select[ng-reflect-name='branch']");
	By selectBranch=By.xpath("//span[contains(text(),'CIMB Group Holdings')]");
	By CheckDate = By.cssSelector("input[ng-reflect-placeholder='Cheque Date']");
	By BatchNo = By.cssSelector("input[ng-reflect-name='batchNo']");
	//**********************Debit Card*****************//
	By Debit_Card=By.xpath("//span[contains(text(),'Debit Card')]");
	By AMERICAN_EXPRESS=By.xpath("//span[contains(text(),'AMERICAN EXPRESS')]");
	By selectbankfordebit=By.xpath("//span[contains(text(),'AmBank')]");

	By DicAmonut = By.cssSelector("input[ng-reflect-model='5.00']");

	By DebitNotesList = By.cssSelector("div[aria-posinset='2']");


	//*************************GroupDiscount********************//

	By Group_Discount = By.cssSelector("button[data-automation-attribute='button-group-discount']");
	By ClickonServiceGroup = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-group-discount-dialog/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By Clinical_Procedure = By.xpath("//span[contains(text(),'Radiology')]");
	By ServiceSubGroup = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-group-discount-dialog/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By Eye = By.xpath("/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span");
	By Disctype = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-group-discount-dialog/form/div[1]/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By Amonut = By.xpath("//span[contains(text(),'Amount')]");
	By discount = By.cssSelector("input[ng-reflect-name='discount']");
	By DiscountCategory = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-group-discount-dialog/form/div[1]/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By HospitalDiscount = By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[1]/span");
	By Add_Group_Discount = By.cssSelector("button[id='Add Group Discount']");
	By Save_Group_Discount = By.cssSelector("button[id='Save Group Discount']");

	By Discount_Details = By.xpath("//h6[contains(text(),'Discount Details')]");




	public Debit_Note_with_Group_discount_final_Bill_Full_Settlement (WebDriver driver)

	{
		this.driver=driver;

	}


	public void Debit_Note_with_Group_discount_final_Bill_Full_Settlementfunc(String QuickPrimaryIdNumberPar,String QuickExparyDatePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar,String ServiceNamePar,String ServiceName2Par,String ReceivedFromPar,String IdentificationNoPar,String RemarksPar) throws InterruptedException, IOException, AWTException 

	{

		// Create object and take the data from another class
		ReadExcelRowWithSelenium  data = new ReadExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);

		//---QuickRegistration---//

		//Clicking on menu Icon
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		//Thread.sleep(2000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();

		//Thread.sleep(2000);
		Thread.sleep(4000);
		driver.findElement(OPDMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		Thread.sleep(5000);
		driver.findElement(RegistrationMenu).click();
		Thread.sleep(5000);
		driver.findElement(QuickRegistrationClick).click();

		//Condition1
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Basic Information")) 
		{
			System.out.println("Quick Registration page has been launched successfully"); 
		} else 
		{
			System.out.println("Quick Registration page failed"); 
		}


		Thread.sleep(1000);

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//ScreenShots//Debit_Note_with_Group_discount_final_Bill_Full_Settlement_QuickRegisterationForm.png")); 


		//Adding Basic Information
		//Primary Identification

		Thread.sleep(2000);  
		driver.findElement(Primaryidclick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Passport");
		Thread.sleep(500);
		driver.findElement(Primaryidselectvalue).click();

		//Primary Id number
		Thread.sleep(500);
		driver.findElement(PrimaryIDnumberclick).sendKeys(QuickPrimaryIdNumberPar);
		//Expire Date
		Thread.sleep(500);
		driver.findElement(Expirydateclick).sendKeys(QuickExparyDatePar);

		//Title
		Thread.sleep(500);
		driver.findElement(Titleclick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(500);
		driver.findElement(Titleselectvalue).click();
		//Add Full Name
		Thread.sleep(500);
		driver.findElement(Nameclick).sendKeys(EnterPatientName);

		//Clicking on DOB
		Thread.sleep(500);
		driver.findElement(DOBclick).sendKeys(QuickDateOfBirthPar);
		//Country Code
		Thread.sleep(500);
		driver.findElement(CountryCodeclick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("+213");
		Thread.sleep(500);
		driver.findElement(CountryCodeselectvalue).click();
		//Mobile Number
		Thread.sleep(500);
		driver.findElement(Mobilenoclick).sendKeys(QuickMobileNumberPar);
		Thread.sleep(500);
		//Encounter Details
		//Encounter Type
		Thread.sleep(500);
		driver.findElement(EncoujnterTypeclick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("New Case");
		Thread.sleep(500);
		driver.findElement(EncounterTypeselectvalue).click();

		//Select Specialty
		Thread.sleep(500);
		driver.findElement(Specialityfieldclick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("General Surgery");
		Thread.sleep(500);
		driver.findElement(Specialityfieldselect).click();
		//Selecting Doctor
		Thread.sleep(500);
		driver.findElement(Doctorclick).click();
		Thread.sleep(900);
		driver.findElement(AllDropDownSearch).sendKeys("Dr. Micheal Tan");
		Thread.sleep(900);
		driver.findElement(Doctorselect).click();
		//Selecting Clinic
		Thread.sleep(900);
		driver.findElement(Clinicclick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Consultation Room 1");
		Thread.sleep(500);
		driver.findElement(Clinicselect).click();
		//Selecting Counter
		Thread.sleep(500);
		driver.findElement(Counterclick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("REGISTRATION COUNTER 1");
		Thread.sleep(500);
		driver.findElement(Counterselect).click();
		//Encounter Remarks
		Thread.sleep(500);
		driver.findElement(EncounterRemarksclick).sendKeys(QuickEncounterRemarksPar);



		//Referral Details
		//Visit Reason	
		Thread.sleep(500);
		driver.findElement(VisitReasonClick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Consultation & Treatment");
		Thread.sleep(500);
		driver.findElement(VisitReasonSelOpt).click();
		//Referral Type
		Thread.sleep(500);
		driver.findElement(ReferralTypeClick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
		Thread.sleep(500);
		driver.findElement(ReferralTypeSelOpt).click();
		//Referral
		Thread.sleep(500);
		driver.findElement(ReferralClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Dato' Dr. Jefri Zain");
		Thread.sleep(1000);
		driver.findElement(ReferralSelOpt).click();
		//Patient Category
		Thread.sleep(500);
		driver.findElement(PatientCategoryClick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
		Thread.sleep(500);
		driver.findElement(PatientCategorySelOpt).click();
		//Encounter Notes
		Thread.sleep(500);
		driver.findElement(EncounterNotesClick).sendKeys(QuickEncounterNotesPar);
		//Patient Notes
		Thread.sleep(500);
		driver.findElement(PatientNotes).sendKeys(QuickPatientNotesPar);
		//Referral Remarks
		Thread.sleep(500);
		driver.findElement(ReferralRemarksClick).sendKeys(QuickReferralRemarksPar);

		//Scrolling the web page
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Selecting Tariff
		Thread.sleep(500);
		driver.findElement(Tariffclick12).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
		Thread.sleep(500);
		driver.findElement(Tariffselect12).click();


		//Clicking on save button
		Thread.sleep(500);
		driver.findElement(Saveclick).click();

		//Clicking on OK Button
		Thread.sleep(500);
		driver.findElement(Saveconfirm).click();

		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs.get(0));

		Thread.sleep(2000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();

		Thread.sleep(2000);
		driver.findElement(EncounterListClick).click();

		//CreatedMRN
		Thread.sleep(2000);
		WebElement MRNSearch=driver.findElement(CreatedMRN);
		String MRNS=MRNSearch.getText();

		System.out.println("MRN"+MRNS);


		//Condition2
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Open Encounters")) 
		{
			System.out.println("Encounter List Screen Appear"); 
		} else 
		{
			System.out.println("Encounter List Screen Not Appear"); 
		}


		Thread.sleep(1000);

		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File(".//ScreenShots//Debit_Note_with_Group_discount_final_Bill_Full_Settlement_EncounterListScreen.png")); 



		//---OPBill---//


		WebElement mainMenu=driver.findElement(mainmenu);
		act.moveToElement(mainMenu).build().perform();
		act.click(mainMenu).perform();

		//BillIcon
		Thread.sleep(2000);
		driver.findElement(BillingMenu).click();

		//SideMenuBar
		Thread.sleep(3000);
		WebElement SidebarMenu=driver.findElement(SideBar);
		act.moveToElement(SidebarMenu).build().perform();

		//OPCharge
		Thread.sleep(4000);
		driver.findElement(OPBill).click();

		//AdvanceSearch 
		Thread.sleep(3000);
		driver.findElement(AdvanceSearch).click();

		//PatientMRN
		Thread.sleep(2000);
		driver.findElement(MRNsearch).sendKeys(MRNS);

		//Search
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();

		//ServiceName
		Thread.sleep(2000);
		driver.findElement(ServiceName).sendKeys(ServiceNamePar);

		//ServiceSelect
		Thread.sleep(2000);
		driver.findElement(ServiceSelect).click();

		//AddButton 
		Thread.sleep(2000);
		driver.findElement(AddButton).click();

		//ServiceName
		Thread.sleep(2000);
		driver.findElement(ServiceName2).sendKeys(ServiceName2Par);

		//ServiceSelect
		Thread.sleep(2000);
		driver.findElement(ServiceSelect2).click();

		//AddButton 
		Thread.sleep(2000);
		driver.findElement(AddButton).click();

		//OPChargeSave
		Thread.sleep(2000);
		driver.findElement(SaveButton1).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm1).click();



		Thread.sleep(1000);
		File screenshot23 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp223= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(screenshot23, new File(".//ScreenShots//Debit_Note_with_Group_discount_final_Bill_Full_Settlement_ChargesSave.png"));
		Thread.sleep(3000);

		//Condition

		String Actual_1 = "Order updated Successfully";
		String Expected_1 = "Order updated Successfully";
		Assert.assertEquals(Actual_1, Expected_1, "Patient Charges Saved and applied");

		// Add Group Discount

		//	driver.switchTo().frame(1);
		driver.findElement(CheckAllServices).click();

		Thread.sleep(1000);
		driver.findElement(Group_Discount).click();
		Thread.sleep(5000);
		Actions act1 = new Actions(driver);
		WebElement ele1=driver.findElement(Discount_Details);
		act1.moveToElement(ele1).build().perform();
	//	act.click(ele).perform();
		Thread.sleep(8000);
		driver.findElement(ClickonServiceGroup).click();
		Thread.sleep(1000);
		driver.findElement(Clinical_Procedure).click();
		Thread.sleep(1000);
		driver.findElement(ServiceSubGroup).click();
		Thread.sleep(1000);
		driver.findElement(Eye).click();
		Thread.sleep(1000);
		driver.findElement(Disctype).click();
		Thread.sleep(1000);
		driver.findElement(Amonut).click();
		Thread.sleep(1000);
		driver.findElement(discount).sendKeys("1");
		Thread.sleep(1000);
	//	driver.findElement(DiscountCategory).click();
	//	Thread.sleep(1000);
		//driver.findElement(HospitalDiscount).click();
		//Thread.sleep(1000);
		
		File screenshot44 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot44, new File(".//ScreenShots//Debit_Note_with_Group_discount.png")); 

		driver.findElement(Add_Group_Discount).click();
		Thread.sleep(1000);
		driver.findElement(Save_Group_Discount).click();
		
	
		/*
		//Add discount
		Thread.sleep(2000);
		driver.findElement(CheckAllServices).click();
		Thread.sleep(1000);
		driver.findElement(discountType).click();
		Thread.sleep(1000);
		driver.findElement(Amount).click();
		Thread.sleep(1000);
		driver.findElement(Discount).clear();
		Thread.sleep(1000);
		driver.findElement(Discount).sendKeys("1");
		//Thread.sleep(1000);
		driver.findElement(discountCategory).click();
		Thread.sleep(1000);
    	driver.findElement(Hospital_Discount).click();
		Thread.sleep(1000);
		driver.findElement(Given_By).sendKeys("Jonson");
		Thread.sleep(1000);
		driver.findElement(ApplyDiscount).click();
		Thread.sleep(1000);
		//driver.findElement(yes).click();
		//GetDicAmonut
		/*
		Thread.sleep(2000);
		WebElement GetDicAmonut=driver.findElement(DicAmonut);
		String gotDicAmonut=GetDicAmonut.getText();
		String Actual_6 = gotDicAmonut;
		String Expected_6 = gotDicAmonut;
		Assert.assertEquals(Actual_6, Expected_6, "All mandatory details has been filled");

		System.out.println("Print the amount" + gotDicAmonut);
		 */	
		//FinalBill
		Thread.sleep(2000);
		driver.findElement(FinalBill).click();

		//SaveButton
		Thread.sleep(2000);
		driver.findElement(SaveButton1).click();
		
		
		File screenshot90 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot90, new File(".//ScreenShots//Debit_Note_with_Group_discount_saved.png")); 
		
		Thread.sleep(4000);
		String Actual_5="Credit Payable amount is exceeding coverage amount";
		String Actual_6="Credit Payable amount is exceeding coverage amount";
		Assert.assertEquals(Actual_5, Actual_6);
		Assert.fail(Actual_6);
		
		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm).click();
		Thread.sleep(2000);
		//AddMultiple Payment Method

		//PaymentAdd
		
		//Thread.sleep(1000);
	//	driver.findElement(PaymentAdd).click();



		Thread.sleep(6000);
		Robot robot = new Robot(); for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); 

		}

		Thread.sleep(4000);
		//File screenshot05 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot05, new File(".//ScreenShots//Debit_Note_with_Grid_discount_Final_Bill_Full_Settlement_01_Debit_Card02_Cheque_03.png"));
		driver.findElement(PaymentAdd).click();
		
		Thread.sleep(4000);
		File screenshot04 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot04, new File(".//ScreenShots//Debit_Note_with_Group_discount__payment_details.png"));

		//ReceivedFrom 
		Thread.sleep(5000);
		driver.findElement(ReceivedFrom).sendKeys(ReceivedFromPar);

		//ID
		Thread.sleep(2000);
		driver.findElement(IdentificatioNo).sendKeys(IdentificationNoPar);
		//Remarks 
		Thread.sleep(2000);
		driver.findElement(Remarks).sendKeys(RemarksPar);

		//Save2
		Thread.sleep(2000);
		driver.findElement(SaveButton2).click();

		Thread.sleep(1000);
		File screenshot24 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp24= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(screenshot24, new File(".//ScreenShots//Debit_Note_with_Group_discount_Final_Bill_Full_payment_detailsFinal_Bill_Full_Settlement.png"));
		Thread.sleep(3000);

		//Condition

		String Actual_2 = "Do you want to proceed?";
		String Expected_2 = "Do you want to proceed?";
		Assert.assertEquals(Actual_2, Expected_2, "Patient Invoice Payement collected");



		//Confirm2
		Thread.sleep(2000);
		driver.findElement(Confirm2).click();



		Thread.sleep(5000);
		String windowHandle2 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs2.get(0));

		Thread.sleep(2000);
		WebElement HoverSideBar1=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar1).build().perform();
		/*
		//CheckIn
		Thread.sleep(3000);
		driver.findElement(CheckIn).click();

		Thread.sleep(2000);
		WebElement HoverSideBar=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar).build().perform();
		 */

		//BillingSummary 
		Thread.sleep(3000);
		driver.findElement(BillingSummary).click();

		//BillSearchClick
		Thread.sleep(3000);
		driver.findElement(BillSearchClick).click();

		//MRNINPUT 
		Thread.sleep(3000);
		driver.findElement(MRNInput).sendKeys(MRNS);

		//Search
		Thread.sleep(3000);
		driver.findElement(BillMRNSearch).click();
		Thread.sleep(1000);
		driver.findElement(DebitNotesList).click();


		//Condition3
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Collection Summary")) 
		{
			System.out.println("Billing Summary Screen Appear"); 
		} else 
		{
			System.out.println("Billing Summary Screen Not Appear"); 
		}


		Thread.sleep(1000);

		File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot3, new File(".//ScreenShots//Debit_Note_with_Group_discount_finall_full_bill_setellement_Summary_Page.png")); 


	}
}
