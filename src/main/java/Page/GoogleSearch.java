package Page;

import WebDriver.AbstractPage;
import io.qameta.allure.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoogleSearch extends AbstractPage {

    @FindBy(xpath = "//*[@name = 'q']")
    private WebElement SearchInput;

    @Step("input[{Name}]")
    public void setSearchInput(final String name) {


        for (int i = 0; i < 2; i++) {
            SearchInput.sendKeys(RandomStringUtils.randomAlphabetic(2));
        }
    }


}
