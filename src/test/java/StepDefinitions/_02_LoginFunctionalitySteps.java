package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginFunctionalitySteps {
    HomePage homePage=new HomePage();
    @When("Login with a valid User name and Password")
    public void loginWithAValidUserNameAndPassword() {
        homePage.findAndSend("usernameLogin","horasanlim");
        homePage.findAndSend("passwordLogin","abc123456");
        homePage.findAndClick("loginButton");
    }

    @Then("Successfully login message should be displayed")
    public void successfullyLoginMessageShouldBeDisplayed() {
        homePage.findAndContainsText("welcomeMessage","Welcome");
    }

    @When("Login with User name as {string} and password as {string}")
    public void loginWithUserNameAsAndPasswordAs(String username, String password) {
        homePage.findAndSend("usernameLogin",username);
        homePage.findAndSend("passwordLogin",password);
        homePage.findAndClick("loginButton");
    }

    @Then("Invalid account message should be displayed")
    public void invalidAccountMessageShouldBeDisplayed() {
        homePage.findAndContainsText("loginErrorMessage","error");
    }
}
