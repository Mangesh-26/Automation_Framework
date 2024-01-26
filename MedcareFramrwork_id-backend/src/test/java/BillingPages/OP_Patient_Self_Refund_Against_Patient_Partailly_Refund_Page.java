package BillingPages.RefundSelf;

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

public class OP_Patient_Self_Refund_Against_Patient_Partailly_Refund_Page {
	
WebDriver driver=null;
	
//----Registration---//

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
	
	//Deceased
	By Deceased=By.xpath("//*[@id='mat-checkbox-8']/label");
	
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
	
//Tab 1 Address and contact Details
	By AddressAndContactDetail=By.cssSelector("div[aria-controls='mat-tab-content-2-0']");
	
	//Address
	//Residential Address
	By ResAddress=By.cssSelector("input[ng-reflect-name='addressPrimary']");
	
	//Country
	By countryClick=By.cssSelector("mat-select[ng-reflect-name='countryPrimary']");
	By countrySelOpt=By.xpath("//span[contains(text(),' Malaysia ')]");	 
	
	//State
	By StateClick=By.cssSelector("mat-select[ng-reflect-name='statePrimary']");
	By StateSelOpt=By.xpath("//span[contains(text(),'Negeri Sembilan')]");
	
	//City
	By cityClick=By.cssSelector("mat-select[ng-reflect-name='cityPrimary']");
	By citySelopt=By.xpath("//span[contains(text(),'Seremban')]");
	
	//Area
	By AreaClick=By.cssSelector("mat-select[ng-reflect-name='subDistrictPrimary']");
	By AreaSelOpt=By.xpath("//span[contains(text(),'None')]");
	
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

	
	//Save Button
	By SaveButton=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	//OK Dialog
	By OkDialog=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	
	
	
//---Encounter---//
	
	
	
	//Encounter Type
			By EncounterTypeClick2nd=By.cssSelector("mat-select[ng-reflect-name='encounterType']");
			By EncounterTypeSelOpt2nd=By.xpath("//span[contains(text(),'Follow up')]");
			
			//Specialty
			By SpecialityClick2nd=By.cssSelector("mat-select[ng-reflect-name='department']");
			By SpecilitySelOPt2nd=By.xpath("//span[contains(text(),'General Surgery')]");
			
			//Doctor
			By DoctorClick2nd=By.cssSelector("mat-select[ng-reflect-name='doctor']");
			By DoctorSelOpt2nd=By.xpath("//span[contains(text(),'Dr. Micheal Tan')]");
			
		
			//selecting Tariff
			By TariffClick2nd=By.cssSelector("mat-select[data-automation-attribute='encounterTariff0']");
			By TariffSelOpt2nd=By.xpath("//span[contains(text(),'Self Tariff')]");
	
			//Save Button
			By SaveBUttonClick2nd=By.cssSelector("mat-icon[ng-reflect-message='Save']");
			
			//OkButton
			By OkButtonClick2nd=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
			
			//EncounterList
			By EncounterList2=By.xpath("//span[contains(text(),'Encounter List')]");
		
			
	//CReatedMRN
	By CreatedMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[4]");	
	
	
	//----Deposit---//
	
	//Menu icon 
		By mainmenu1=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
		By MainMenuTooltip=By.xpath("/html/body/div[2]");
		
		//BillingIcon 
		By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");
		
		
		//SideBar
		By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	
		
		//BillDisappear
		By BillDisappear=By.cssSelector("a[id='31']");
		
		//DepositClick
		By DepositClick=By.cssSelector("a[id='30']");
		
		//SelfDepositClick
		By SelfDepositClick=By.cssSelector("a[ng-reflect-router-link='deposit,deposit']");
		
		//DepositAdvanceClick
		By DepositAdvanceClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
		
		//PatientMRN
		By PatientMRN=By.cssSelector("input[data-placeholder='Patient MRN']");
		
		//PatientSearch
		By PatientSearch=By.cssSelector("button[ng-reflect-message='Search']");
		
		//RadioButton
		By RadioButton=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-deposit/app-patient-search/div/div/div/table/tbody/tr[1]/td[1]/div/mat-radio-button");
				
		//DepositAmount
		By DepositAmount=By.cssSelector("input[ng-reflect-name='amount']");
		
		//DepositRemarks 
		By DepositRemarks=By.cssSelector("input[ng-reflect-placeholder='Remarks']");
		
		//DepositSave 
		By DepositSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");
		
		//PaymentAdd
		By PaymentAdd=By.cssSelector("mat-icon[ng-reflect-message='Add Payment Details']");
		
		//ReceivedFrom
		By ReceivedFrom=By.cssSelector("input[ng-reflect-placeholder='Received From']");
		
