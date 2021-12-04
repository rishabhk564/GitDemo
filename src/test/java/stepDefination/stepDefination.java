package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	

    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
       System.out.println("Validate the browse");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Check if browser is starte");
    }

	@Given("User is on landing page")
	public void user_is_on_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on landing page");
	}
	@When("User login into application with {string} and {string}")
	public void user_login_into_application_with_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		System.out.println(string2);
	    
	}
	@Then("Home page is populated")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is populated");
	}
	@And("Cards are displayed {string}")
	public void cards_are_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}
	@When("^User login in to application with (.+) and (.+)$")
	public void user_login_into_application_with_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(username);
	   System.out.println(password);
	
}}
