package front.Pages;

import front.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {

    //Página de registro
    protected static final String registerLinkLocator = "/html/body/div[1]/div[3]/div[1]/div/p[2]/a"; // locator: xpath

    //Campos do Formulário
    //First Name
    protected static final String firstNameInputLocator = "customer.firstName"; // locator: ID
    //Last Name
    protected static final String lastNameInputLocator = "customer.lastName"; // locator: ID
    //Address
    protected static final String addressInputLocator = "customer.address.street"; // locator: ID
    //City
    protected static final String cityInputLocator = "customer.address.city"; // locator: ID
    //State
    protected static final String stateInputLocator = "customer.address.state"; // locator: ID
    //Zip Code
    protected static final String zipCodeInputLocator = "customer.address.zipCode"; // locator: ID
    //Phone Number
    protected static final String phoneNumberInputLocator = "customer.phoneNumber"; // locator: ID
    //Phone Number
    protected static final String ssnInputLocator = "customer.ssn"; // locator: ID
    //Username
    protected static final String usernameInputLocator = "customer.username"; // locator: ID
    //Password
    protected static final String passwordInputLocator = "customer.password"; // locator: ID
    //Confirm Password
    protected static final String passwordConfInputLocator = "repeatedPassword"; // locator: ID
    //Register button
    protected static final String registerBtnLocator = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"; // locator: xpath
    //Message of registration was created successfully
    protected static final String confirmationMessageLocator = "//*[@id=\"rightPanel\"]/p"; // locator: xpath

    //Infos
    protected static final String firstName = "Bree";
    protected static final String lastName = "Franks";
    protected static final String address = "P.O. Box 766, 1148 Imperdiet Street";
    protected static final String city = "Nova Scotia";
    protected static final String state = "Colombia";
    protected static final String zipCode = "3713";
    protected static final String phoneNumber = "(234) 986-9921";
    protected static final String ssn = "10";
    protected static final String username = "breefranks30";
    protected static final String password = "bree1";

    public void openRegisterPage() throws InterruptedException {
        WebElement registerLink = getWebElement(By.xpath(registerLinkLocator));
        Thread.sleep(2000);
        registerLink.click();
        Thread.sleep(2000);
    }

    public void insertPersonalInfoIntoForm() throws InterruptedException {
        //Coletando os inputs
        WebElement firstNameInput = getWebElement(By.id(firstNameInputLocator));
        WebElement lastNameInput = getWebElement(By.id(lastNameInputLocator));
        WebElement addressInput = getWebElement(By.id(addressInputLocator));
        WebElement cityInput = getWebElement(By.id(cityInputLocator));
        WebElement stateInput = getWebElement(By.id(stateInputLocator));
        WebElement zipCodeInput = getWebElement(By.id(zipCodeInputLocator));
        WebElement phoneNumberInput = getWebElement(By.id(phoneNumberInputLocator));
        WebElement ssnInput = getWebElement(By.id(ssnInputLocator));
        WebElement usernameInput = getWebElement(By.id(usernameInputLocator));
        WebElement passwordInput = getWebElement(By.id(passwordInputLocator));
        WebElement passwordConfInput = getWebElement(By.id(passwordConfInputLocator));
        Thread.sleep(1500);
        //Ação
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        stateInput.sendKeys(state);
        zipCodeInput.sendKeys(zipCode);
        phoneNumberInput.sendKeys(phoneNumber);
        ssnInput.sendKeys(ssn);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        passwordConfInput.sendKeys(password);
    }

    public void confirmRegistration() {
        WebElement registerBtn = getWebElement(By.xpath(registerBtnLocator));
        registerBtn.click();
    }
    public String checkIfRegistrationWasSuccessful() throws InterruptedException {
        WebElement confirmationMessage = getWebElement(By.xpath(confirmationMessageLocator));
        return confirmationMessage.getText();
    }
}
