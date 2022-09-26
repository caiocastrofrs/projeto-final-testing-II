package front.Pages;

import front.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FundsPage extends BasePage {

    protected static final String fundsLinkLocator = "//*[@id=\"leftPanel\"]/ul/li[3]/a"; // locator: xpath
    protected static final String fundsTitleLocator = "//*[@id=\"rightPanel\"]/div/div/h1"; // locator:  xpath
    protected static final String amountInputLocator = "amount"; // locator: id
    protected static final String firstOptionAccountLocator = "//*[@id=\"fromAccountId\"]/option[1]"; //locator: xpath
    protected static final String secondOptionAccountLocator = "//*[@id=\"fromAccountId\"]/option[2]"; //locator: xpath
    protected static final String transferBtnLocator = "//*[@id=\"rightPanel\"]/div/div/form/div[2]/input"; // locator: xpath
    protected static final String resultTitleLocator = "//*[@id=\"rightPanel\"]/div/div/h1"; //locator: xpath
    protected static final String amount = "10";

    public void goToFundsPage() {
        WebElement fundsLink = getWebElement(By.xpath(fundsLinkLocator));
        fundsLink.click();
    }

    public String checkPage() {
        WebElement fundsTitle = getWebElement(By.xpath(fundsTitleLocator));
        return fundsTitle.getText();
    }

    public void fillAmountInput() {
        WebElement amountInput = getWebElement(By.id(amountInputLocator));
        amountInput.sendKeys(amount);
    }

    public void selectFirstAccount() {
        WebElement firstOptionAccount = getWebElement(By.xpath(firstOptionAccountLocator));
        firstOptionAccount.click();
    }

    public void selectSecondAccount() {
        WebElement secondOptionAccount = getWebElement(By.xpath(secondOptionAccountLocator));
        secondOptionAccount.click();
    }

    public void confirmTransfer() {
        WebElement transferBtn = getWebElement(By.xpath(transferBtnLocator));
        transferBtn.click();
    }

    public String checkIfTransferWasSuccessful() {
        WebElement resultTitle = getWebElement(By.xpath(resultTitleLocator));
        return resultTitle.getText();
    }

}
