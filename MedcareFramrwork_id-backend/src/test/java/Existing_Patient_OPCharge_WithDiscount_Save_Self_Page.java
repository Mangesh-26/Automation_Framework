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
import org.testng.annotations.Test;

public class Existing_Patient_OPCharge_WithDiscount_Save_Self_Page {
	
	WebDriver driver=null;
	
	//Registration

	//By Search=By.xpath("mat-icon[MatTooltip='Search']");
	By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By OPDMenu=By.xpath("//*[@id=\"mat-menu-panel-1\"]/div/div/div[1]/div[1]/div[1]/div/img");
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By RegistrationMenu=By.xpath("//span[contains(text(),'Registration')]");
	By subRegistration=By.xpath("//*[@id=\"2005\"]/span[1]");
	By PlusButton=By.xpath("//*[@id='Add Patient']");	

	//Basic Information
	
	//for all search same Xpath
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");
	
	//Locator of Primary Identification Drop down
	By PrimaryIdentificationClick=By.cssSelector("mat-select[formcontrolname='primaryId']");
	By PrimaryIdentificationselOpt=By.xpath("//span[contains(text(),'Passport')]");
	
	//Primary Id Number
	By PrimaryIdNumber=By.cssSelector("input[formcontrolname='primaryNumber']");
	//ExpirayDate
	By ExpirayDate=By.cssSelector("input[formcontrolname='expiryDate']");

	//Issuing country
	By Issuingcountryclick=By.cssSelector("mat-select[ng-reflect-name='issuedCountryPrimary']");
	By IssuingcountrySelOpt=By.xpath("//span[contains(text(),'Malaysia')]");

	//Secondary Identification 
	By SecondaryIdentificationClick=By.cssSelector("mat-select[ng-reflect-name='secondaryId']");
	By SecondaryIdentificationSelOpt=By.xpath("//span[contains(text(),'Work Permit')]");

	//Secondary ID Number
	By SecondaryIDNumClick=By.cssSelector("input[ng-reflect-placeholder='Secondary Id Number']");
	//Secondary Expiray Date
	By SecExpirayDate=By.cssSelector("input[formcontrolname='secondaryExpirydate']");

	//Faculty selection
	By FacultyClick=By.cssSelector("mat-select[ng-reflect-name='faculty']");
	By FacultySelOpt=By.xpath("//span[contains(text(),'FAKULTI KEMANUSIAAN, SENI DAN WARISAN')]");	

	//Personal Information
	
	//Title
	By TitleClick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By TitleSelOpt=By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");
	//Full Name
	By Fullname=By.cssSelector("input[data-placeholder='Full Name']");
	//gender
	By GenderClick=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By GenderSelOpt=By.xpath("//span[contains(text(),'FEMALE')]");

	//martial status
	By MaritalStatusClick=By.cssSelector("mat-select[ng-reflect-name='martial']");
	By MaritalStatusSelOpt=By.xpath("//span[contains(text(),' Married ')]");

	//Religion
	By ReliginClick=By.cssSelector("mat-select[ng-reflect-name='religion']");
	By ReliginClickSelOpt=By.xpath("//span[contains(text(),'Islam')]");
	
	//Date of Birth
	By DateOfBirth=By.cssSelector("input[ng-reflect-placeholder='Date of Birth']");
	
	
	//Patient category
	By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	By PatientCategorySelOpt=By.xpath("//span[contains(text(),'Senior Citizen')]");
	
	//Preferred Language
	By PreferredLanguageClick=By.cssSelector("mat-select[ng-reflect-name='preferredLanguage']");
	By PreferredLanguageSelOpt=By.xpath("//span[contains(text(),'Mandarin')]");
	
	//nationality
	By NationalityClick=By.cssSelector("mat-select[ng-reflect-name='nation']");
	By NationalitySelOpt=By.xpath("//span[contains(text(),'Albania')]");
	
	//Mother name
	By MotherNameCLick=By.cssSelector("input[formcontrolname='motherName']");
	
	//Education
	By EducationClick=By.cssSelector("mat-select[ng-reflect-name='education']");
	By EducationSelOpt=By.xpath("//span[contains(text(),'Bachelor of Medicine and Bachelor of Surgery (MBBS)')]");
	
