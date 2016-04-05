package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by mior on 18/03/16.
 */

@DefaultUrl("http://www.etsy.com")
public class HomePage extends PageObject {

    @FindBy(css = "button[value='Search']")
    WebElement searchButton;

    public void searchFor(String keywords) {
        $("#search-query").sendKeys(keywords);
        searchButton.click();
    }

}

