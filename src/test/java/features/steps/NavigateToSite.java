package features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.CustomerSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by mior on 01/04/16.
 */
public class NavigateToSite {
    @Steps
    CustomerSteps customer;

    @Given("I navigate to the website")
    public void customerNavigatesToWebsite() {
        customer.opens_bdonline_home_page();
    }

    @When("I observe the page title")
    public void customerObservesPageTitle() { customer.observes_page_title(); }

    @Then("I should observe the title is '(.*)'")
    public void customerVerifiesPageTitle(String pageTitle) { customer.verifies_page_title(pageTitle);}

    @Then("I should observe the hyperlink '(.*)' exists")
    public void customerObservesHyperlinkExists(String link){ customer.observes_hyperlink_exists(link);}

}
