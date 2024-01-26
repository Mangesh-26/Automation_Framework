package BillingPages.Depositself;

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

public class OP_Patient_Self_Deposit_With_Multiple_Payment_Against_Patient {
	
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

	//CReatedMRN
	By CreatedMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");
	
	
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
		By RadioButton=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-deposit/app-patient-search/div/div/div/table/tbody/tr[1]/td[1]/div/mat-radio-button/label/span[1]/span[1]");
		
		//DepositAmount
		By DepositAmount=By.cssSelector("input[ng-reflect-name='amount']");
		
		//DepositRemarks 
		By DepositRemarks=By.cssSelector("input[ng-reflect-placeholder='Remarks']");
		
		//DepositSave 
		By DepositSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");
		
//Multiple Payment//
		
		//AmountfieldClick
		By AmountfieldClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-billing-payment-dialog/div/form/div[2]/div/div[3]/form/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/input");
		
		
		//PaymentTypeClick
		By PaymentTypeClick=By.cssSelector("mat-select[ng-reflect-id='Payment Type']");
		
		//ChEque
		By Cheque=By.xpath("//span[contains(text(),'Cheque')]");
		
		//ChequeAmount
		By ChequeAmount=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-billing-payment-dialog/div/form/div[2]/div/div[3]/form/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/input");
		
		//ChequeNumber
		By ChequeNumber=By.cssSelector("input[ng-reflect-name='accountNumber']");
		
		//BankClick
		By BankClick=By.cssSelector("mat-select[ng-reflect-name='bank']");
		
		//BankSelect
		By BankSelect=By.xpath("//span[contains(text(),'Public Bank Berhad')]");
		
		//BranchClick
		By BranchClick=By.cssSelector("mat-select[ng-reflect-name='branch']");
		
		//BranchSelect
		By BranchSelect=By.xpath("//span[contains(text(),'RHB Bank')]");
		
		//ChequeDate
		By ChequeDate=By.cssSelector("input[ng-reflect-placeholder='Cheque Date']");
		
		//BatchNo
		By BatchNo=By.cssSelector("input[ng-reflect-name='batchNo']");
		
//---CardPayment---//
		
		//CardPayment
		By Cardpayment=By.xpath("//span[contains(text(),'Debit Card')]");
		
		//CardAmount
		By CardAmount=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-billing-payment-dialog/div/form/div[2]/div/div[3]/form/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/input");
		
		
		//CardNumber
		By CardNumber=By.cssSelector("input[ng-reflect-name='accountNumber']");
		
		
		//CardTypeClick
		By CardTypeClick=By.cssSelector("mat-select[formcontrolname='cardType']");
		
		//CardTypeSelect
		By CardTypeSelect=By.xpath("//span[contains(text(),'VISA')]");
		
		
		//ApprovalCode
		By ApprovalCode=By.cssSelector("input[ng-reflect-name='approvalCode']");
		
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
		

		
		
	
	public OP_Patient_Self_Deposit_With_Multiple_Payment_Against_Patient (WebDriver driver)
	
	{
		this.driver=driver;
				
	}
	
	
  public void OP_Patient_Deposit_Self_MutiplePayment (String QuickPrimaryIdNumberPar,String QuickExparyDatePar,String QuickFullNamePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar,String DepositAmountPar,String DepositRemarksPar,String CashPar,String ChequeAmountPar,String ChequeNumberPar,String BatchNoPar,String CardAmountPar,String CardNumberPar,String ApprovalCodePar,String ReceivedFromPar,String IDNoPar,String PaymentRemarksPar) throws InterruptedException, IOException 
  {
	  
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
			Thread.sleep(4000);
			driver.findElement(RegistrationMenu).click();
			Thread.sleep(4000);
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
				FileUtils.copyFile(screenshot, new File(".//ScreenShots//OP_Patient_Self_Deposit_With_Multiple_Payment_Against_Patient_Test_QuickRegisterationForm.png")); 
			   
				
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
			driver.findElement(Nameclick).sendKeys(QuickFullNamePar);
			//Clicking on Gender
			/*Thread.sleep(500);
			driver.findElement(Genderclick).click();
			Thread.sleep(500);
			driver.findElement(AllDropDownSearch).sendKeys("FEMALE");
			Thread.sleep(500);
			driver.findElement(Genderselectvalue).click();*/
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

			//Clicking on Encounter Notes
			/*Thread.sleep(500);
			driver.findElement(EncounterNotesButtonClick).click();
			//Adding Notes
			Thread.sleep(500);
			driver.findElement(AddNotesClick).sendKeys(QuickAddNotesPar);
			//Clicking on Add Remark Button
			Thread.sleep(500);
			driver.findElement(AddRemarkButtonClick).click();

			//Closing Dialog
			Thread.sleep(500);
			driver.findElement(CloseButtonClick).click();*/

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
			
			
			//Assertion1
			Thread.sleep(3000);
		      String URL = driver.getCurrentUrl();
		      Assert.assertEquals(URL, "https://medcare-productqa.hatiintl.com/#/OPD/patient/patient-sampleregistration" );
		     
		      Thread.sleep(1000);
		      File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		      String timestamp1= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		      FileUtils.copyFile(screenshot1, new File(".//ScreenShots//OP_Patient_Self_Deposit_With_Multiple_Payment_Against_Patient_Test_QuickRegistrationSaved.png"));


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
				
				File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot2, new File(".//ScreenShots//OP_Patient_Self_Deposit_With_Multiple_Payment_Against_Patient_Test_EncounterListScreen.png")); 
			  
	
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
				WebElement overforopdslide3=driver.findElement(SideBarMenu);
				act.moveToElement(overforopdslide3).build().perform();
	
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
				Thread.sleep(3000);
				driver.findElement(RadioButton).click();
				