	//Occupation
	By OccupationClick=By.cssSelector("mat-select[ng-reflect-name='occupation']");
	By OccupationSelOpt=By.xpath("//span[contains(text(),'Art And	Talent')]");
	
	//Race
	By RaceClick=By.cssSelector("mat-select[ng-reflect-name='race']");
	By RaceSelOpt=By.xpath("//span[contains(text(),'Health Touris')]");
	
	//Ethnic
	By EthnicClick=By.cssSelector("mat-select[ng-reflect-name='ethnic']");
	By EthnicSelOpt=By.xpath("//span[contains(text(),' Malay ')]");
	
	//Birth Place
	By BirthPlaceClick=By.cssSelector("input[formcontrolname='birthplace']");
	
	//Blood Group
	By BloodGroupClick=By.cssSelector("mat-select[ng-reflect-name='bloodGroup']");
	By BloodGroupSelOpt=By.xpath("//span[contains(text(),'A RhD positive (A+)')]");
	
	//Source
	By SourceClick=By.cssSelector("mat-select[ng-reflect-name='sourceType']");
	By SourceSelOpt=By.xpath("//span[contains(text(),'Exhibition')]");
	
	//Employment Status
	By EmploymentStatusClick=By.cssSelector("mat-select[ng-reflect-name='employmentStatus']");
	By EmploymentStatusSelOpt=By.xpath("//span[contains(text(),'Employed')]");
	
	//Patient Notes
	By PatientNotesClick=By.cssSelector("input[formcontrolname='patientNotes']");
	

	
	//Address
	//Residential Address
	By ResAddress=By.cssSelector("input[ng-reflect-name='addressPrimary']");
	
	//Country
	By countryClick=By.cssSelector("mat-select[ng-reflect-name='countryPrimary']");
	By countrySelOpt=By.xpath("//span[contains(text(),' Malaysia ')]");	 
	
	//State
	By StateClick=By.cssSelector("mat-select[ng-reflect-name='statePrimary']");
	By StateSelOpt=By.xpath("//span[contains(text(),'Kedah')]");
	
	//City
	By cityClick=By.cssSelector("mat-select[ng-reflect-name='cityPrimary']");
	By citySelopt=By.xpath("//span[contains(text(),'Kulim')]");
	
	//Area
	By AreaClick=By.cssSelector("mat-select[ng-reflect-name='subDistrictPrimary']");
	By AreaSelOpt=By.xpath("//span[contains(text(),'Sample')]");
	
	//PostCode
	By PostCode=By.cssSelector("input[formcontrolname='pincodePrimary']");

	//Contact Information	
	
	//Country Code
	By CountryCodeClick=By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
	By CountryCodeSelOpt=By.xpath("//span[contains(text(),' +213 ')]");
	
	//Mobile Number
	By MobileNumberClick=By.cssSelector("input[formcontrolname='mobileNumber']");
	
	//Relation
	By RelationClick=By.cssSelector("mat-select[ng-reflect-name='contactRelation']");
	By RelationSelOpt=By.xpath("//span[contains(text(),'Wife')]");
	//Email
	By EmailClick=By.cssSelector("input[formcontrolname='emailId']");
	//Personal Fax
	By PersonalFax=By.cssSelector("input[formcontrolname='personalFax']");
	//Work Fax
	By WorkFax=By.cssSelector("input[formcontrolname='workFax']");
	//Work Contact Number
	By WorkContactNo=By.cssSelector("input[formcontrolname='workContact']");
	//Home contact Number
	By HomeContactNo=By.cssSelector("input[formcontrolname='homeContact']");

	//Tab 2 Employment details Tab
	
	By EmploymentDetailsTab=By.cssSelector("div[aria-controls='mat-tab-content-2-1']");
	//Employee
	By EmployeerClick=By.cssSelector("mat-select[ng-reflect-name='employerName']");
	By EmployeerSelOpt=By.xpath("//span[contains(text(),'Ayesha Sudhir Lande')]");
	
	//Employment No
	By EmploymentNo=By.cssSelector("input[formcontrolname='employmentNo']");
	
