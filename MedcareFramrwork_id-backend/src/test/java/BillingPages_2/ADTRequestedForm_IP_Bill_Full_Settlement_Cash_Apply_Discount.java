package BillingPages_2;

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

public class ADTRequestedForm_IP_Bill_Full_Settlement_Cash_Apply_Discount 
{
	WebDriver driver;
	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADTMenu=By.xpath("//*[@id='mat-menu-panel-16']/div/div/div[1]/div[1]/div[3]/div/span");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By AdmissionForm=By.xpath("//span[contains(text(),'Admission Form')]");
	By BillingMenuClik=By.xpath("//span[contains(text(),'Billing')]");

	//IP Charges
	By AdmissionDashboard=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]");
	//Search button
	By SearchButtonClick2=By.cssSelector("button[ng-reflect-message='Search']");
	//Taking MRN From dashboard
	By MRNClick=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	//IPD Billing
	By IPDBillClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[2]/ul/li[6]/a/span[1]");
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
	//Check All Services
	By CheckAllServicesClick=By.cssSelector("mat-checkbox[ng-reflect-name='checkAllServices']");
	//Save Button
	By SaveButtonClick3=By.cssSelector("mat-icon[ng-reflect-message='Save']");
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
	By BillingSummaryClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[2]/ul/li[1]/a/span[1]");
	//Discount Type
	By DiscountTypeClick=By.cssSelector("mat-select[ng-reflect-name='discountType']");
	By DiscountTypeSelOpt=By.xpath("//span[contains(text(),'Percent')]");

	//Discount text field
	By DiscountClick=By.cssSelector("input[ng-reflect-placeholder='Discount']");
	//DiscountCategory
	By DiscountCategoryClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-ipd-bill/div[4]/div/div[1]/div/div/mat-grid-list[1]/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By DiscountCategorySelopt=By.xpath("//span[contains(text(),'Hospital Discount')]");

	//GIven by
	By GivenByClick=By.cssSelector("input[ng-reflect-placeholder='Given By']");
	//Apply discount button
	By ApplyDiscountClick=By.cssSelector("button[ng-reflect-message='Apply Discount']");
	//Confirm 

	//FinalSearch
	By SearchMRNFinalClick=By.xpath("/html/body/div[2]/div[2]/div/div/div/div/form/div[5]/div[2]/button[1]/span[1]/mat-icon");
	//Side Bar Menu Billing screen
	By SideBarBillingScreenClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar");
	public void IPCharges_IPD_BIll_FullSettelment_Apply_Discount()throws InterruptedException, IOException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(mainmenuADTScreen);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();

		//ADT
		Thread.sleep(3000);
		driver.findElement(ADTMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide1).build().perform();

		Thread.sleep(3000);
		driver.findElement(AdmissionDashboard).click();

		Thread.sleep(5000);
		WebElement MRN1=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[2]"));
		String MRNS=MRN1.getText();
		System.out.println("MRN Number:"+MRNS);

		Thread.sleep(4000);
		Actions act1 = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(mainmenuADTScreen);
		act1.moveToElement(ele2).build().perform();
		act1.click(ele2).perform();

		Thread.sleep(3000);
		driver.findElement(BillingMenuClik).click();

		//IPD Billing
		//Over the slide bar in Billing Screen
		Thread.sleep(3000);
		WebElement overforopdslide4=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide4).build().perform();

		Thread.sleep(3000);
		driver.findElement(IPDBillClick).click();

		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick3).click();

		Thread.sleep(2000);
		driver.findElement(MRNCLick3).sendKeys(MRNS);

		Thread.sleep(3000);
		driver.findElement(SearchButtonClick3).click();

		/*//Selecting type of Service
				Thread.sleep(2000);
				driver.findElement(ServiceTypeClick).click();
				//Thread.sleep(1000);
				//driver.findElement(AllDropDownSearch).sendKeys("Service");
				Thread.sleep(1000);
				driver.findElement(ServiceSelOpt).click();*/

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

		/*//Selecting type of Service
				Thread.sleep(2000);
				driver.findElement(PayerClick).click();
				//Thread.sleep(1000);
				//driver.findElement(AllDropDownSearch).sendKeys("");
				Thread.sleep(1000);
				driver.findElement(PayerSelOpt).click();*/

		//Service button click
		Thread.sleep(2000);
		driver.findElement(ServiceButtonClick3).click();

		//Clicking on all services
		Thread.sleep(2000);
		driver.findElement(CheckAllServicesClick).click();

		//Adding discount

		//Selecting discount type
		Thread.sleep(2000);
		driver.findElement(DiscountTypeClick).click();
		Thread.sleep(2000);
		driver.findElement(DiscountTypeSelOpt).click();

		Thread.sleep(2000);		
		WebElement toClear = driver.findElement(DiscountClick);
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);

		//Discount
		Thread.sleep(3000);
		driver.findElement(DiscountClick).sendKeys("2");

		//Discount category
		Thread.sleep(3000);
		driver.findElement(DiscountCategoryClick).click();
		Thread.sleep(2000);
		driver.findElement(DiscountCategorySelopt).click();

		//GIven By
		Thread.sleep(2000);
		driver.findElement(GivenByClick).sendKeys("Doctor");

		//Click on apply discount
		Thread.sleep(2000);
		driver.findElement(ApplyDiscountClick).click();

		//Check box  click
		Thread.sleep(2000);
		driver.findElement(FinalBillClick3).click();

		//Save button click
		Thread.sleep(2000);
		driver.findElement(SaveButtonClick3).click();

		//Yes Button Click
		Thread.sleep(2000);
		driver.findElement(YesButtonClick3).click();

		//Click on add payment details
		Thread.sleep(2000);
		driver.findElement(AddPayementClick3).click();

		//Click on Save payment details
		Thread.sleep(2000);
		driver.findElement(SavePaymentDetailClick3).click();

		Thread.sleep(2000);
		driver.findElement(ConfirmYesClick3).click();

		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//IPD_Bill_Full_Settlement_Cash.png"+ dateFormat.format(date)));

		//TabSwitch
		Thread.sleep(5000);
		String windowHandle2 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());

		//Use the list of window handles to switch between windows
		Thread.sleep(8000);
		driver.switchTo().window((String)tabs.get(0));

		//Over the slide bar in OPD Screen
		Thread.sleep(5000);

		Actions actt = new Actions(driver);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		actt.moveToElement(overforopdslide2).build().perform();
		
		//Billing summary click
		Thread.sleep(5000);
		driver.findElement(BillingSummaryClick).click();

		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick3).click();

		Thread.sleep(2000);
		driver.findElement(MRNCLick3).sendKeys(MRNS);

		Thread.sleep(3000);
		driver.findElement(SearchMRNFinalClick).click();   

		Thread.sleep(5000);
		if(driver.getPageSource().contains(MRNS) && driver.getPageSource().contains("ISSUED"))
		{
			System.out.println("Outstanding bill has been creadted for patient"+MRNS);
		}
		else
		{
			System.out.println("Admission Form Screen not open");
		}

		File screenshot4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot4, new File(".//ScreenShot//Patient_found.png"+ dateFormat.format(date)));

	}
	public ADTRequestedForm_IP_Bill_Full_Settlement_Cash_Apply_Discount(WebDriver driver)
	{
		this.driver=driver;
	}
}
