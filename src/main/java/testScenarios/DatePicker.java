package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DatePicker {
@Test
public void selData() throws InterruptedException
{
	WebDriver driver = new EdgeDriver();
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	Integer yr=2020;
	driver.findElement(By.id("datepicker")).click();
	//20 January 2025
	while(true)
	{
		String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
		String year=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
		System.out.println("Month="+month+"\t"+"Year="+year);
		if(year.equals(String.valueOf(yr)) && month.equals("January"))
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a")).click();
			break;
		}
		if(yr<=2024)
		{
			//click on Previous button
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		}
		else
		{
			//click on the next button
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		}
	}
	Thread.sleep(5000);
	driver.quit();
	
}
}
