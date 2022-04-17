package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination{

    @Given("^User is an netBanking page$")
    public void user_is_an_netbanking_page() throws Throwable {
        System.out.println("ass");
    }

    @When("^User log into Applicationwith username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_log_into_applicationwith_username_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("ass"+strArg1+" "+strArg2); 
    }

    @Then("^Home Page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("ass");
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("ass");
    }

}