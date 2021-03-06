package loginpackage;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Loginclass {
	@Test
  //main function
	public static void Main() {
		
			System.setProperty("webdriver.chrome.driver", "Missing Informaiton");
			
      //Code to handle notifcaitons and other pop ups in chrome browsee
			ChromeOptions options = new ChromeOptions();
			HashMap<String,Integer> contentSettings = new HashMap<String,Integer>();
			HashMap<String,Object> profile = new HashMap<String,Object>();
			HashMap<String,Object> prefs = new HashMap<String,Object>();
	        contentSettings.put("media_stream",2);
	        profile.put("managed_default_content_settings", contentSettings);
	        prefs.put("profile",profile);
	        options.setExperimentalOption("prefs", prefs);
			
      //declare are driver as google
	        ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://www.google.com");
			
      //declaring a variable for wait for 30 seconds if no conditions are satisfied
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      //wait until an element on the webpage is loaded in
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a")));
      //when loaded in click element
			WebElement signin = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a"));
			signin.click();
			
      //The rest of the code here follows this same basic format
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")));
			WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email.sendKeys("Removed");
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")));
			WebElement enext = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
			enext.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div/form/div[2]/div[1]/input")));
			WebElement studentID = driver.findElement(By.id("userNameInput"));
			studentID.sendKeys("Removed");
			WebElement networkpass = driver.findElement(By.id("passwordInput"));
			networkpass.sendKeys("Removed");
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div/form/div[2]/div[4]/span")));
			WebElement signin2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div/form/div[2]/div[4]/span"));
			signin2.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")));
			WebElement continuesn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
			continuesn.click();
			
			driver.get("Removed");
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[3]/div[2]/div/div[2]/button/span")));
			WebElement dismiss = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div[2]/button/span"));
			dismiss.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/c-wiz/div/div/div[9]/div[3]/div/div/div[2]/div[2]/div/div/span/span")));
			WebElement MeetSignIn = driver.findElement(By.xpath("/html/body/div[1]/c-wiz/div/div/div[9]/div[3]/div/div/div[2]/div[2]/div/div/span/span"));
			MeetSignIn.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[1]/div/div[1]/div/div[2]/div[2]")));
			WebElement myEmail = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[1]/div/div[1]/div/div[2]/div[2]"));
			myEmail.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[3]/div[2]/div/div[2]/button/span")));
			WebElement dismiss1 = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div[2]/button/span"));
			dismiss1.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/c-wiz/div/div/div[9]/div[3]/div/div/div[3]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/span")));
			WebElement JoinNow = driver.findElement(By.xpath("/html/body/div[1]/c-wiz/div/div/div[9]/div[3]/div/div/div[3]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/span"));
			JoinNow.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/c-wiz/div[1]/div/div[9]/div[3]/div[4]/div[2]/div[2]/div/div[5]/div/label/textarea")));
			WebElement chatbox = driver.findElement(By.xpath("/html/body/div[1]/c-wiz/div[1]/div/div[9]/div[3]/div[4]/div[2]/div[2]/div/div[5]/div/label/textarea"));
			chatbox.sendKeys("Hello");
			chatbox.sendKeys(Keys.ENTER);
			
	}
	
	
}