		//ID no
		By IDNo=By.cssSelector("input[ng-reflect-placeholder='Identification No']");
		
		//PaymentRemarks 
		By PaymentRemarks=By.cssSelector("input[ng-reflect-placeholder='Remark']");
		
		//PaymentSave
		By PaymentSave=By.cssSelector("mat-icon[ng-reflect-message='Save Payment Details']");
		
		//PaymentConfirm
		By PaymentConfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
		
		
//---Refund---//
		
		
		//RefundClick
		By RefundClick=By.cssSelector("a[id='5998']");
		
		//SelfClick
		By SelfClick=By.cssSelector("a[ng-reflect-router-link='refund,refund']");
		
		//RefundAddButton
		By RefundAddButton=By.cssSelector("button[ng-reflect-message='Add']");
		
		//RefundAdvanceSearch
		By RefundAdvanceSearch=By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
		
		//PatientMRNSearch
		By PatientMRNSearch=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
		
		//SearchClick
		By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");
		
		//Radio
		By Radio=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-refund-against-deposit/app-patient-search/div/div/div/table/tbody/tr[1]/td[1]/div/mat-radio-button");
		
		//CheckBox
		By CheckBox=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-refund-against-deposit/div[3]/div[1]/table/tbody/tr/td[1]/mat-checkbox/label/span[1]");
		

		//RefundAmount
		By RefundAmount=By.cssSelector("input[ng-reflect-name='Ramount']");
		
		//RefundSave
		By RefundSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");
		
		//RefundAmountAdd
		By RefundAmountAdd=By.cssSelector("mat-icon[ng-reflect-message='Add Payment Details']");
		
		//RefundamountSave
		By RefundAmountSave=By.cssSelector("mat-icon[ng-reflect-message='Save Payment Details']");
		
		//RefundConfirm
		By RefundConfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
		
		
		
		//PrintNo
		By PrintNo=By.cssSelector("mat-icon[ng-reflect-message='No']");
		
		
		public OP_Patient_Self_Refund_Against_Patient_Partailly_Refund_Page (WebDriver driver)
		
		{
			this.driver=driver;
					
		}
		
		
  public void OPRefundForSelf(String PrimaryIdNumberPar,String ExparyDatePar,String SecondaryIdNumberPar,String SecondaryExparyDatePar,String FullNamePar,String DateOfBirthPar,String MotherNamePar,String PatientNotesPar,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String DepositAmountPar,String DepositRemarksPar,String IDNoPar,String PaymentRemarksPar,String RefundAmountPar) throws InterruptedException, IOException 
  
