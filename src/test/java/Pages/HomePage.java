package Pages;

import Utilities.Gwd;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Parent{

    public HomePage() {
        PageFactory.initElements(Gwd.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(id = "customer.firstName")
    private WebElement firstName;

    @FindBy(id = "customer.lastName")
    private WebElement lastName;

    @FindBy(id = "customer.address.street")
    private WebElement customerAddressStreet;

    @FindBy(id = "customer.address.city")
    private WebElement customerAddressCity;

    @FindBy(id = "customer.address.state")
    private WebElement customerAddressState;

    @FindBy(id = "customer.address.zipCode")
    private WebElement customerAddressZipCode;

    @FindBy(id = "customer.phoneNumber")
    private WebElement customerPhoneNumber;

    @FindBy(id = "customer.ssn")
    private WebElement customerSsn;

    @FindBy(id = "customer.username")
    private WebElement userName;

    @FindBy(id = "customer.password")
    private WebElement password;

    @FindBy(id = "repeatedPassword")
    private WebElement repeatedPassword;

    @FindBy(css = "[value='Register']")
    private WebElement registerButton;

    @FindBy(css = "[id='rightPanel']>p")
    private WebElement successMessage;

    @FindBy(name = "username")
    private WebElement usernameLogin;

    @FindBy(name = "password")
    private WebElement passwordLogin;

    @FindBy(css = "[value='Log In']")
    private WebElement loginButton;

    @FindBy(css = "[id='leftPanel']>p")
    private WebElement welcomeMessage;

    @FindBy(css = "[class='title']")
    private WebElement loginErrorMessage;

    @FindBy(linkText = "Bill Pay")
    private WebElement billPayLink;

    @FindBy(name = "payee.name")
    private WebElement payeeName;

    @FindBy(name = "payee.address.street")
    private WebElement payeeAddressStreet;

    @FindBy(name = "payee.address.city")
    private WebElement payeeAddressCity;

    @FindBy(name = "payee.address.state")
    private WebElement payeeAddressState;

    @FindBy(name = "payee.address.zipCode")
    private WebElement payeeAddressZipcode;

    @FindBy(name = "payee.phoneNumber")
    private WebElement payeePhoneNumber;

    @FindBy(name = "payee.accountNumber")
    private WebElement payeeAccountNumber;

    @FindBy(name = "verifyAccount")
    private WebElement verifyAccount;

    @FindBy(name = "amount")
    private WebElement amount;

    @FindBy(css = "[value='Send Payment']")
    private WebElement sendPayment;

    @FindBy(css = "[ng-show='showResult']>h1")
    private WebElement paymentSuccessful;

    WebElement myElement;
    public void findAndSend(String strElement, String value) {
        switch (strElement)
        {
            case "firstname"                : myElement=firstName; break;
            case "lastname"                 : myElement=lastName; break;
            case "customerAddressStreet"    : myElement=customerAddressStreet; break;
            case "customerAddressCity"      : myElement=customerAddressCity; break;
            case "customerAddressState"     : myElement=customerAddressState; break;
            case "customerAddressZipCode"   : myElement=customerAddressZipCode; break;
            case "customerPhoneNumber"      : myElement=customerPhoneNumber; break;
            case "customerSsn"              : myElement=customerSsn; break;
            case "userName"                 : myElement=userName; break;
            case "password"                 : myElement=password; break;
            case "repeatedPassword"         : myElement=repeatedPassword; break;
            case "usernameLogin"            : myElement=usernameLogin; break;
            case "passwordLogin"            : myElement=passwordLogin; break;
            case "payeeName"                : myElement=payeeName; break;
            case "payeeAddressStreet"       : myElement=payeeAddressStreet; break;
            case "payeeAddressCity"         : myElement=payeeAddressCity;break;
            case "payeeAddressState"        : myElement=payeeAddressState; break;
            case "payeeAddressZipcode"      : myElement=payeeAddressZipcode; break;
            case "payeePhoneNumber"         : myElement=payeePhoneNumber; break;
            case "payeeAccountNumber"       : myElement=payeeAccountNumber; break;
            case "verifyAccount"            : myElement=verifyAccount; break;
            case "amount"                   : myElement=amount; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement)
        {
            case "registerLink"   : myElement=registerLink; break;
            case "registerButton" : myElement=registerButton; break;
            case "loginButton"    : myElement=loginButton; break;
            case "billPayLink"    : myElement=billPayLink; break;
            case "sendPayment"    : myElement=sendPayment; break;
        }
        clickFunction(myElement);
    }
    public void findAndContainsText(String strElement, String text) {
        switch (strElement)
        {
            case "successMessage"    : myElement = successMessage; break;
            case "welcomeMessage"    : myElement = welcomeMessage; break;
            case "loginErrorMessage" : myElement = loginErrorMessage; break;
            case "paymentSuccessful" : myElement = paymentSuccessful; break;
        }
        verifyContainsText(myElement, text);
    }

}
