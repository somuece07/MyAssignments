package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("Create Contact")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("firstNameField")).sendKeys("ROHIT");
		Thread.sleep(1500);
		driver.findElement(By.id("lastNameField")).sendKeys("Baskar");
		Thread.sleep(1500);
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Rohit");
		Thread.sleep(1500);
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("B");
		Thread.sleep(1500);
		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		Thread.sleep(1500);
		driver.findElement(By.id("createContactForm_description")).sendKeys("Electonics & Communication");
		Thread.sleep(1500);
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("rohitbaskar@gmail.com");
		Thread.sleep(1500);
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Thread.sleep(1500);
		Select dd = new Select(state);
		Thread.sleep(1500);
		dd.selectByVisibleText("Alabama");
		Thread.sleep(1500);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("//body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("updateContactForm_description")).clear();
		Thread.sleep(1500);
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("ECE");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(1500);
		String title = driver.getTitle();
		Thread.sleep(1500);
		System.out.println(title);
	}
}
