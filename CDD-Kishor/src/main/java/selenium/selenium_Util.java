package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium_Util 
{
     WebDriver driver;
     
     public void lauchUrl(String Url)
     {
    	 System.setProperty("webdriver.chrome.driver", "D:\\Jar\\Chrome Driver\\chromedriver.exe");
 		 driver= new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get(Url);
     }
	
     public void automation_Form(String Fname, String Lname)
     {
    	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Fname);
 		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(Lname);
 		/*//driver.findElement(By.xpath("//input[@value='Male']")).click();
 		// Action button to select gender
 		WebElement element = driver.findElement(By.xpath("//input[@value='Male']"));
 		Actions actions = new Actions(driver);
 		actions.moveToElement(element).click().perform();
 		driver.findElement(By.xpath("//input[@value='Male']")).click();
 		//another Action class for radio button
 		WebElement element1 = driver.findElement(By.xpath("//input[@id='exp-5']"));
 		Actions actions1 = new Actions(driver);
 		actions1.moveToElement(element1).click().perform();
 		//driver.findElement(By.xpath("//input[@id='exp-5']")).click();
 		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("2/2/2019");
 		//driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
 		driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
 		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();*/
 		java.util.List<WebElement> wElement= driver.findElements(By.xpath("//select[@id='continents']"));
 		Select oSelection=new Select((WebElement) wElement);
 		oSelection.getOptions();	
     }
	public static void main(String[] args) 
	{
		selenium_Util su= new selenium_Util();
		su.lauchUrl("https://www.toolsqa.com/automation-practice-form/");
        su.automation_Form("Kishor", "Savangikar");
	}

}
