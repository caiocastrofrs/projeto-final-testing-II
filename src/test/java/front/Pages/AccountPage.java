package front.Pages;

import front.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {

    protected static final String openNewAccountLinkLocator = "//*[@id=\"leftPanel\"]/ul/li[1]/a"; // locator: xpath
    protected static final String optionSavingsLocator = "//*[@id=\"type\"]/option[2]"; // locator: xpath
    protected static final String openNewAccountBtnLocator = "//*[@id=\"rightPanel\"]/div/div/form/div/input"; //locator: xpath
    protected static final String confirmationMessageLocator = "//*[@id=\"rightPanel\"]/div/div/p[1]"; // locator: xpath


    public void goToOpenNewAccountPage () {
        WebElement openNewAccountLink = getWebElement(By.xpath(openNewAccountLinkLocator));
        openNewAccountLink.click();
    }

    public void insertSavingOption() {
        WebElement optionSavings = getWebElement(By.xpath(optionSavingsLocator));
        optionSavings.click();
    }

    public void confirmTheNewAccount() {
        WebElement openNewAccountBtn = getWebElement(By.xpath(openNewAccountBtnLocator));
        openNewAccountBtn.click();
    }

    public String checkIfAccountWasCreatedSuccessfully() {
        WebElement confirmationMessage = getWebElement(By.xpath(confirmationMessageLocator));
        return confirmationMessage.getText();
    }
}
