package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SPINCO");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SOMASUNDARAM");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SELVARAJ");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SOMASUNDARAM S");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("3+ Yrs");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("somumcr07@gmail.com");
		
		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select dd = new Select(stateDropdown);
		
		dd.selectByVisibleText("Alabama");

		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("EVIDIAN");
	
		driver.findElement(By.id("createLeadForm_firstName")).clear();

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SOMU");

		driver.findElement(By.name("submitButton")).click();

		String title1 = driver.getTitle();
		
		System.out.println(title1);

	}

}