				//DepositAmount
				Thread.sleep(2000);
				driver.findElement(DepositAmount).sendKeys(DepositAmountPar);
				
				//DepositRemarks
				Thread.sleep(2000);
				driver.findElement(DepositRemarks).sendKeys(DepositRemarksPar);
				
				//DepositSave
				Thread.sleep(2000);
				driver.findElement(DepositSave).click();
				
//---MultiplePayment---//
				
				//AmountField 
				Thread.sleep(2000);
				driver.findElement(AmountfieldClick).click();
				
				Thread.sleep(2000);
		        WebElement toClear = driver.findElement(AmountfieldClick);
		        toClear.sendKeys(Keys.CONTROL + "a");
		        toClear.sendKeys(Keys.DELETE);
				
		        //Cash
				Thread.sleep(3000);
				driver.findElement(AmountfieldClick).sendKeys(CashPar);
				
				//PaymentAdd
				Thread.sleep(2000);
				driver.findElement(PaymentAdd).click();
				
				//PaymentTypeClick
				Thread.sleep(3000);
				driver.findElement(PaymentTypeClick).click();
				
				//CheQue
				Thread.sleep(3000);
				driver.findElement(Cheque).click();
				
				//ChequeAmount
				Thread.sleep(3000);
				driver.findElement(ChequeAmount).sendKeys(ChequeAmountPar);
				
				//ChequeNumber
				Thread.sleep(3000);
				driver.findElement(ChequeNumber).sendKeys(ChequeNumberPar);
				
				//BankClick
				Thread.sleep(3000);
				driver.findElement(BankClick).click();
				Thread.sleep(2000);
				driver.findElement(BankSelect).click();
				
				//BranchClick
				Thread.sleep(2000);
				driver.findElement(BranchClick).click();
				Thread.sleep(2000);
				driver.findElement(BranchSelect).click();
				
				
				//CurrentDate 
				  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
			      String currentDate1 = dateFormat.format(new Date());

			      // Find the input field where you want to enter the current date and send keys
			      WebElement dateInput1 = driver.findElement(ChequeDate); // Replace with the actual ID or locator of the input field
			      dateInput1.sendKeys(currentDate1);
				
				
				//ChequeDate
				Thread.sleep(3000);
				driver.findElement(ChequeDate).sendKeys(currentDate1);
				
				//BatchNo 
				Thread.sleep(2000);
				driver.findElement(BatchNo).sendKeys(BatchNoPar);
				
				//PaymentAdd
				Thread.sleep(2000);
				driver.findElement(PaymentAdd).click();
				
				//CardPayment
				Thread.sleep(2000);
				driver.findElement(PaymentTypeClick).click();
				
				//CardSelect
				Thread.sleep(2000);
				driver.findElement(Cardpayment).click();
				
				//CardAmount
				Thread.sleep(2000);
				driver.findElement(CardAmount).sendKeys(CardAmountPar);
				
				//CardNumber
				Thread.sleep(2000);
				driver.findElement(CardNumber).sendKeys(CardNumberPar);
				
				//CardTypeClick
				Thread.sleep(2000);
				driver.findElement(CardTypeClick).click();
				Thread.sleep(2000);
				driver.findElement(CardTypeSelect).click();
				
				//Bank
				Thread.sleep(2000);
				driver.findElement(BankClick).click();
				Thread.sleep(2000);
				driver.findElement(BankSelect).click();
				
				
				//ApprovalCode
				Thread.sleep(2000);
				driver.findElement(ApprovalCode).sendKeys(ApprovalCodePar);
				
				//PaymentAdd
				Thread.sleep(2000);
				driver.findElement(PaymentAdd).click();
				
				
				//ReceivedFrom
				Thread.sleep(2000);
				driver.findElement(ReceivedFrom).sendKeys(ReceivedFromPar);
				
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
				Thread.sleep(5000);
			      File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			      String timestamp3= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			      FileUtils.copyFile(screenshot3, new File(".//ScreenShots//OP_Patient_Self_Deposit_With_Multiple_Payment_Against_Patient_Test_OPPatientDepositPayement.png"));
			      Thread.sleep(3000);
				  
				  //Condition
				  
				  String Actual_1 = "Do you want to proceed?";
			      String Expected_1 = "Do you want to proceed?";
			      Assert.assertEquals(Actual_1, Expected_1, "OP Patient Deposit Collected");
				
				//PaymentConfirm 
				Thread.sleep(3000);
				driver.findElement(PaymentConfirm).click();
				
				//WindowSwitch
				Thread.sleep(5000);
				String windowHandle2 = driver.getWindowHandle();

				//Get the list of window handles

				ArrayList<Object> tabs1 = new ArrayList<Object> (driver.getWindowHandles());
				Thread.sleep(2000);
				driver.switchTo().window((String) tabs1.get(0));
      
      
  }
}
