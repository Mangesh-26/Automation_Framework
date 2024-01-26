package BillingPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import OPDTest.ReadExcelRowWithSelenium;

public class Billing_Summary_Advanced_search {

	WebDriver driver=null;

	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");

	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

	//OPBill
	By Billing=By.cssSelector("a[ng-reflect-router-link='bill,billing-summary']");

	//SearchClick
	By AdvanceSearch=By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	//MRN
	By MRNsearch=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");

	//SearchClick
	By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");

	//Advance Serach
	By PTname = By.cssSelector("input[ng-reflect-name='patientName']");
	//	By Patient_MRN = By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	By Invoice_No = By.cssSelector("input[ng-reflect-placeholder='Invoice No']");
	By Searchh = By.cssSelector("input[ng-reflect-message='Search']");

	By collapse = By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	public Billing_Summary_Advanced_search(WebDriver driver)

	{
		this.driver=driver;

	}
	public void Billing_Summary_Advanced_searchfunc() throws InterruptedException, IOException, AWTException 

	{

		//---OPBill---//
		Actions act = new Actions(driver);
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
		driver.findElement(Billing).click();

		//AdvanceSearch 
		Thread.sleep(3000);
		driver.findElement(AdvanceSearch).click();

		//PatientMRN
		Thread.sleep(2000);
		driver.findElement(MRNsearch).sendKeys("HISCKLMRN231213648");
		
		//Search
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();
		
	
		File screenshot_9 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_9, new File(".//ScreenShots//Billing_Summary_Advanced_search_by_MRN.png")); 
		Thread.sleep(2000);
		
	//	driver.navigate().refresh();

		//AdvanceSearch 
		Thread.sleep(3000);
		driver.findElement(collapse).click();

		//PatientMRN
		Thread.sleep(2000);
		driver.findElement(PTname).sendKeys("HAZER");
		

		//Search
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();
		
		File screenshot_10 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_10, new File(".//ScreenShots//Billing_Summary_Advanced_search_by_name.png")); 


		//AdvanceSearch 
		Thread.sleep(3000);
		driver.findElement(AdvanceSearch).click();

		//PatientMRN
		Thread.sleep(2000);
		driver.findElement(Invoice_No).sendKeys("HISCKLIPINV2024110218");

		//Search
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();

		File screenshot_11 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_11, new File(".//ScreenShots//Billing_Summary_Advanced_search_Invoice_No.png")); 
	    Thread.sleep(2000);
	        
	}
}
