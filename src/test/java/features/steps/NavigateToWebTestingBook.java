package features.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.CustomerSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by mior on 01/04/16.
 */
public class NavigateToWebTestingBook {
    @Steps
    CustomerSteps customer;

    @When("I choose the web testing handbook link")
    public void customerchoosesWebTestingHandbook(){
        customer.chooses_web_testing_handbook_link();
    }

    @Then("I can navigate to '(.*)' page successfully")
    public void customerCanNavigateSuccessfully(String link){
        customer.can_navigate_successfully(link);
    }
}
