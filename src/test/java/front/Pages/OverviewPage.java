package front.Pages;

import front.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OverviewPage extends BasePage {

    protected static final String overviewLinkLocator = "//*[@id=\"leftPanel\"]/ul/li[2]/a"; // locator: xpath
    protected static final String textBalanceLocator = "//*[@id=\"accountTable\"]/tfoot/tr/td"; // locator: xpath

    public void goToOverviewPage() {
        WebElement overviewLink = getWebElement(By.xpath(overviewLinkLocator));
        overviewLink.click();
    }

    public String checkIfBalanceIsPresent() {
        WebElement textBalance = getWebElement(By.xpath(textBalanceLocator));
        return textBalance.getText();
    }

}