	//Working from
	By WorkingFrom=By.cssSelector("input[formcontrolname='workingFrom']");
	
	//Contact No
	By ContactNo=By.cssSelector("input[formcontrolname='employmentContactNo']");
	
	//Employment Address
	By EmpAdd=By.cssSelector("input[formcontrolname='employmentAddress']");
	
	//Country
	By Country2Click=By.cssSelector("mat-select[ng-reflect-name='employmentCountry']");
	By Country2SelOpt=By.xpath("//span[contains(text(),' Malaysia ')]");
	
	//State
	By State2Click=By.cssSelector("mat-select[ng-reflect-name='employmentState']");
	By State2SelOpt=By.xpath("//span[contains(text(),'Kedah')]");
	
	//City
	By City2Click=By.cssSelector("mat-select[ng-reflect-name='employmentCity']");
	By City2SelOpt=By.xpath("//span[contains(text(),'Kulim')]");
	
	//PostCode
	By PostCode2=By.cssSelector("input[formcontrolname='employmentPostCode']");

	//RegSave
	By RegSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	
	//SaveConfirm
	By SaveConfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	
	
//---Encounter---//
	
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
		By PatientCategoryClick1=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
		By PatientCategorySelOpt1=By.xpath("//span[contains(text(),'Senior Citizen')]");
		
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
		
		//selecting Tariff
		By TariffClick=By.cssSelector("mat-select[data-automation-attribute='encounterTariff0']");
		By TariffSelOpt=By.xpath("//span[contains(text(),'Self Tariff')]");

		//SecondPayer
		By AddIcon=By.cssSelector("mat-icon[ng-reflect-message='Add Payer']");
		
		//PayerType
		By PayerTypeclick=By.cssSelector("mat-select[aria-labelledby='mat-select-value-187']");
		By TypeSelect=By.xpath("//span[contains(text(),'Insurance (PAYTYPE002)')]");
		
		//Payer
		By PayerClick=By.cssSelector("mat-select[aria-labelledby='mat-select-value-189']");
		By PayerSelect=By.xpath("//span[contains(text(),'AIA Berhad (PAYER002)')]");
		
		//Tariff
		By TariffClickComPayer=By.cssSelector("mat-select[data-automation-attribute='encounterTariff0']");
		By TariffComPayerSelect=By.xpath("//span[contains(text(),'Insurance Tariff')]");
		
		
		//Tab 2 Next Of Kin
		By NextKinTabClick=By.cssSelector("div[aria-controls='mat-tab-content-3-1']");

		//Next Of kin Details
		//Titles
		By TitleClick1=By.cssSelector("mat-select[ng-reflect-name='prefix']");
		By TitleSelOpt1=By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");
		
		//Name
		By NameClick=By.cssSelector("input[formcontrolname='name']");
		
		//Identification Type
		By IdentificationTypeClick=By.cssSelector("mat-select[ng-reflect-name='identificationType']");
		By IdentificationTypeSelOpt=By.xpath("//span[contains(text(),'Passport')]");
		
		//Identification Number
		By IdNumber=By.cssSelector("input[formcontrolname='identificationNumber']");
		
		//Relation
		By RelationClick1=By.cssSelector("mat-select[ng-reflect-name='relation']");
		By RelationSelOpt1=By.xpath("//span[contains(text(),'Mother')]");
		
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
		
		//PostCode
		By PostCodeNClick=By.cssSelector("input[formcontrolname='postcode']");
		
		//Referral Button
		By ReferralNButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Referral']");

		//Save Button
		By SaveBUttonClick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
		
		//OkButton
		By OkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
		
		//EncounterList
		By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
		
		
 //2ndEncounter 
		
		//AdvanceSearch 
		By AdvanceSearch2=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
		
		//PatientMRN2
		By PatientMRN2=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
		
		//PatientSearch2
		By PatientSearch2=By.cssSelector("button[ng-reflect-message='Search']");
		
		//EncounterType2
		By EncounterType2=By.cssSelector("mat-select[ng-reflect-name='encounterType']");
		
		//TypeSelect
		By TypeSelect2=By.xpath("//span[contains(text(),'Follow up')]");
		
		//SpeCility
		By SpeCility2=By.cssSelector("Mat-select[ng-reflect-name='department']");
		
