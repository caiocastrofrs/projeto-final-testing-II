package front.Tests;


import front.Pages.AccountPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNewAccount {

    private static EdgeDriver driver;
    private static AccountPage accountPage;

    @BeforeAll
    public static void setUp() {
        accountPage = new AccountPage();
        accountPage.openWebSite();
        driver = accountPage.getDriver();
    }


    @Test
    @Tag("Regression")
    @Order(2)
    public void testNewAccount() throws InterruptedException {
        accountPage.login("breefranks30","bree1");
        Thread.sleep(2000);
        accountPage.goToOpenNewAccountPage();
        Thread.sleep(2000);
        accountPage.insertSavingOption();
        Thread.sleep(2000);
        accountPage.confirmTheNewAccount();
        Thread.sleep(2000);
        String message = accountPage.checkIfAccountWasCreatedSuccessfully();
        assertTrue(message.contains("Congratulations, your account is now open."));
    }
    @AfterAll
    public static void tearDown() {
       driver.quit();
    }
}
