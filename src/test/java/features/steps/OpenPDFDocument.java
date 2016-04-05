package features.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.CustomerSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by mior on 01/04/16.
 */
public class OpenPDFDocument {
    @Steps
    CustomerSteps customer;

    @When("I navigate to the PDF document")
    public void customerNavigatesToThePDFDocument(){ customer.navigates_to_the_PDF_document();}

    @Then("I am able to open PDF document successfully")
    public void customerIsAbleToOpenPDFDocumentSuccessfully(){ customer.is_able_to_open_PDF_document_successfully();}

}
