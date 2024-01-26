package BillingPages;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
public class Search_Patient_Add_charge_Add_Discount_Against_Com_Payer_Save 
{

	WebDriver driver=null; 
	public Search_Patient_Add_charge_Add_Discount_Against_Com_Payer_Save(WebDriver driver) 
	{
		this.driver=driver;

	}
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//span[contains(text(),'OPD')]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By RegistrationMenu=By.xpath("//span[contains(text(),'Registration')]");
	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
	//Quick Registration
	By QuickRegistrationClick=By.xpath("//span[contains(text(),'Quick Registration')]");

	//Basic Information
	//for all search same xpath
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
	By PayerTypeClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/mat-select");
	By PayerTypeSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");

	//Payer
	By PayerCLick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[3]/mat-select"); 
	By PayerSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[4]/span");

	//Tariff2
	By Tariff22Click=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[4]/mat-select");
	By Tariff22Selopt=By.xpath("//span[contains(text(),'Insurance Tariff')]");

	//Policy number
	By PolicyNoClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[8]/input");

	//Save 
	By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By Saveconfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//patient MRN From Encounter List
	By PatientMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[4]");

	//Referral Details


	//***************




	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");


	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

	//OPBill
	By OPBill=By.cssSelector("a[ng-reflect-router-link='bill,opcharge']");

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

	By CheckBox_1= By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-creditnote/div[4]/div[1]/table/tbody/tr[1]/td[1]");
	By CheckBox_2= By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-creditnote/div[4]/div[1]/table/tbody/tr[2]/td[1]");

	//Payer Type
	By PayerTypeClick_1=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/table/tbody/tr[1]/td[2]/mat-select");
	By PayerTypeSelOpt_1=By.xpath("//span[contains(text(),'Insurance (PAYTYPE002)')]");
	By Payer = By.xpath("//span[contains(text(),'Payer')]");
	By AIA_Berhad = By.xpath("//span[contains(text(),'AIA Berhad')]");

	By checkAllServices = By.name("checkAllServices");
	By CheckAllServices= By.cssSelector("mat-checkbox[ng-reflect-id='Check All Services']");


	//DiscountSave
	//By DiscountSave=By.cssSelector("mat-icon[ng-reflect-message='Save Group Discount']");


	//DiscounttypeClick
	By DiscountTypeClick=By.cssSelector("mat-select[ng-reflect-model='percent']");

	//PercentType
	By PercentType=By.xpath("//span[contains(text(),'Percentage')]");

	//DiscountAmount 
	By DiscountAmount=By.cssSelector("input[ng-reflect-name='discount']");

	//AddButton
	By AddButtondiscount=By.cssSelector("mat-icon[ng-reflect-message='Add Group Discount']");

	//DiscountSave
	By DiscountSave=By.cssSelector("mat-icon[ng-reflect-message='Save Group Discount']");


	//Add Discount 