  {
	  //---Registration---//
	  
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
				
				//Select Primary Identification drop down

				Thread.sleep(1000);
				driver.findElement(PrimaryIdentificationClick).click();
				Thread.sleep(1000);
				driver.findElement(AllDropDownSearch).sendKeys("Passport");
				Thread.sleep(1000);
				driver.findElement(PrimaryIdentificationselOpt).click();

				//Select Primary Id Number
				Thread.sleep(1000);
				driver.findElement(PrimaryIdNumber).sendKeys(PrimaryIdNumberPar);
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
				driver.findElement(SecondaryIDNumClick).sendKeys(SecondaryIdNumberPar);

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
				/*Thread.sleep(1000);
				driver.findElement(MaritalStatusClick).click();
				Thread.sleep(1000);
				driver.findElement(AllDropDownSearch).sendKeys("Married");
				Thread.sleep(1000);
				driver.findElement(MaritalStatusSelOpt).click();*/

				//Selecting Religion
				/*Thread.sleep(1000);
				driver.findElement(ReliginClick).click();
				Thread.sleep(1000);
				driver.findElement(AllDropDownSearch).sendKeys("Islam");
				Thread.sleep(1000);
				driver.findElement(ReliginClickSelOpt).click();	*/
				
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
				driver.findElement(BirthPlaceClick).sendKeys("Pune");
				
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
				driver.findElement(PatientNotesClick).sendKeys(PatientNotesPar);



				//Tab1


				//Clicking on tab Address and content details
				Thread.sleep(1000);
				driver.findElement(AddressAndContactDetail).click();	

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
				driver.findElement(AllDropDownSearch).sendKeys("Negeri Sembilan");
				Thread.sleep(1000);
				driver.findElement(StateSelOpt).click();
				//Selecting City
				Thread.sleep(1000);
				driver.findElement(cityClick).click();
				Thread.sleep(1000);
				driver.findElement(AllDropDownSearch).sendKeys("Seremban");
				Thread.sleep(1000);
				driver.findElement(citySelopt).click();

				//Selecting Area
				Thread.sleep(1000);
				driver.findElement(AreaClick).click();
				Thread.sleep(1000);
				driver.findElement(AllDropDownSearch).sendKeys("");
				Thread.sleep(1000);
				driver.findElement(AreaSelOpt).click();

				//SelectingPostcode
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

				//Clicking on save button	
				Thread.sleep(2000);
				driver.findElement(SaveButton).click();


				//Clicking on ok dialog
				Thread.sleep(3000);
				driver.findElement(OkDialog).click();
				
		
				//WindowSwitch
				Thread.sleep(5000);
				String windowHandle1 = driver.getWindowHandle();

				//Get the list of window handles

				ArrayList<Object> tabs1 = new ArrayList<Object> (driver.getWindowHandles());
				Thread.sleep(2000);
				driver.switchTo().window((String) tabs1.get(0));
				
		//----Encounter---//
				
				
				
				//Selecting Encounter Type
				Thread.sleep(1000);
				driver.findElement(EncounterTypeClick2nd).click();
				Thread.sleep(1000);
				driver.findElement(AllDropDownSearch).sendKeys("Follow up");
				Thread.sleep(1000);
				driver.findElement(EncounterTypeSelOpt2nd).click();

				//Selecting Specialty
				Thread.sleep(1000);
				driver.findElement(SpecialityClick2nd).click();
				Thread.sleep(1000);
				driver.findElement(AllDropDownSearch).sendKeys("General Surgery");
				Thread.sleep(1000);
				driver.findElement(SpecilitySelOPt2nd).click();
				//Selecting Doctor
				Thread.sleep(1000);
				driver.findElement(DoctorClick2nd).click();
				Thread.sleep(1000);
				driver.findElement(AllDropDownSearch).sendKeys("Dr. Micheal Tan");
				Thread.sleep(1000);
				driver.findElement(DoctorSelOpt2nd).click();
				
				

		//selecting Tariff	 
				Thread.sleep(2000);
				driver.findElement(TariffClick2nd).click();
				Thread.sleep(1000);
				driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
				Thread.sleep(1000);
				driver.findElement(TariffSelOpt2nd).click();

				//SAVE2
				driver.findElement(SaveBUttonClick2nd).click();
				
				//Confirm2
				driver.findElement(OkButtonClick2nd).click();
				 
				
				//WindowSwitch
				Thread.sleep(5000);
				String windowHandle2 = driver.getWindowHandle();

				//Get the list of window handles

				ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());
				Thread.sleep(2000);
				driver.switchTo().window((String) tabs2.get(0));
				
				//SideBar
				Thread.sleep(3000);
				WebElement overforopdslide3=driver.findElement(SideBarMenu);
				act.moveToElement(overforopdslide3).build().perform();
				
				//EncounterList 
				Thread.sleep(3000);
				driver.findElement(EncounterList2).click();
				
				//CreatedMRN
				  Thread.sleep(3000);
				  WebElement MRNSearch=driver.findElement(CreatedMRN);
				  String MRNS=MRNSearch.getText();
				  
				  System.out.println("MRN"+MRNS);
				  
		
			//------Deposit-----//
					
					//Menu
					Thread.sleep(3000);
					Actions act1 = new Actions(driver);
					//Thread.sleep(2000);
					WebElement ele1=driver.findElement(mainmenu);
					act1.moveToElement(ele1).build().perform();
					act1.click(ele1).perform();
					
					//BillingIcon 
					Thread.sleep(3000);
					driver.findElement(BillingMenu).click();
					
					//SideBar
					Thread.sleep(3000);
					WebElement overforopdslide4=driver.findElement(SideBarMenu);
					act.moveToElement(overforopdslide4).build().perform();
		
					//BillDisappear
					Thread.sleep(2000);
					driver.findElement(BillDisappear).click();
					
					//DepositClick
					Thread.sleep(2000);
					driver.findElement(DepositClick).click();
					
					//SelfDepositClick
					Thread.sleep(2000);
					driver.findElement(SelfDepositClick).click();
					
					//DepositAdvanceClick
					Thread.sleep(2000);
					driver.findElement(DepositAdvanceClick).click();
					
					//PatientMRN
					Thread.sleep(2000);
					driver.findElement(PatientMRN).sendKeys(MRNS);
					
					//PatientSearch
					Thread.sleep(2000);
					driver.findElement(PatientSearch).click();
					
					//SelectRadio
					/*Thread.sleep(3000);
					driver.findElement(RadioButton).click();*/
					
					//DepositAmount
					Thread.sleep(2000);
					driver.findElement(DepositAmount).sendKeys(DepositAmountPar);
					
