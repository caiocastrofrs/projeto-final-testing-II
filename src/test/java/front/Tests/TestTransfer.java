package front.Tests;

import front.Pages.FundsPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTransfer {
    private static EdgeDriver driver;
    private static FundsPage fundsPage;

    @BeforeAll
    public static void setUp() {
        fundsPage = new FundsPage();
        fundsPage.openWebSite();
        driver = fundsPage.getDriver();
    }


    @Test
    @Tag("Regression")
    @Order(4)
    public void testTransfer() throws InterruptedException {
        fundsPage.login("breefranks30","bree1");
        Thread.sleep(2000);
        fundsPage.goToFundsPage();
        Thread.sleep(2000);
        String text = fundsPage.checkPage();
        assertTrue(text.contains("Transfer Funds"));
        Thread.sleep(2000);
        fundsPage.fillAmountInput();
        Thread.sleep(2000);
        fundsPage.selectFirstAccount();
        Thread.sleep(2000);
        fundsPage.selectSecondAccount();
        Thread.sleep(2000);
        fundsPage.confirmTransfer();
        Thread.sleep(2000);
        String message = fundsPage.checkIfTransferWasSuccessful();
        Thread.sleep(2000);
        assertTrue(message.contains("Transfer Complete!"));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
