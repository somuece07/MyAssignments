package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("9600471242");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"ext-gen242\"]")).click();
		Thread.sleep(1500);
		WebElement firstResultingLead = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td[1])[1]/div/a"));
		Thread.sleep(1500);
		String capturedLeadID = firstResultingLead.getText();
		Thread.sleep(1500);
		firstResultingLead.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[@class='subMenuButton']/following-sibling::a)[3]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		Thread.sleep(1500);
		WebElement leadID = driver.findElement(By.name("id"));
		Thread.sleep(1500);
		leadID.sendKeys(capturedLeadID);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1500);
		WebElement verifyMessage = driver.findElement(By.xpath("//div[text()='No records to display']"));
		Thread.sleep(1500);
        String message = verifyMessage.getText();
        Thread.sleep(1500);
        if (message.equals("No records to display")) {
            System.out.println("Lead has been successfully deleted");
        } else {
            System.out.println("Lead deletion was not successful");
        }
		driver.close();
	}

}