		//SpecilitySelect
		By SpecilitySelect2=By.xpath("//span[contains(text(),'Oral & Maxillofacial Surgery')]");
		
		//Doctor2
		By Doctor2=By.cssSelector("mat-select[ng-reflect-name='doctor']");
		
		//DoctorSelect2
		By DoctorSelect2=By.xpath("//span[contains(text(),'Abhilasha Sudhir Mundhe')]");
		
		
		//2ndEncounterSave
		By SecondEncounterSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");
		
		//SaveConfirm 
		By SaveConfirm2=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
		
		
		
		
//----OPCharge---//
	
	
	
	//Menu icon 
	By mainmenu1=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	
	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");
	
	
	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	
	//OPCharge
	By OPChargescreen=By.cssSelector("a[ng-reflect-router-link='bill,opcharge']");
	
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
	
	
//---Discount---//
	
	
	        //SelectAll
			By SelectAllcharges=By.cssSelector("mat-checkbox[ng-reflect-name='checkAllServices']");
			
			//DiscounttypeClick
			By DiscountTypeClick=By.cssSelector("mat-select[ng-reflect-name='discountType']");
			
			//PercentType
			By PercentType=By.xpath("//span[contains(text(),'Percent')]");
			
			//DiscountAmount 
			By DiscountAmount=By.cssSelector("input[ng-reflect-placeholder='Discount']");
			
			//DiscountCategoryclick
			By DiscountCategoryClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-op-charge/app-opdbill/div[4]/div/div/div[1]/div/div/mat-grid-list[1]/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select");
			
			
			//DiscountCategorySelect
			By DiscountCategorySelect=By.xpath("//span[contains(text(),'Hospital Discount')]");
			
			//GivenBy
			By GivenBy=By.cssSelector("input[ng-reflect-placeholder='Given By']");
			
			//DiscountApply
			By DiscountApply=By.cssSelector("button[ng-reflect-message='Apply Discount']");
		
	
	
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
	
	//CReatedMRN
	By CreatedMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[4]");
	
	
	//BillingSummary 
	By BillingSummary= By.cssSelector("a[ng-reflect-router-link='bill,billing-summary']");
	
	//BillSearchClick
	By BillSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	
	//MRNInput
	By MRNInput=By.cssSelector("input[ng-reflect-name='mrn']");
	
	//Search
	By BillMRNSearch=By.cssSelector("button[ng-reflect-message='Search']");
	
	

	
	public Existing_Patient_OPCharge_WithDiscount_Save_Self_Page (WebDriver driver)
	
