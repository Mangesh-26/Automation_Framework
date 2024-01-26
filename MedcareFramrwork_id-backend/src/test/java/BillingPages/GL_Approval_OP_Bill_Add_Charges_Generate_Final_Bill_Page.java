package BillingPages;

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


public class GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill_Page 
{

	WebDriver driver=null; 
	public GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill_Page(WebDriver driver) 
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
	By PatientMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");

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


	//GL_Approval

	By ADT=By.xpath("//*[@id='mat-menu-panel-11']/div/div/div[1]/div[1]/div[3]/div/img");
	//By ADT=By.xpath("//*[@id=\"mat-menu-panel-1\"]/div/div/div[1]/div[1]/div[3]/div/img");

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
	By MRNDS=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[2]");

	//Bill click
	By BillSubMenuClick=By.xpath("//*[@id='31']");
	//IPD Billing
	By IPDBillClick=By.cssSelector("a[ng-reflect-router-link='bill,opbill']");

	//advanced search
	By AdvancedSearchClick3=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/div[2]/mat-icon");
	//MRN 
	By MRNCLick3=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchButtonClick3=By.cssSelector("button[ng-reflect-message='Search']");


	//service Type
	By AllDropDownSearch3=By.cssSelector("input[aria-label='dropdown search']");
	By ServiceTypeClick3=By.cssSelector("mat-select[ng-reflect-name='serviceType']");
	By ServiceSelOpt3=By.xpath("//span[contains(text(),'Service')]");

	//Service Name
	By ServiceNameClick3=By.cssSelector("input[ng-reflect-name='serviceName']");
	By ServiceNameSelOpt3=By.xpath("//span[contains(text(),'Laparotomy - exploratory')]");

	//Specialty
	By SpecialityClick3=By.cssSelector("mat-select[ng-reflect-name='department']");
	By SpecialitySelOpt3=By.xpath("//span[contains(text(),'Rehabilitation')]");

	//Payer
	By PayerClick3=By.cssSelector("mat-select[ng-reflect-name='payer']");
	By PayerSelOpt3=By.xpath("//span[contains(text(),'Self')]");
	//Add Service Button
	By ServiceButtonClick3=By.cssSelector("button[ng-reflect-message='Add Service']");
	//Save Button
	By SaveButtonClick3=By.cssSelector("button[type='submit']");
	//Yes Button 
	By YesButtonClick3=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	//Final bill Check box
	By FinalBillClick3=By.cssSelector("mat-checkbox[ng-reflect-name='isFinalBill']");
	//Add payment Details button
	By AddPayementClick3=By.cssSelector("mat-icon[ng-reflect-message='Add Payment Details']");

	//Save Payment Details
	By SavePaymentDetailClick3=By.cssSelector("button[data-automation-attribute='button-save-payment-details']");
	//Yes Button
	By ConfirmYesClick3=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	//Billing summary
	By BillingSummaryClick=By.xpath("//*[@id='99907']/span[1]");

	//Billing menu Click
	By BillingMenuClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[2]/a/span[1]");

	By Checkbox=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-gl-approval/app-patient-search/div/div/div/table/tbody/tr[2]/td[1]/div/mat-radio-button/label");

	public void GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill_Page_func(String PrimaryIdNumber12,String QuickExparyDatePar,String QuickFullNamePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar,String PolicyNoPar,String PolicyDatePar,String HolderNamePar,String CustomerNamePar,String GLRefNOPar,String GLDatePar,String ExpiryDatePar,String GLAmountPar,String CoverageAmountPar,String ContactNamePar,String DesignationPar,String ContactNoPar,String GLRemarksPar) throws InterruptedException, IOException 
	{


		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		Date nowdate = new Date();




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
		FileUtils.copyFile(screenshot, new File(".//ScreenShotFailedTestCase//GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill_QuickRegistration.png"));

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
		String PatientMRN_1=PTMRN.getText();


		WebElement ptname=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[5]"));
		String regptname=ptname.getText();

		System.out.println("Patient name"+ptname);

		// GL_APPROVAL



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
		driver.findElement(GLMRN).sendKeys(PatientMRN_1);

		//GLSearchClick
		Thread.sleep(2000);
		driver.findElement(GLSearchClick).click();


		//Checkbox
		Thread.sleep(4000);
		driver.findElement(Checkbox).click();

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
		WebElement toClear_1 = driver.findElement(ExpiryDate);
		toClear_1.sendKeys(Keys.CONTROL + "a");
		toClear_1.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		driver.findElement(ExpiryDate).sendKeys("03/01/2035");




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
		FileUtils.copyFile(screenshot1, new File(".//ScreenShots//GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill.png"));

		//Over the slide bar in Billing menu Screen
		Thread.sleep(4000);
		WebElement overforopdslide22=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide22).build().perform();

		//Billing sub menu click

		Thread.sleep(3000);
		driver.findElement(BillSubMenuClick).click();

		Thread.sleep(3000);
		driver.findElement(IPDBillClick).click();

		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick3).click();

		Thread.sleep(2000);
		driver.findElement(MRNCLick3).sendKeys(PatientMRN_1);

		Thread.sleep(3000);
		driver.findElement(SearchButtonClick3).click();

		//Selecting Service Name
		Thread.sleep(2000);
		driver.findElement(ServiceNameClick3).sendKeys("Laparotomy");
		Thread.sleep(2000);
		driver.findElement(ServiceNameSelOpt3).click();

		//Selecting type of Specialty
		Thread.sleep(2000);
		driver.findElement(SpecialityClick3).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch3).sendKeys("Rehabilitation");
		Thread.sleep(1000);
		driver.findElement(SpecialitySelOpt3).click();

		//Service button click
		Thread.sleep(2000);
		driver.findElement(ServiceButtonClick3).click();

		//Check box  click
		Thread.sleep(2000);
		driver.findElement(FinalBillClick3).click();

		//Save button click
		Thread.sleep(2000);
		driver.findElement(SaveButtonClick3).click();

		//ScreenShot
		File screenshot88 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot88, new File(".//ScreenShots//GL_Approval_OP_Bill_Add_Charges_Generate_Final_Bill_save.png"));

		//Yes Button Click
		Thread.sleep(2000);
		driver.findElement(YesButtonClick3).click();


	}

}
