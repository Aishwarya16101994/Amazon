package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class LoginPage {
	
WebDriver driver;

public void openBrowser() {
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
	   driver = new FirefoxDriver(); 
}

public void openLoginPage() {
	driver.get("https://www.amazon.ca/ap/signin");
}

public String getTitle() {
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
	return actualtitle;
	
}

public void enterEmail(String email) {
	driver.findElement(By.id("ap_email")).sendKeys(email);
}

public void clickoncontinue() {
	driver.findElement(By.id("continue")).click();
}
public void enterPassword(String password) {
	driver.findElement(By.id("ap_password")).sendKeys(password);
}
public void clickonsignin() throws InterruptedException {
	driver.findElement(By.id("signInSubmit")).click();
	Thread.sleep(5000);
}

public String readError() {
	//String expectedErr1 = "There was a problem"  ;
	//String expectedErr2 = "Your password is incorrect";
	//String expectedErr = expectedErr1 + expectedErr2 ;
	String actualErr = driver.findElement(By.xpath("//div[@id='auth-error-message-box']//div[@class='a-box-inner a-alert-container']")).getText();
	System.out.println(actualErr);
	return actualErr;
}

public void CloseBrowser() {
	driver.quit();
}

}
