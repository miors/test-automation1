package features.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.CustomerSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by mior on 01/04/16.
 */
public class NavigateToLink {
    @Steps
    CustomerSteps customer;

    @When("I navigate to any link")
    public void customerNavigatesToAnyLink(){ customer.navigates_to_any_link();}

    @Then("I am able to navigate successfully")
    public void customerIsAbleToNavigateSuccessfully(){ customer.is_able_to_navigate_successfully();}

}