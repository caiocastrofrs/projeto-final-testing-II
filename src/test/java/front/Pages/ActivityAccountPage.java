package front.Pages;

import front.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActivityAccountPage extends BasePage {

    protected static final String overviewAccountLinkLocator = "//*[@id=\"leftPanel\"]/ul/li[2]/a"; //locator: xpath
    protected static final String firstOptionAccountLocator = "//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a"; // locator: xpath
    protected static final String accountDetailsTextLocator = "//*[@id=\"rightPanel\"]/div/div[1]/h1"; // locator:  xpath
    protected static final String goBtnLocator = "//*[@id=\"rightPanel\"]/div/div[2]/form/table/tbody/tr[3]/td[2]/input"; //locator: xpath
    protected static final String creditLocator = "//*[@id=\"transactionTable\"]/tbody/tr[2]/td[4]"; //locator: xpath

    public void goToOverviewPage() {
        WebElement overviewAccount = getWebElement(By.xpath(overviewAccountLinkLocator));
        overviewAccount.click();
    }

    public void goToActivityPage() {
        WebElement firstOptionAccount = getWebElement(By.xpath(firstOptionAccountLocator));
        firstOptionAccount.click();
    }

    public String checkIfAccountDetailsTextIsPresent() {
        WebElement accountDetailsText = getWebElement(By.xpath(accountDetailsTextLocator));
        return accountDetailsText.getText();
    }

    public String checkIfTransferAppear() {
        WebElement credit = getWebElement(By.xpath(creditLocator));
        return credit.getText();
    }
    public void clickGoBtn() {
        WebElement goBtn = getWebElement(By.xpath(goBtnLocator));
        goBtn.click();
    }

}
