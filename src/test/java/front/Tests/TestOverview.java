package front.Tests;

import front.Pages.OverviewPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestOverview {

    private static EdgeDriver driver;
    private static OverviewPage overviewPage;

    @BeforeAll
    public static void setUp() {
        overviewPage = new OverviewPage();
        overviewPage.openWebSite();
        driver = overviewPage.getDriver();
    }

    @Test
    @Tag("Regression")
    @Order(3)
    public void testOverview() throws InterruptedException {
        overviewPage.login("breefranks30","bree1");
        Thread.sleep(2000);
        overviewPage.goToOverviewPage();
        Thread.sleep(2000);
        String message = overviewPage.checkIfBalanceIsPresent();
        Thread.sleep(2000);
        assertTrue(message.contains("*Balance includes deposits that may be subject to holds"));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
