package stepdefination;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;

public class StepDefination {
	WebDriver driver;
	LoginPage lp = new LoginPage ()	;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		System.out.println("Open browser and navigate to login page ");
	    lp.openBrowser();
	    lp.openLoginPage();
	    
	}

	@When("^title of the page is Amazon Sign In$")
	public void title_of_the_page_is_Amazon_Sign_In(String title) throws Throwable {
		System.out.println("verify the title of the page ");
		String expectedTitle = title;
	    String actualTitle = lp.getTitle();
	    Assert.assertEquals(expectedTitle, actualTitle);
		
	}

	@Then("^user enters cndncddmvfvf@gmail\\.com$")
	public void user_enters_cndncddmvfvf_gmail_com(String email) throws Throwable {
		System.out.println("Enter email ");
	    lp.enterEmail(email);
		
	}

	@Then("^user clicks on continue$")
	public void user_clicks_on_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on continue");
		lp.clickoncontinue();
	}

	@Then("^user puts their password fkffjdhsdfdkfhdf$")
	public void user_puts_their_password_fkffjdhsdfdkfhdf(String password) throws Throwable {
		System.out.println("Enter password");
		lp.enterPassword(password);
	}

	@Then("^user clicks on sign-in$")
	public void user_clicks_on_sign_in() throws Throwable {
		System.out.println("Click on sign-in");
		lp.clickonsignin();
	}

	@Then("^user is now getting error message$")
	public void user_is_now_getting_error_message() throws Throwable {
		System.out.println(" Verify the error message");
		String expectedErr1 = "There was a problem"  ;
		String expectedErr2 = "Your password is incorrect";
		String expectedErr = expectedErr1 + expectedErr2 ;
		String actualErr = lp.readError();
		Assert.assertEquals(expectedErr, actualErr);
	}

	@Then("^user quits$")
	public void user_quits() throws Throwable {
		System.out.println("Close the browser");
		lp.CloseBrowser();
	}

}
