package week2.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1500);
		WebElement create = driver.findElement(By.linkText("Create new account"));
		Thread.sleep(1500);
		create.click();
		Thread.sleep(1500);
		WebElement firstNameField = driver.findElement(By.name("firstname"));
		Thread.sleep(1500);
		firstNameField.sendKeys("SUGANYA");
		Thread.sleep(1500);
		WebElement lastNameField = driver.findElement(By.name("lastname"));
		Thread.sleep(1500);
		lastNameField.sendKeys("DEVI");
		Thread.sleep(1500);
		WebElement mobileNumberField = driver.findElement(By.name("reg_email__"));
		Thread.sleep(1500);
		mobileNumberField.sendKeys("9600471243");
		Thread.sleep(1500);
		WebElement passwordField = driver.findElement(By.name("reg_passwd__"));
		Thread.sleep(1500);
		passwordField.sendKeys("password123");
		Thread.sleep(1500);
		Select dayDropdown = new Select(driver.findElement(By.id("day")));
		Thread.sleep(1500);
		dayDropdown.selectByValue("26");
		Thread.sleep(1500);
		Select monthDropdown = new Select(driver.findElement(By.id("month")));
		Thread.sleep(1500);
		monthDropdown.selectByValue("3");
		Thread.sleep(1500);
		Select yearDropdown = new Select(driver.findElement(By.id("year")));
		Thread.sleep(1500);
		yearDropdown.selectByValue("1990");
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
		Thread.sleep(1500);
		femaleRadioButton.click();

	}

}