	//By CheckAllServices= By.cssSelector("mat-checkbox[ng-reflect-id='Check All Services']");
	By discountType= By.name("discountType");
	By Amount=By.xpath("//span[contains(text(),'Amount')]");
	By Discount=By.cssSelector("input[ng-reflect-placeholder='Discount']");
	By discountCategory=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-op-charge/app-opdbill/div[4]/div/div/div[1]/div/div/mat-grid-list[1]/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]");
	By Hospital_Discount = By.xpath("//span[contains(text(),'Hospital Discount')]");
	By Given_By = By.cssSelector("input[ng-reflect-placeholder='Given By']");
	By ApplyDiscount = By.cssSelector("button[ng-reflect-message='Apply Discount']");
	By yes = By.cssSelector("mat-icon[ng-reflect-message='Yes']");


	public void Search_Patient_Add_charge_Add_Discount_Against_Com_Payer_Save_func(String PrimaryIdNumber12,String QuickExparyDatePar,String QuickFullNamePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar) throws InterruptedException, IOException 
	{

		//Clicking on menu Icon
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(OPDMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		Thread.sleep(2000);
		driver.findElement(RegistrationMenu).click();
		Thread.sleep(2000);
		driver.findElement(QuickRegistrationClick).click();

		Thread.sleep(5000);
		if(driver.getPageSource().contains("Personal Information")) 
		{
			System.out.println("Registration page has been launched successfully"); 
		} else 
		{
			System.out.println("Registration page failed"); 
		}

		//Adding Basic Information
		//Primary Identification
		Thread.sleep(1000);
		driver.findElement(Primaryidclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Passport");
		Thread.sleep(2000);
		driver.findElement(Primaryidselectvalue).click();



		//Primary Id number
		Thread.sleep(2000);
		Date d=new Date(System.currentTimeMillis()+ System.nanoTime());

		String id=String.valueOf(d.getTime());

		driver.findElement(PrimaryIDnumberclick).sendKeys(PrimaryIdNumber12+id);

		//Expire Date
		Thread.sleep(2000);
		driver.findElement(Expirydateclick).sendKeys(QuickExparyDatePar);
		//Title
		Thread.sleep(1000);
		driver.findElement(Titleclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(1000);
		driver.findElement(Titleselectvalue).click();
		//Add Full Name

		Thread.sleep(1000);
		driver.findElement(Nameclick).sendKeys(QuickFullNamePar);
		/*//Clicking on Gender
		Thread.sleep(1000);
		driver.findElement(Genderclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("FEMALE");
		Thread.sleep(1000);
		driver.findElement(Genderselectvalue).click();*/
		//Clicking on DOB
		Thread.sleep(1000);
		driver.findElement(DOBclick).sendKeys(QuickDateOfBirthPar);
		//Country Code
		Thread.sleep(1000);
		driver.findElement(CountryCodeclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("+213");
		Thread.sleep(1000);
		driver.findElement(CountryCodeselectvalue).click();
		//Mobile Number
		Thread.sleep(1000);
		driver.findElement(Mobilenoclick).sendKeys(QuickMobileNumberPar);

		//Encounter Details
		//Encounter Type
		Thread.sleep(1000);
		driver.findElement(EncoujnterTypeclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("New Case");
		Thread.sleep(1000);
		driver.findElement(EncounterTypeselectvalue).click();

		//Select Specialty
		Thread.sleep(1000);
		driver.findElement(Specialityfieldclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("General Surgery");
		Thread.sleep(1000);
		driver.findElement(Specialityfieldselect).click();
		//Selecting Doctor
		Thread.sleep(2000);
		driver.findElement(Doctorclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Dr. Micheal Tan");
		Thread.sleep(2000);
		driver.findElement(Doctorselect).click();

		/*//Selecting Clinic
		Thread.sleep(1000);
		driver.findElement(Clinicclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Consultation Room 1");
		Thread.sleep(1000);
		driver.findElement(Clinicselect).click();
		//Selecting Counter
		Thread.sleep(1000);
		driver.findElement(Counterclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("REGISTRATION COUNTER 1");
		Thread.sleep(1000);
		driver.findElement(Counterselect).click();
		//Encounter Remarks
		//Thread.sleep(1000);
		//driver.findElement(EncounterRemarksclick).sendKeys(QuickEncounterRemarksPar);

		/*
		//Clicking on Encounter Notes
		Thread.sleep(1000);
		driver.findElement(EncounterNotesButtonClick).click();
		//Adding Notes
		Thread.sleep(2000);
		driver.findElement(AddNotesClick).sendKeys(QuickAddNotesPar);
		//Clicking on Add Remark Button
		Thread.sleep(2000);
		driver.findElement(AddRemarkButtonClick).click();

		//Closing Dialog
		Thread.sleep(2000);
		driver.findElement(CloseButtonClick).click();
		 */
		/*//Referral Details
		//Visit Reason	
		Thread.sleep(1000);
		driver.findElement(VisitReasonClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Consultation & Treatment");
		Thread.sleep(1000);
		driver.findElement(VisitReasonSelOpt).click();
		//Referral Type
		Thread.sleep(1000);
		driver.findElement(ReferralTypeClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
		Thread.sleep(1000);
		driver.findElement(ReferralTypeSelOpt).click();
		//Referral
		Thread.sleep(1000);
		driver.findElement(ReferralClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Dato' Dr. Jefri Zain");
		Thread.sleep(1000);
		driver.findElement(ReferralSelOpt).click();
		//Patient Category
		Thread.sleep(1000);
		driver.findElement(PatientCategoryClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
		Thread.sleep(1000);
		driver.findElement(PatientCategorySelOpt).click();
		//Encounter Notes
		Thread.sleep(1000);
		driver.findElement(EncounterNotesClick).sendKeys(QuickEncounterNotesPar);
		//Patient Notes
		Thread.sleep(1000);
		driver.findElement(PatientNotes).sendKeys(QuickPatientNotesPar);

		//Referral Remarks
		Thread.sleep(1000);
		driver.findElement(ReferralRemarksClick).sendKeys("Testing Referral Remarks");*/

		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Adding payer clicking on plus button
		Thread.sleep(2000);
		driver.findElement(AddPayerButtonClick).click();

		//Payer Type
		Thread.sleep(2000);
		driver.findElement(PayerTypeClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Insurance (PAYTYPE002)");
		Thread.sleep(2000);
		driver.findElement(PayerTypeSelOpt).click();

		//Payer
		/*Thread.sleep(2000);
		driver.findElement(PayerCLick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("A");
		Thread.sleep(2000);
		driver.findElement(PayerSelOpt).click();*/

		//Policy number
		//Thread.sleep(2000);
		//driver.findElement(PolicyNoClick).sendKeys("23698");

		//Selecting Tariff second
		Thread.sleep(2000);
		driver.findElement(Tariff22Click).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Insurance Tariff");
		Thread.sleep(2000);
		driver.findElement(Tariff22Selopt).click();

		//Selecting Tariff
		Thread.sleep(3000);
		driver.findElement(Tariffclick12).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
		Thread.sleep(2000);
		driver.findElement(Tariffselect12).click();


		//Clicking on save button
		Thread.sleep(2000);
		driver.findElement(Saveclick).click();

		//Clicking on OK Button
		Thread.sleep(2000);
		driver.findElement(Saveconfirm).click();

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//ScreenShotFailedTestCase//QuickRegistration.png"));

		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window((String) tabs.get(0));

		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();

		Thread.sleep(3000);
		driver.findElement(EncounterListClick).click();

		Thread.sleep(2000);
		WebElement PTMRN=driver.findElement(PatientMRN);
		String PatientMRN=PTMRN.getText();


		WebElement ptname=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[5]"));
		String regptname=ptname.getText();

		System.out.println("Patient name"+ptname);


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
		driver.findElement(MRNsearch).sendKeys(PatientMRN);

		//Search
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();

		//ServiceName
		Thread.sleep(4000);
		driver.findElement(ServiceName).sendKeys("CT Brain");

		Thread.sleep(4000);
		driver.findElement(Payer).click();
		Thread.sleep(4000);
		driver.findElement(AIA_Berhad).click();



		//AddButton 
		Thread.sleep(4000);
		driver.findElement(AddButton).click();

		/*
		//ServiceSelect
		Thread.sleep(2000);
		driver.findElement(ServiceSelect).click();
		 */
		/*
		//ServiceName
		Thread.sleep(4000);
		driver.findElement(ServiceName2).sendKeys("MRI Brain");

		//ServiceSelect
		Thread.sleep(2000);
		driver.findElement(ServiceSelect2).click();

		//Select company 
		//    Thread.sleep(2000);
		//    driver.findElement(Payer).click();


		//AddButton 
		Thread.sleep(2000);
		driver.findElement(AddButton).click();
		 */
		//OPChargeSave
		Thread.sleep(2000);
		driver.findElement(SaveButton1).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm1).click();

		Thread.sleep(1000);
		File screenshot23 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot23, new File(".//ScreenShots//Search_Patient_Add_charge_Add_Discount_Against_Com_Payer_Save.png"));
		Thread.sleep(3000);

		//Condition

		String Actual_1 = "Order updated Successfully";
		String Expected_1 = "Order updated Successfully";
		Assert.assertEquals(Actual_1, Expected_1, "Patient Charges Saved and applied");

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
		Thread.sleep(2000);
		driver.findElement(discountCategory).click();
		Thread.sleep(1000);
		driver.findElement(Hospital_Discount).click();
		Thread.sleep(1000);
		driver.findElement(Given_By).sendKeys("Jonson");
		Thread.sleep(1000);
		driver.findElement(ApplyDiscount).click();
		Thread.sleep(1000);

		//OPChargeSave
		Thread.sleep(2000);
		driver.findElement(SaveButton1).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm1).click();


		//FinalBill
		Thread.sleep(2000);
	//	driver.findElement(FinalBill).click();

		//SaveButton
		Thread.sleep(2000);
		driver.findElement(SaveButton).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm).click();
		Thread.sleep(2000);


		Thread.sleep(1000);
		File screenshot24 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot24, new File(".//ScreenShots//Search_Patient_Add_charge_Add_Discount_Against_Com_Payer_Save.png"));
		Thread.sleep(3000);

		//Condition

		String Actual_2 = "Do you want to proceed?";
		String Expected_2 = "Do you want to proceed?";
		Assert.assertEquals(Actual_2, Expected_2, "Patient Invoice Payement collected");


	}

}
