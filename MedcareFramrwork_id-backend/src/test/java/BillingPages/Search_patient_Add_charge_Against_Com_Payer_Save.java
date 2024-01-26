package BillingPages;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Search_patient_Add_charge_Against_Com_Payer_Save 
{
	WebDriver driver=null;
	//Encounter details
	//Encounter Tab
	By EncounterList=By.xpath("//span[contains(text(),'Encounter List')]");
	By EncounterTab=By.xpath("//*[@id=\"mat-tab-label-3-0\"]");

	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//Encounter Type
	By EncounterTypeClick=By.cssSelector("mat-select[ng-reflect-name='encounterType']");
	By EncounterTypeSelOpt=By.xpath("//span[contains(text(),'New Case')]");

	//Specialty
	By SpecialityClick=By.cssSelector("mat-select[ng-reflect-name='department']");
	By SpecilitySelOPt=By.xpath("//span[contains(text(),'General Surgery')]");

	//Doctor
	By DoctorClick=By.cssSelector("mat-select[ng-reflect-name='doctor']");
	By DoctorSelOpt=By.xpath("//span[contains(text(),'Dr. Micheal Tan')]");

	//Clinic
	By ClinicClick=By.cssSelector("mat-select[ng-reflect-name='clinic']");
	By ClinicSelOpt=By.xpath("//span[contains(text(),'Consultation Room 1')]");

	//Counter
	By CounterClick=By.cssSelector("mat-select[ng-reflect-name='cashCounter']");
	By CounterSelOpt=By.xpath("//span[contains(text(),'REGISTRATION COUNTER 1')]");

	//Encounter Remarks
	By EncounterRemarks=By.cssSelector("textarea[formcontrolname='remarks']");

	//Encounter Notes
	By EncounterNotes=By.cssSelector("mat-icon[ng-reflect-message='Encounter Notes']");

	//Add Notes
	By AddNotes=By.cssSelector("input[ng-reflect-placeholder='Add Notes']");

	//Add Remark Button
	By AddRemarkButton=By.cssSelector("mat-icon[ng-reflect-message='Add Remark']");

	//Close Button
	By CloseButton=By.cssSelector("mat-icon[ng-reflect-message='Close']");

	//Referral Details

	//VisitReason
	By VisitReasonClick=By.cssSelector("mat-select[ng-reflect-name='visittype']");
	By VisitReasonSelOpt=By.xpath("//span[contains(text(),'Consultation & Treatment')]");

	//Patient Category
	By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	By PatientCategorySelOpt=By.xpath("//span[contains(text(),'Senior Citizen')]");

	//Referral Type
	By ReferralTypeClick=By.cssSelector("mat-select[ng-reflect-name='referralType']");
	By ReferralTypeSelOpt=By.xpath("//span[contains(text(),'Emergency Referral')]");

	//Referral
	By ReferralClick=By.cssSelector("mat-select[ng-reflect-name='referral']");
	By ReferralSelOpt=By.xpath("//span[contains(text(),\"Dato' Dr. Jefri Zain \")]");

	//Patient Notes
	By PatientNotes12=By.cssSelector("textarea[ng-reflect-name='reportRemarks']");

	//Referral Remarks
	By ReferralRemarks12=By.cssSelector("textarea[ng-reflect-name='referralRemarks']");

	//Adding new payer Details

	By addPayerButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Payer']");

	//Payer Type
	By PayerTypeClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/table/tbody/tr[1]/td[2]/mat-select");
	By PayerTypeSelOpt=By.xpath("//span[contains(text(),'Insurance (PAYTYPE002)')]");

	//Payer
	By PayerClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/table/tbody/tr[1]/td[3]/mat-select");
	By PayerSelOpt=By.xpath("//span[contains(text(),'AIA Berhad (PAYER002)')]");

	//TariffInsurance2
	By TariffInsuranceClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/table/tbody/tr[1]/td[4]/mat-select");
	By TariffInsuranceSelOpt=By.xpath("//span[contains(text(),'Insurance Tariff')]");

	//selecting Tariff
	By TariffClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/table/tbody/tr[2]/td[4]/mat-select");
	By TariffSelOpt=By.xpath("//span[contains(text(),'Self Tariff')]");

	//Contract
	By ContractClick=By.cssSelector("mat-select[data-automation-attribute='encounterContract1']");
	By ContractSelOpt=By.xpath("//span[contains(text(),'Allianz Life Insurance Contract')]");

	//Policy Number
	By PolicyNumber=By.cssSelector("input[data-automation-attribute='encounterPolicyNumber0']");


	//Tab 2 Next Of Kin
	By NextKinTabClick=By.cssSelector("div[aria-controls='mat-tab-content-3-1']");

	//Next Of kin Details
	//Titles
	By TitleClick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By TitleSelOpt=By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");

	//Name
	By NameClick=By.cssSelector("input[formcontrolname='name']");

	//Identification Type
	By IdentificationTypeClick=By.cssSelector("mat-select[ng-reflect-name='identificationType']");
	By IdentificationTypeSelOpt=By.xpath("//span[contains(text(),'Passport')]");

	//Identification Number
	By IdNumber=By.cssSelector("input[formcontrolname='identificationNumber']");

	//Relation
	By RelationClick=By.cssSelector("mat-select[ng-reflect-name='relation']");
	By RelationSelOpt=By.xpath("//span[contains(text(),'Mother')]");

	//Phone Number
	By PhoneNumber=By.cssSelector("input[formcontrolname='phoneNumber']");

	//Address Details
	//Address
	By AddressNClick=By.cssSelector("input[formcontrolname='address']");

	//Selecting Country
	By CountryNClick=By.cssSelector("mat-select[ng-reflect-name='country']");
	By CountryNSelOpt=By.xpath("//span[contains(text(),'Malaysia')]");

	//State
	By StateNClick=By.cssSelector("mat-select[ng-reflect-name='state']");
	By StateNSelOpt=By.xpath("//span[contains(text(),' Pulau Pinang ')]");

	//City
	By CityNClick=By.cssSelector("mat-select[ng-reflect-name='city']");
	By CityNSelOpt=By.xpath("//span[contains(text(),' Bukit Mertajam ')]");

	//Area
	By AreaNClick=By.cssSelector("mat-select[ng-reflect-name='district']");
	By AreaNSelOpt=By.xpath("//span[contains(text(),'None')]");

	//Postcode
	By PostCodeNClick=By.cssSelector("input[formcontrolname='postcode']");

	//Referral Button
	By ReferralNButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Referral']");

	//Save Button
	By SaveBUttonClick=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//Ok Button
	By OkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//Tab 3  Document   
	//Click on Document Tab
	By DocumentTabClick=By.cssSelector("div[aria-controls='mat-tab-content-3-2']");

	//Click on Upload button
	By UploadButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Upload Document']");

	//Click on Choose File Button
	By ChooseFIleClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-uploadfile/div/div[2]/table/tr/td/input");
	//Upload
	By UploadClick1=By.cssSelector("mat-icon[ng-reflect-message='Upload']");
	//******************

	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//span[contains(text(),'OPD')]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By RegistrationMenu=By.xpath("//*[@id='2004']");
	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
	//Quick Registration
	By QuickRegistrationClick=By.xpath("//span[contains(text(),'Quick Registration')]");

	//Basic Information
	//for all search same xPath
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

	//ReferralType
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



	//Payer
	By PayerCLick=By.xpath("//*[@id='mat-select-value-73']"); 

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
	By OPBill=By.cssSelector("a[ng-reflect-router-link='bill,opbill']");

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

	By checkAllServices = By.name("checkAllServices");

	By CheckAllServices= By.cssSelector("mat-checkbox[ng-reflect-id='Check All Services']");

	public void Search_patient_Add_charge_Against_Com_Payer_Savefunc(String EncounterRemarksPar,String AddNotesPar,String NamePar,String IdentificationNOPar,String PhoneNoPar,String AddressPar,String PostcodeParAdetailsPar) throws InterruptedException, IOException, AWTException 
	{
		//Encounter details
		//Selecting Encounter tab
		Thread.sleep(3000);
		if(driver.getPageSource().contains("Payer Details")) 
		{
			System.out.println("Enconter Details page has been launched successfully"); 
		} else 
		{
			System.out.println("Encounter Details page failed to open"); 
		}
		Thread.sleep(2000);
		driver.findElement(EncounterTab).click();
		//Selecting Encounter Type
		Thread.sleep(1000);
		driver.findElement(EncounterTypeClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("New Case");
		Thread.sleep(1000);
		driver.findElement(EncounterTypeSelOpt).click();

		//Selecting Specialty
		Thread.sleep(1000);
		driver.findElement(SpecialityClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("General Surgery");
		Thread.sleep(1000);
		driver.findElement(SpecilitySelOPt).click();

		//Selecting Doctor
		Thread.sleep(1000);
		driver.findElement(DoctorClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Dr. Micheal Tan");
		Thread.sleep(1000);
		driver.findElement(DoctorSelOpt).click();
		//Clinic
		Thread.sleep(1000);
		driver.findElement(ClinicClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Consultation Room 1");
		Thread.sleep(1000);
		driver.findElement(ClinicSelOpt).click();
		//Selecting Counter
		Thread.sleep(1000);
		driver.findElement(CounterClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("REGISTRATION COUNTER 1");
		Thread.sleep(1000);
		driver.findElement(CounterSelOpt).click();
		//Encounter Remarks
		Thread.sleep(1000);
		driver.findElement(EncounterRemarks).sendKeys(EncounterRemarksPar);

		//Referral Details
		//Visit Reason
		Thread.sleep(1000);
		driver.findElement(VisitReasonClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Consultation & Treatment");
		Thread.sleep(1000);
		driver.findElement(VisitReasonSelOpt).click();

		//Referral type
		Thread.sleep(1000);
		driver.findElement(ReferralTypeClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
		Thread.sleep(1000);
		driver.findElement(ReferralTypeSelOpt).click();

		//Scrolling Encounter web page
		Thread.sleep(2000);
		Actions actions1 = new Actions(driver);
		actions1.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform(); 

		//Adding new Payer

		//Clicking on New payer button
		Thread.sleep(2000);
		driver.findElement(addPayerButtonClick).click();

		//Clicking on Payer Type
		Thread.sleep(2000);
		driver.findElement(PayerTypeClick).click();
		Thread.sleep(3000);
		driver.findElement(AllDropDownSearch).sendKeys("Insurance(PAYTYPE002)");
		Thread.sleep(2000);
		driver.findElement(PayerTypeSelOpt).click();	

		//Payer
		Thread.sleep(2000);
		driver.findElement(PayerClick).click();
		//Thread.sleep(3000);
		//driver.findElement(AllDropDownSearch).sendKeys("AIA Berhad (PAYER002)");
		Thread.sleep(2000);
		driver.findElement(PayerSelOpt).click();

		//Insurance Tariff2
		Thread.sleep(2000);
		driver.findElement(TariffInsuranceClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Insurance Tariff");
		Thread.sleep(2000);
		driver.findElement(TariffInsuranceSelOpt).click();

		//COntract
		Thread.sleep(2000);
		driver.findElement(ContractClick).click();
		Thread.sleep(3000);
		driver.findElement(AllDropDownSearch).sendKeys("Allianz Life Insurance Contract");
		Thread.sleep(2000);
		driver.findElement(ContractSelOpt).click();

		//Policy Number
		Thread.sleep(2000);
		driver.findElement(PolicyNumber).sendKeys("653241");

		//selecting Tariff	 
		Thread.sleep(2000);
		driver.findElement(TariffClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
		Thread.sleep(2000);
		driver.findElement(TariffSelOpt).click();

		//Adding new Payer
/*
		//Tab 2 Next Of Kin
		//Clicking on Tab
		Thread.sleep(2000);
		driver.findElement(NextKinTabClick).click();

		//Next Of Kin details
		//Titles
		Thread.sleep(1000);
		driver.findElement(TitleClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(1000);
		driver.findElement(TitleSelOpt).click();
		//Name
		Thread.sleep(1000);
		driver.findElement(NameClick).sendKeys(NamePar);
		//Identification Type
		Thread.sleep(1000);
		driver.findElement(IdentificationTypeClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Passport");
		Thread.sleep(1000);
		driver.findElement(IdentificationTypeSelOpt).click();
		//Identification Number
		Thread.sleep(1000);
		driver.findElement(IdNumber).sendKeys(IdentificationNOPar);

		//Phone Number
		Thread.sleep(1000);
		driver.findElement(PhoneNumber).sendKeys(PhoneNoPar);
		//Address Details
		//Address
		Thread.sleep(1000);
		driver.findElement(AddressNClick).sendKeys(AddressPar);	
		//Country
		Thread.sleep(1000);
		driver.findElement(CountryNClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Malaysia");
		Thread.sleep(1000);
		driver.findElement(CountryNSelOpt).click();


		//Area
		Thread.sleep(1000);
		driver.findElement(AreaNClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("None");
		Thread.sleep(1000);
		driver.findElement(AreaNSelOpt).click();

		//Post code
		Thread.sleep(1000);
		driver.findElement(PostCodeNClick).sendKeys(PostcodeParAdetailsPar);
		//Click on Add referral Button
		Thread.sleep(1000);
		driver.findElement(ReferralNButtonClick).click();
*/
		//Click on Save Button
		Thread.sleep(2000);
		driver.findElement(SaveBUttonClick).click();

		//Click on Ok Button
		Thread.sleep(3000);
		driver.findElement(OkButtonClick).click();

		//Switching On Main Window
		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles
		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		//Use the list of window handles to switch between windows
		Thread.sleep(1000);
		driver.switchTo().window((String)tabs.get(0));

		Actions act=new Actions(driver);
		WebElement overforopdslide2=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside"));
		act.moveToElement(overforopdslide2).build().perform();

		//Clicking on Encounter List
		Thread.sleep(3000);
		driver.findElement(EncounterList).click();	




		//CreatedMRN
		Thread.sleep(4000);
		WebElement MRNSearch=driver.findElement(CreatedMRN);
		String MRNS=MRNSearch.getText();

		System.out.println("MRN"+MRNS);

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
		driver.findElement(ServiceName).sendKeys("CT Brain");

		//ServiceSelect
		Thread.sleep(2000);
		driver.findElement(ServiceSelect).click();

		//AddButton 
		Thread.sleep(2000);
		driver.findElement(AddButton).click();


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

		//OPChargeSave
		Thread.sleep(2000);
		driver.findElement(SaveButton1).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm1).click();

		Thread.sleep(1000);
		File screenshot23 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp22= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(screenshot23, new File(".//ScreenShots//Search_patient_Add_charge_Against_Com_Payer_Save_confirm.png"));
		Thread.sleep(3000);

		//Condition

		String Actual_1 = "Order updated Successfully";
		String Expected_1 = "Order updated Successfully";
		Assert.assertEquals(Actual_1, Expected_1, "Patient Charges Saved and applied");

		//Add discount
		Thread.sleep(2000);
		driver.findElement(CheckAllServices).click();

		//FinalBill
		Thread.sleep(2000);
		driver.findElement(FinalBill).click();

		//SaveButton
		Thread.sleep(2000);
		driver.findElement(SaveButton).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm).click();
		Thread.sleep(2000);


		Thread.sleep(1000);
		File screenshot24 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp24= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(screenshot24, new File(".//ScreenShots//Search_patient_Add_charge_Against_Com_Payer_Save.png"));
		Thread.sleep(3000);

		//Condition

		String Actual_2 = "Do you want to proceed?";
		String Expected_2 = "Do you want to proceed?";
		Assert.assertEquals(Actual_2, Expected_2, "Patient Invoice Payement collected");



	}
	public Search_patient_Add_charge_Against_Com_Payer_Save(WebDriver driver)
	{
		this.driver=driver;
	}
}