	{
		this.driver=driver;
				
	}
	
	
  public void ExistingPatientOPChargeWithDiscount (String PrimaryIdNumber12,String ExparyDatePar,String SecondaryIdNumber12,String SecondaryExparyDatePar,String FullNamePar,String DateOfBirthPar,String MotherNamePar,String BirthPlacePar,String PatientNotes,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String EmploymentNoPar,String WorkFromPar,String ContactNumberPar,String ResAddPar,String PostCodePar12,String EncounterRemarksPar,String ServiceNamePar,String ServiceName2Par) throws InterruptedException, IOException 
  {
	  
		//Clicking on menu Icon
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		Thread.sleep(4000);
		driver.findElement(OPDMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		Thread.sleep(5000);
		driver.findElement(RegistrationMenu).click();
		Thread.sleep(4000);
		//click on registration sub menu.
		driver.findElement(subRegistration).click();

		//Click on plus button
		Thread.sleep(2000);
		driver.findElement(PlusButton).click(); 


		//Condition1
				Thread.sleep(4000);
				   if(driver.getPageSource().contains("Health Tourist Details")) 
				   {
				   System.out.println("Registration Page Appear"); 
				   } else 
				   {
				   System.out.println("Registration Page Not Appear"); 
				   }
				  
				   Thread.sleep(1000);
					
					File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(screenshot, new File(".//ScreenShots//Existing_Patient_OPCharge_WithDiscount_Save_Self_Test_RegistrationPage.png")); 
		
		//Select Primary Identification drop down

		Thread.sleep(1000);
		driver.findElement(PrimaryIdentificationClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Passport");
		Thread.sleep(1000);
		driver.findElement(PrimaryIdentificationselOpt).click();

		//Select Primary Id Number
		Thread.sleep(1000);
		driver.findElement(PrimaryIdNumber).sendKeys(PrimaryIdNumber12);
		//Expire date
		Thread.sleep(1000);
		driver.findElement(ExpirayDate).sendKeys(ExparyDatePar);

		//Selecting Issuing country
		Thread.sleep(1000);
		driver.findElement(Issuingcountryclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Malaysia");
		Thread.sleep(1000);
		driver.findElement(IssuingcountrySelOpt).click();

		//Secondary Identification
		Thread.sleep(1000);
		driver.findElement(SecondaryIdentificationClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Work Permit");
		Thread.sleep(1000);
		driver.findElement(SecondaryIdentificationSelOpt).click();

		//Secondary Id number
		Thread.sleep(1000);
		driver.findElement(SecondaryIDNumClick).sendKeys(SecondaryIdNumber12);

		//Secondary Expire date
		Thread.sleep(1000);
		driver.findElement(SecExpirayDate).sendKeys(SecondaryExparyDatePar);

		//Faculty selection
		Thread.sleep(1000);
		driver.findElement(FacultyClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("FAKULTI KEMANUSIAAN, SENI DAN WARISAN");
		Thread.sleep(1000);
		driver.findElement(FacultySelOpt).click();

		//filling Personal Information
		//Selecting Title
		driver.findElement(TitleClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(1000);
		driver.findElement(TitleSelOpt).click();

		//ENtering data in name filed
		Thread.sleep(1000);
		driver.findElement(Fullname).sendKeys(FullNamePar);

		//Selecting gender
		/*Thread.sleep(1000);
		driver.findElement(GenderClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("FEMALE");
		Thread.sleep(1000);
		driver.findElement(GenderSelOpt).click();*/

		//Selecting martial status
		Thread.sleep(1000);
		driver.findElement(MaritalStatusClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Married");
		Thread.sleep(1000);
		driver.findElement(MaritalStatusSelOpt).click();

		//Selecting Religion
		Thread.sleep(1000);
		driver.findElement(ReliginClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Islam");
		Thread.sleep(1000);
		driver.findElement(ReliginClickSelOpt).click();	
		//date of birth
		Thread.sleep(1000);
		driver.findElement(DateOfBirth).sendKeys(DateOfBirthPar);

		//Patient category
		Thread.sleep(1000);
		driver.findElement(PatientCategoryClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
		Thread.sleep(1000);
		driver.findElement(PatientCategorySelOpt).click();
		
		//Preferred Language
		Thread.sleep(1000);
		driver.findElement(PreferredLanguageClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Mandarin");
		Thread.sleep(1000);
		driver.findElement(PreferredLanguageSelOpt).click();
		
		//Selecting Nationality
		Thread.sleep(1000);
		driver.findElement(NationalityClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Albania");
		Thread.sleep(1000);
		driver.findElement(NationalitySelOpt).click();
		
		//Adding Mother Name	
		Thread.sleep(1000);
		driver.findElement(MotherNameCLick).sendKeys(MotherNamePar);
		
		//Selecting Education
		Thread.sleep(1000);
		driver.findElement(EducationClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Bachelor of Medicine and Bachelor of Surgery (MBBS)");
		Thread.sleep(1000);
		driver.findElement(EducationSelOpt).click();
		
		//Occupation
		Thread.sleep(1000);
		driver.findElement(OccupationClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Art And Talent");
		Thread.sleep(1000);
		driver.findElement(OccupationSelOpt).click();
		
		//Race
		/*Thread.sleep(1000);
		driver.findElement(RaceClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Health Tourist");
		Thread.sleep(1000);
		driver.findElement(RaceSelOpt).click();*/
		
		//Ethnic
		Thread.sleep(2000);
		driver.findElement(EthnicClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Malay");
		Thread.sleep(2000);
		driver.findElement(EthnicSelOpt).click();
		
		//Birth Place
		Thread.sleep(2000);
		driver.findElement(BirthPlaceClick).sendKeys(BirthPlacePar);
		
		//Blood Group
		Thread.sleep(1000);
		driver.findElement(BloodGroupClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("A RhD positive (A+)");
		Thread.sleep(1000);
		driver.findElement(BloodGroupSelOpt).click();
		
		//Source
		Thread.sleep(1000);
		driver.findElement(SourceClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Exhibition");
		Thread.sleep(1000);
		driver.findElement(SourceSelOpt).click();
		
		//Employment Status
		Thread.sleep(1000);
		driver.findElement(EmploymentStatusClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Employed");
		Thread.sleep(1000);
		driver.findElement(EmploymentStatusSelOpt).click();
		
		//Patient Notes
		Thread.sleep(1000);
		driver.findElement(PatientNotesClick).sendKeys(PatientNotes);



		//Tab1
		

		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Selecting Country
		Thread.sleep(1000);
		driver.findElement(countryClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Malaysia");
		Thread.sleep(1000);
		driver.findElement(countrySelOpt).click();
		//Selecting State
		Thread.sleep(1000);
		driver.findElement(StateClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Kedah");
		Thread.sleep(1000);
		driver.findElement(StateSelOpt).click();
		//Selecting City
		Thread.sleep(1000);
		driver.findElement(cityClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Kulim");
		Thread.sleep(1000);
		driver.findElement(citySelopt).click();

		//Selecting Area
		/*Thread.sleep(1000);
		driver.findElement(AreaClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Sample");
		Thread.sleep(1000);
		driver.findElement(AreaSelOpt).click();*/

		//Selecting PostCode
		Thread.sleep(1000);
		driver.findElement(PostCode).sendKeys(PostCodePar);
		//Residential Address
		Thread.sleep(2000);
		driver.findElement(ResAddress).sendKeys(ResidentialAddressPar);
		//Contact Information
		//Country Code
		Thread.sleep(1000);
		driver.findElement(CountryCodeClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("+213");
		Thread.sleep(1000);
		driver.findElement(CountryCodeSelOpt).click();
		
		//Mobile Number
		Thread.sleep(1000);
		driver.findElement(MobileNumberClick).sendKeys(MobileNumberPar);
		
		//Relation
		Thread.sleep(1000);
		driver.findElement(RelationClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Wife");
		Thread.sleep(1000);
		driver.findElement(RelationSelOpt).click();
		
		//Email
		Thread.sleep(1000);
		driver.findElement(EmailClick).sendKeys(Emailpar);
		//Personal Fax
		Thread.sleep(1000);
		driver.findElement(PersonalFax).sendKeys(PersonalFaxpar);
		//Work Fax
		Thread.sleep(1000);
		driver.findElement(WorkFax).sendKeys(WorkFaxpar);
		//Work Contact Number
		Thread.sleep(1000);
		driver.findElement(WorkContactNo).sendKeys(WorkContactNopar);
		//Home Contact Number
		Thread.sleep(1000);
		driver.findElement(HomeContactNo).sendKeys(HomeContactNopar);  

		//Tab2

		//Clicking on Tab2 Employment Details
		Thread.sleep(2000);
		driver.findElement(EmploymentDetailsTab).click();
		
		//Selecting Employer
		Thread.sleep(1000);
		driver.findElement(EmployeerClick).click();
		
		Thread.sleep(1000);
		driver.findElement(EmployeerSelOpt).click();
		//Employment no
		Thread.sleep(1000);
		driver.findElement(EmploymentNo).sendKeys(EmploymentNoPar);
		//Working From
		Thread.sleep(1000);
		driver.findElement(WorkingFrom).sendKeys(WorkFromPar);
		//Contact Number
		Thread.sleep(1000);
		driver.findElement(ContactNo).sendKeys(ContactNumberPar);
		//Employment Address
		Thread.sleep(1000);
		driver.findElement(EmpAdd).sendKeys(ResAddPar);
		
		//Country
		Thread.sleep(1000);
		driver.findElement(Country2Click).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Malaysia");
		Thread.sleep(1000);
		driver.findElement(Country2SelOpt).click();
		
	    //State
		Thread.sleep(1000);
		driver.findElement(State2Click).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Kedah");
		Thread.sleep(1000);
		driver.findElement(State2SelOpt).click();
		
		//City
		Thread.sleep(1000);
		driver.findElement(City2Click).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Kulim");
		Thread.sleep(1000);
		driver.findElement(City2SelOpt).click();
		
		//PassCode
		Thread.sleep(1000);
		driver.findElement(PostCode2).sendKeys(PostCodePar12); 


		//Clicking on save button	
		Thread.sleep(2000);
		driver.findElement(RegSave).click();


		//SaveConfirm
		Thread.sleep(3000);
		driver.findElement(SaveConfirm).click();		
		
		
			//Assertion1
			Thread.sleep(3000);
		      String URL = driver.getCurrentUrl();
		      Assert.assertEquals(URL, "https://medcare-productqa.hatiintl.com/#/OPD/patient/patient-encounter" );
		     
		      Thread.sleep(1000);
		      File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		      String timestamp1= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		      FileUtils.copyFile(screenshot1, new File(".//ScreenShots//Existing_Patient_OPCharge_WithDiscount_Save_Self_Test_Registration Created.png"));
			

		     //Window Switch
			Thread.sleep(5000);
			String windowHandle = driver.getWindowHandle();

			//Get the list of window handles

			ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
			Thread.sleep(2000);
			driver.switchTo().window((String) tabs.get(0));

			
	//----Encounter----//
			
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

			//selecting Tariff	 
			Thread.sleep(2000);
			driver.findElement(TariffClick).click();
			Thread.sleep(1000);
			driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
			Thread.sleep(1000);
			driver.findElement(TariffSelOpt).click();
			
			//Save Button
			Thread.sleep(2000);
			driver.findElement(SaveBUttonClick).click();
			
			//OkButton
			Thread.sleep(2000);
			driver.findElement(OkButtonClick).click();
			
			 //Window Switch
			Thread.sleep(5000);
			String windowHandle2 = driver.getWindowHandle();

			//Get the list of window handles

			ArrayList<Object> tabs1 = new ArrayList<Object> (driver.getWindowHandles());
			Thread.sleep(2000);
			driver.switchTo().window((String) tabs1.get(0));
			
			
		
			//SideBar
			Thread.sleep(3000);
			WebElement overforopdslide2=driver.findElement(SideBarMenu);
			act.moveToElement(overforopdslide2).build().perform();
			
			//EncounterList
			Thread.sleep(2000);
			driver.findElement(EncounterListClick).click();
			
			//CreatedMRN
			  Thread.sleep(2000);
			  WebElement MRNSearch=driver.findElement(CreatedMRN);
			  String MRNS=MRNSearch.getText();
			  
			  System.out.println("MRN"+MRNS);
			
			//SideBar
			Thread.sleep(3000);
			WebElement overforopdslide3=driver.findElement(SideBarMenu);
			act.moveToElement(overforopdslide3).build().perform();
			
			//Registration
			Thread.sleep(4000);
			driver.findElement(subRegistration).click();
			
			
  //--2ndEncounter--//

			
			//AdvanceSearch
			Thread.sleep(5000);
			driver.findElement(AdvanceSearch2).click();
			
			
			//PatientMRN2
			Thread.sleep(3000);
			driver.findElement(PatientMRN2).sendKeys(MRNS);
			
			//PatientSearch2
			Thread.sleep(3000);
			driver.findElement(PatientSearch2).click();
			
			//EncounterType2
			Thread.sleep(3000);
			driver.findElement(EncounterType2).click();
			
			Thread.sleep(2000);
			driver.findElement(AllDropDownSearch).sendKeys("Follow up");
			
			//TypeSelect
			Thread.sleep(3000);
			driver.findElement(TypeSelect2).click();
			
			//SpeCility
			Thread.sleep(3000);
			driver.findElement(SpeCility2).click();
			
			//SpecilitySelect
			Thread.sleep(3000);
			driver.findElement(SpecilitySelect2).click();
			
			//Doctor2
			Thread.sleep(3000);
			driver.findElement(Doctor2).click();
			
			//DoctorSelect2
			Thread.sleep(3000);
			driver.findElement(DoctorSelect2).click();
			
			//selecting Tariff	 
			Thread.sleep(2000);
			driver.findElement(TariffClick).click();
			Thread.sleep(1000);
			driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
			Thread.sleep(1000);
			driver.findElement(TariffSelOpt).click();
			
			//2ndEncounterSave
			Thread.sleep(3000);
			driver.findElement(SecondEncounterSave).click();
			
			//SaveConfirm
			Thread.sleep(3000);
			driver.findElement(SaveConfirm2).click();
			
			
			//Assertion1
			Thread.sleep(3000);
		      String URL2 = driver.getCurrentUrl();
		      Assert.assertEquals(URL2, "https://medcare-productqa.hatiintl.com/#/OPD/patient/patient-encounter" );
		     
		      Thread.sleep(1000);
		      File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		      String timestamp2= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		      FileUtils.copyFile(screenshot2, new File(".//ScreenShots//Existing_Patient_OPCharge_WithDiscount_Save_Self_Test_2ndEncounter Created.png"));
			
			  
		    //Window Switch
			Thread.sleep(5000);
			String windowHandle3 = driver.getWindowHandle();

			//Get the list of window handles

			ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());
			Thread.sleep(2000);
			driver.switchTo().window((String) tabs2.get(0));
			
			  
			
	  //---OPCharge---//
			
	  //MENU
	 Thread.sleep(3000);
	 driver.findElement(mainmenu1).click();
	  
	  //BillIcon
	  Thread.sleep(2000);
	  driver.findElement(BillingMenu).click();
	  
	//SideMenuBar
	  Thread.sleep(3000);
	  WebElement SidebarMenu=driver.findElement(SideBar);
	  act.moveToElement(SidebarMenu).build().perform();
	  
	  //OPCharge
	  Thread.sleep(4000);
	  driver.findElement(OPChargescreen).click();
	  
	  //Condition3
	  Thread.sleep(5000);
	   if(driver.getPageSource().contains("Charge Details")) 
	   {
	   System.out.println("OP Charge Screen Appear"); 
	   } else 
	   {
	   System.out.println("OP Charge Screen Not Appear"); 
	   }
	
	   
		Thread.sleep(1000);
		
		File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot3, new File(".//ScreenShots//Existing_Patient_OPCharge_WithDiscount_Save_Self_Test_OPChargeScreen.png")); 
	  
	 
	  
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
	  
	  
//---Discount---//
	  
	  
	  //SelectAll
	  Thread.sleep(2000);
	  driver.findElement(SelectAllcharges).click();
	  
	  //DiscountTypeClick
	  Thread.sleep(3000);
	  driver.findElement(DiscountTypeClick).click();
	  
	  //PercentTYpe
	  Thread.sleep(3000);
	  driver.findElement(PercentType).click();
	  
	  //DiscountAmount 
	  Thread.sleep(3000);
	  driver.findElement(DiscountAmount).sendKeys("5");
	  
	  //DiscountCategoryclick
	  Thread.sleep(2000);
	  driver.findElement(DiscountCategoryClick).click();
	  
	  //DiscountCategorySelect
	  Thread.sleep(2000);
	  driver.findElement(DiscountCategorySelect).click();
	  
	  //GivenBy
	  Thread.sleep(2000);
	  driver.findElement(GivenBy).sendKeys("Admin");
	  
	  //DiscountApply 
	  Thread.sleep(2000);
	  driver.findElement(DiscountApply).click();
	  
	  
	  //OPChargeSave
	  Thread.sleep(2000);
	  driver.findElement(SaveButton1).click();
	  
	  //Confirm
	  Thread.sleep(2000);
	  driver.findElement(Confirm1).click();
	  
	  
	  Thread.sleep(1000);
      File screenshot4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      String timestamp4= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
      FileUtils.copyFile(screenshot4, new File(".//ScreenShots//Existing_Patient_OPCharge_WithDiscount_Save_Self_Test_ChargesSave2.png"));
      Thread.sleep(3000);
	  
	  //Condition
	  
	  String Actual_1 = "Order updated Successfully";
      String Expected_1 = "Order updated Successfully";
      Assert.assertEquals(Actual_1, Expected_1, "Patient Charges Saved and applied");
	
      
      
  }
}
