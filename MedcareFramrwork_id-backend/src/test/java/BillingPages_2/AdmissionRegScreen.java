package BillingPages_2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AdmissionRegScreen {
	
	WebDriver driver;

	//Address
			
			
			//Country
			By Country=By.cssSelector("mat-select[ng-reflect-name='countryPrimary']");
			By Countrysearch=By.cssSelector("input[aria-label='dropdown search']");
			By Countryselect=By.xpath("//span[contains(text(),'Malaysia')]");
			
			//State
			By State=By.cssSelector("mat-select[ng-reflect-name='statePrimary']");
			By Statesearch=By.cssSelector("input[aria-label='dropdown search']");
			By Stateselect=By.xpath("//span[contains(text(),'Kedah')]");
			
			//City 
			By City=By.cssSelector("mat-select[ng-reflect-name='cityPrimary']");
			By Citysearch=By.cssSelector("input[aria-label='dropdown search']");
			By Cityselect=By.xpath("//span[contains(text(),'Kulim')]");
			
			//Area
			By Area=By.cssSelector("mat-select[ng-reflect-name='subDistrictPrimary']");
			By Areasearch=By.cssSelector("input[aria-label=\'dropdown search\']");
			By Areaselect=By.xpath("//span[contains(text(),'Sample')]");
			
			By Address=By.cssSelector("input[ng-reflect-placeholder='Residential Address']");
			//CheckBox
			By Checkbox=By.xpath("//span[contains(text(),'Same as Residential Address')]");
			
			//CountryCode
			By Countrycode=By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
			By Codesearch=By.cssSelector("input[aria-label=\'dropdown search\']");
			By Codeselect=By.xpath("//span[contains(text(),'+61')]");
			
			//Gender
			By Gender1=By.cssSelector("mat-select[ng-reflect-name='gender']");
			By Gender1search=By.cssSelector("input[aria-label=\'dropdown search\']");
			By Gender1select=By.xpath("//span[contains(text(),'MALE')]");
			
			//Save
			By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
			By Confirmclick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
			
			
			public AdmissionRegScreen (WebDriver driver)
			
			{
				this .driver=driver;
				
			}  
  public void Registration(String AddressPar) throws InterruptedException, IOException
  {
	  
	/*//Condition3
	  Thread.sleep(5000);
      if(driver.getPageSource().contains("Health Tourist Details"))
      {
    	System.out.println("Registration Page Open");  
      }
      else
      {
    	  System.out.println("Registration Page not open");
      }

    //ScreenShot3
	  File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot3,new File(".//ScreenShot//AdmissionRequest3.png"));*/
   
	
	  
	  //Country
	  Thread.sleep(4000);
	  driver.findElement(Country).click();
	  Thread.sleep(1000);
	  driver.findElement(Countrysearch).sendKeys("Malaysia");
	  Thread.sleep(1000);
	  driver.findElement(Countryselect).click();
	  
	  //State
	  Thread.sleep(2000);
	  driver.findElement(State).click();
	  Thread.sleep(2000);
	  driver.findElement(Statesearch).sendKeys("Kedah");
	  Thread.sleep(2000);
	  driver.findElement(Stateselect).click();
	  
	  //City
	  Thread.sleep(2000);
	  driver.findElement(City).click();
	  Thread.sleep(2000);
	  driver.findElement(Citysearch).sendKeys("Kulim");
	  Thread.sleep(2000);
	  driver.findElement(Cityselect).click();
	  
	//Address
	  Thread.sleep(3000);
	  driver.findElement(Address).sendKeys(AddressPar);
	  //Area
	  Thread.sleep(2000);
	  driver.findElement(Area).click();
	  Thread.sleep(2000);
	  driver.findElement(Areasearch).sendKeys("Sample");
	  Thread.sleep(2000);
	  driver.findElement(Areaselect).click();	  
	  //CheckBox
	  Thread.sleep(2000);
	  driver.findElement(Checkbox).click();
	  
	  //CountryCode
	  Thread.sleep(2000);
	  driver.findElement(Countrycode).click();
	  Thread.sleep(2000);
	  driver.findElement(Codesearch).sendKeys("+61");
	  Thread.sleep(2000);
	  driver.findElement(Codeselect).click();
	  
	//Gender
	  Thread.sleep(5000);
	  driver.findElement(Gender1).click();
	  Thread.sleep(2000);
	  driver.findElement(Gender1search).sendKeys("MALE");
	  Thread.sleep(2000);
	  driver.findElement(Gender1select).click();
	  
	  //Save
	  Thread.sleep(2000);
	  driver.findElement(Saveclick).click();
	  Thread.sleep(2000);
	  driver.findElement(Confirmclick).click();
	  
	  //TabSwitch
	  Thread.sleep(5000);
      String windowHandle = driver.getWindowHandle();

      //Get the list of window handles

      ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());

      //Use the list of window handles to switch between windows
      Thread.sleep(1000);
      driver.switchTo().window((String)tabs.get(0));
      
      Thread.sleep(4000);
      
      
  }
}
