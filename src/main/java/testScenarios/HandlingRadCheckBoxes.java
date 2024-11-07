package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HandlingRadCheckBoxes {
	
	@Test
	public void radChkBoxes()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement radBMW=driver.findElement(By.id("bmwradio"));
		radBMW.click();
		if(radBMW.isSelected())
		{
			System.out.println("BMW Radio button is selected..");
		}
		WebElement chkBenz=driver.findElement(By.id("benzcheck"));
		chkBenz.click();
		if(chkBenz.isSelected())
		{
			System.out.println("Benz checkbox is selected..");
		}
		WebElement chkHonda=driver.findElement(By.id("hondacheck"));
		chkHonda.click();
		if(chkHonda.isSelected())
		{
			System.out.println("Honda Checkbox is selected..");
		}
		driver.quit();
		
	}

}
