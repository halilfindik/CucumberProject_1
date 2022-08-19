package StepDefinitions;

import Pages.HomePage;
import Utilities.Gwd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_SignUpSteps {

    HomePage homePage=new HomePage();

    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        Gwd.getDriver().get("https://parabank.parasoft.com/");
        Gwd.getDriver().manage().window().maximize();
    }

    @When("Create a new Account")
    public void createANewAccount() {
        homePage.findAndClick("registerLink");
        homePage.findAndSend("firstname", "Halil");
        homePage.findAndSend("lastname","FINDIK");
        homePage.findAndSend("customerAddressStreet","Bahcelievler");
        homePage.findAndSend("customerAddressCity","Istanbul");
        homePage.findAndSend("customerAddressState","Turkiye");
        homePage.findAndSend("customerAddressZipCode","34875");
        homePage.findAndSend("customerPhoneNumber","5329803843");
        homePage.findAndSend("customerSsn","00012384023");
        homePage.findAndSend("userName","horasanlim");
        homePage.findAndSend("password","abc123456");
        homePage.findAndSend("repeatedPassword","abc123456");
        homePage.findAndClick("registerButton");
    }

    @Then("User should create a new account successfully")
    public void userShouldCreateANewAccountSuccessfully() {
        homePage.findAndContainsText("successMessage","success");
    }
}