					//DepositRemarks
					Thread.sleep(2000);
					driver.findElement(DepositRemarks).sendKeys(DepositRemarksPar);
					
					//DepositSave
					Thread.sleep(2000);
					driver.findElement(DepositSave).click();
					
					//PaymentAdd
					Thread.sleep(2000);
					driver.findElement(PaymentAdd).click();
					
					//ReceivedFrom
					Thread.sleep(2000);
					driver.findElement(ReceivedFrom).sendKeys("Admin");
					
					//IDNo
					Thread.sleep(2000);
					driver.findElement(IDNo).sendKeys(IDNoPar);
					
					//PaymentRemarks 
					Thread.sleep(2000);
					driver.findElement(PaymentRemarks).sendKeys(PaymentRemarksPar);
					
					//PaymentSave
					Thread.sleep(2000);
					driver.findElement(PaymentSave).click();
					
					//Assertion
					  Thread.sleep(1000);
				      File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				      String timestamp3= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
				      FileUtils.copyFile(screenshot3, new File(".//ScreenShots//OP_Patient_Self_Refund_Test_OPPatientDepositPayementforRefund.png"));
				      Thread.sleep(3000);
					  
					  //Condition
					  
					  String Actual_1 = "Do you want to proceed?";
				      String Expected_1 = "Do you want to proceed?";
				      Assert.assertEquals(Actual_1, Expected_1, "OP Patient Deposit Collected For Refund");
					
					
					
					//PaymentConfirm 
					Thread.sleep(2000);
					driver.findElement(PaymentConfirm).click();
					
					//WindowSwitch
					Thread.sleep(5000);
					String windowHandle4 = driver.getWindowHandle();

					//Get the list of window handles

					ArrayList<Object> tabs4 = new ArrayList<Object> (driver.getWindowHandles());
					Thread.sleep(2000);
					driver.switchTo().window((String) tabs4.get(0));
	  
					//SideBar
					Thread.sleep(3000);
					WebElement overforopdslide5=driver.findElement(SideBarMenu);
					act.moveToElement(overforopdslide5).build().perform();
				
					
   //----Refund----//
					
					//RefundClick
					Thread.sleep(2000);
					driver.findElement(RefundClick).click();
					
					//SelfClick
					Thread.sleep(2000);
					driver.findElement(SelfClick).click();
					
					//RefundAddButton
					Thread.sleep(2000);
					driver.findElement(RefundAddButton).click();
					
					//RefundAdvanceSearch
					Thread.sleep(2000);
					driver.findElement(RefundAdvanceSearch).click();
					
					//PatientMRNSearch
					Thread.sleep(2000);
					driver.findElement(PatientMRNSearch).sendKeys(MRNS);
					
					//SearchClick
					Thread.sleep(2000);
					driver.findElement(SearchClick).click();
					
					//Radio
					/*Thread.sleep(2000);
					driver.findElement(Radio).click();*/
					
					//CheckBox
					Thread.sleep(2000);
					driver.findElement(CheckBox).click();
					
					//RefundAmount
					Thread.sleep(2000);
					driver.findElement(RefundAmount).clear();
					Thread.sleep(2000);
					driver.findElement(RefundAmount).sendKeys(RefundAmountPar);
					
					//RefundSave
					Thread.sleep(2000);
					driver.findElement(RefundSave).click();
					
					//RefundAmountAdd
					Thread.sleep(2000);
					driver.findElement(RefundAmountAdd).click();
					
					//RefundamountSave
					Thread.sleep(2000);
					driver.findElement(RefundAmountSave).click();
					
					//RefundConfirm
					Thread.sleep(2000);
					driver.findElement(RefundConfirm).click();
					
					//Assertions
					 Thread.sleep(1000);
				      File screenshot4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				      String timestamp4= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
				      FileUtils.copyFile(screenshot4, new File(".//ScreenShots//OP_Patient_Self_Refund_Test_OP Patient Refund Collected.png"));
				      Thread.sleep(3000);
					  
					  //Condition
					  
					  String Actual_2 = "Do you want to proceed?";
				      String Expected_2 = "Do you want to proceed?";
				      Assert.assertEquals(Actual_2, Expected_2, "Patient Refund collected");
				
					//PrintNo
					Thread.sleep(2000);
					driver.findElement(PrintNo).click();
					

					//Window Switch
					Thread.sleep(5000);
					String windowHandle5 = driver.getWindowHandle();

					//Get the list of window handles

					ArrayList<Object> tabs5 = new ArrayList<Object> (driver.getWindowHandles());
					Thread.sleep(2000);
					driver.switchTo().window((String) tabs5.get(0));
	
					
	  
  }
}
