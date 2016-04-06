package features.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import pageObjects.BDonlineHomepage;


import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by mior on 01/04/16.
 */
public class CustomerSteps {
    BDonlineHomepage bdOnlineHomepage;
    String title;
    String parentHandle;

    @Step
    public void opens_bdonline_home_page() {
        bdOnlineHomepage.open();
    }

    @Step
    public void observes_page_title() {
        title = bdOnlineHomepage.getPageTitle();
    }

    @Step
    public void verifies_page_title(String pageTitle) {
        assertThat(title.contains(pageTitle));
    }

    @Step
    public void observes_hyperlink_exists(String link){
        assertThat(bdOnlineHomepage.getDriver().findElements(By.linkText(link)).size() > 0);
    }

    @Step
    public void navigates_to_any_link(){
        parentHandle = bdOnlineHomepage.getDriver().getWindowHandle();
        bdOnlineHomepage.navigatesToAnyLink();
    }

    @Step
    public  void is_able_to_navigate_successfully(){
        for (String winHandle : bdOnlineHomepage.getDriver().getWindowHandles()){
            bdOnlineHomepage.getDriver().switchTo().window(winHandle);
        }
        observes_page_title();
        assertThat(title.contains("StickyMinds"));
        bdOnlineHomepage.getDriver().close();
        bdOnlineHomepage.getDriver().switchTo().window(parentHandle);
    }

    @Step
    public void navigates_to_the_PDF_document(){
        bdOnlineHomepage.clickOnPDFLink();
    }

    @Step
    public void is_able_to_open_PDF_document_successfully(){
        assertThat(bdOnlineHomepage.getDriver().getCurrentUrl().contains("requirements.pdf"));
    }

    @Step
    public void chooses_web_testing_handbook_link(){
        bdOnlineHomepage.navigateToWebTestingHandbook();
    }

    @Step
    public void can_navigate_successfully(String link){
        observes_page_title();
        assertThat(title.contains(link));
    }
}
