package front.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public EdgeDriver driver;
    protected static final String URL = "https://parabank.parasoft.com/parabank/index.htm";
    protected static final String loginInputLocator = "//*[@id=\"loginPanel\"]/form/div[1]/input"; // locator: xpath
    protected static final String passwordInputLocator = "//*[@id=\"loginPanel\"]/form/div[2]/input"; // locator: xpath
    protected static final String loginBtnLocator = "//*[@id=\"loginPanel\"]/form/div[3]/input"; // locator: xpath

    public BasePage() {
        // Edge Driver
        System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver/msedgedriver");
        System.setProperty("webdriver.edge.verboseLogging", "true");
        EdgeDriverService service = EdgeDriverService.createDefaultService();
        driver = new EdgeDriver(service);
    }

    public void openWebSite() {
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public EdgeDriver getDriver() {
        return driver;
    }

    public WebElement getWebElement(By locator) {
        WebElement element = null;
        try {
            System.out.println("Locator: " + locator);
            System.out.println("Driver: " + driver);
            element = driver.findElement(locator);
        } catch (Exception e) {
            System.out.println("Elemento não encontrado, possívelmente problema no identificador");
            System.out.println("Mensagem de erro: " + e);
        }
        return element;
    }


    public void login(String login, String password) throws InterruptedException {
        WebElement loginInput = getWebElement(By.xpath(loginInputLocator));
        WebElement passwordInput = getWebElement(By.xpath(passwordInputLocator));
        WebElement loginBtn = getWebElement(By.xpath(loginBtnLocator));
        Thread.sleep(1500);
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        Thread.sleep(1500);
        loginBtn.click();
    }
}
