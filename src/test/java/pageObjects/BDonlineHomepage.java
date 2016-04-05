package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by mior on 01/04/16.
 */

@DefaultUrl("http://bdonline.sqe.com")
public class BDonlineHomepage extends PageObject{

    @FindBy(xpath = "//a[@href='http://stickyminds.com/']")
    WebElementFacade stickyMindsLink;
    @FindBy(xpath = "//a[@href='documents/requirements.pdf']")
    WebElementFacade PDFLink;
    @FindBy(xpath = "//a[@href='http://sqe.com/webtesting/']")
    WebElementFacade webTestingHandbookLink;


    public String getPageTitle(){
        return this.getTitle();
    }

    public void navigatesToAnyLink(){
        stickyMindsLink.click();
    }

    public void clickOnPDFLink(){
        PDFLink.click();
    }

    public void navigateToWebTestingHandbook(){
        webTestingHandbookLink.click();
    }
}
