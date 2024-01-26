package BillingPages_2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Billing_Company_Deposit_Cash_Save 
{
	WebDriver driver;
	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");
	By ADTMenu=By.xpath("//*[@id='mat-menu-panel-16']/div/div/div[1]/div[1]/div[3]/div/span");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By AdmissionForm=By.xpath("//span[contains(text(),'Admission Form')]");
	By BillingMenuClik=By.xpath("//span[contains(text(),'Billing')]");
	//Sub Bill Menu
	By BillClick=By.cssSelector("a[id='31']");
	//DepositClick
	By DepositClick=By.cssSelector("a[id='30']");
	//COmpany Sub Menu
	By CompanyMenuClick=By.cssSelector("a[id='131']");
	//COmpany Type
	By CompanyTypeClick=By.cssSelector("mat-select[ng-reflect-name='companyType']");
	By CompanySelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span");
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
	public void Billing_COmpany_Deposit_for_Cash() throws InterruptedException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(mainmenuADTScreen);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();

		Thread.sleep(3000);
		driver.findElement(BillingMenuClik).click();

		//Over the slide bar in Billing menu Screen
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide2).build().perform();

		//DepositClick
		Thread.sleep(3000);
		driver.findElement(BillClick).click();

		//DepositClick
		Thread.sleep(2000);
		driver.findElement(DepositClick).click();

		//CLicking on Company Sub Menu
		Thread.sleep(2000);
		driver.findElement(CompanyMenuClick).click();

		Thread.sleep(2000);
		driver.findElement(CompanyTypeClick).click();
		Thread.sleep(2000);
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
		driver.findElement(AmountClick).sendKeys("10000");

		//Click on Remarks
		Thread.sleep(2000);
		driver.findElement(RemarkClcik).sendKeys("Adding company deposit");

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
	}
	public Billing_Company_Deposit_Cash_Save(WebDriver driver)
	{
		this.driver=driver;
	}
}
