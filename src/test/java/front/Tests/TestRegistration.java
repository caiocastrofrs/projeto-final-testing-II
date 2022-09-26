package front.Tests;

import front.Pages.RegisterPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRegistration {

    private static EdgeDriver driver;
    private static RegisterPage registerPage;

    @BeforeAll
    public static void setUp() {
        registerPage = new RegisterPage();
        registerPage.openWebSite();
        driver = registerPage.getDriver();
    }

    @Test
    @Tag("Smoke")
    @Order(1)
    public void testRegistration() throws InterruptedException {
        registerPage.openRegisterPage();
        Thread.sleep(1200);
        registerPage.insertPersonalInfoIntoForm();
        Thread.sleep(1200);
        registerPage.confirmRegistration();
        Thread.sleep(1200);
        String message = registerPage.checkIfRegistrationWasSuccessful();
        Thread.sleep(1200);
        assertTrue(message.contains("Your account was created successfully. You are now logged in."));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
