package front.Tests;

import front.Pages.ActivityAccountPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestActivityAccount {

    private static EdgeDriver driver;
    private static ActivityAccountPage activityAccountPage;

    @BeforeAll
    public static void setUp() {
        activityAccountPage = new ActivityAccountPage();
        activityAccountPage.openWebSite();
        driver = activityAccountPage.getDriver();
    }

    @Test
    @Tag("Regression")
    @Order(5)
    public void testActivityAccount() throws InterruptedException {
        activityAccountPage.login("breefranks30","bree1");
        Thread.sleep(2000);
        activityAccountPage.goToOverviewPage();
        Thread.sleep(2000);
        activityAccountPage.goToActivityPage();
        Thread.sleep(2000);
        String message = activityAccountPage.checkIfAccountDetailsTextIsPresent();
        assertTrue(message.contains("Account Details"));
        Thread.sleep(2000);
        activityAccountPage.clickGoBtn();
        Thread.sleep(2000);
        String credit = activityAccountPage.checkIfTransferAppear();
        assertTrue(credit.contains("$10.00"));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
