package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		Thread.sleep(1500);
		/* WebElement email = */ driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		/* Thread.sleep(1500); */
		/* email.click(); */
		driver.findElement(By.xpath("//label[text()='Email Address:']/following::input")).sendKeys("somuece07@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1500);
		WebElement firstLeadName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		Thread.sleep(1500);
		String capturedName = firstLeadName.getText();
		Thread.sleep(1500);
		firstLeadName.click();
		Thread.sleep(1500);
		WebElement duplicateLeadButton = driver.findElement(By.xpath("//a[@class='subMenuButton']"));
		Thread.sleep(1500);
		duplicateLeadButton.click();
		Thread.sleep(1500);
		String expectedTitle = "Duplicate Lead";
		Thread.sleep(1500);
		String actualTitle = driver.getTitle();
		Thread.sleep(1500);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title verification successful");
		} else {
			System.out.println("Title verification failed");
		}
		Thread.sleep(1500);
		WebElement createLeadButton = driver.findElement(By.xpath("//input[@value='Create Lead']"));
		Thread.sleep(1500);
		createLeadButton.click();
		Thread.sleep(1500);
		WebElement duplicatedLeadName = driver.findElement(By.xpath("//*[@id=\"viewLead_firstName_sp\"]"));
		Thread.sleep(1500);
		String actualName = duplicatedLeadName.getText();
		Thread.sleep(1500);
		if (actualName.equals(capturedName)) {
			System.out.println("Duplicate lead name verification successful");
		} else {
			System.out.println("Duplicate lead name verification failed");
		}

		driver.close();
	}

}