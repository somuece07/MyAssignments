package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//div[@id='label']//a[1]")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("SOMASUNDARAM");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10131']")).click();
		Thread.sleep(1500);
		String title = driver.getTitle();
		Thread.sleep(1500);
		System.out.println(title);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Evidian");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(1500);
		WebElement updatename = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		Thread.sleep(1500);
		System.out.println(updatename.getText());
		Thread.sleep(1500);
		driver.quit();

	}
}
