package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPaySteps {
    HomePage homePage=new HomePage();
    @When("Navigate to Bill Pay Page")
    public void navigateToBillPayPage() {
        homePage.findAndClick("billPayLink");
    }
    @When("Pay {string} bills of {string}")
    public void payBillsOf(String billType, String amount) {
        homePage.findAndSend("payeeName",billType);
        homePage.findAndSend("payeeAddressStreet","eyup");
        homePage.findAndSend("payeeAddressCity","istanbul");
        homePage.findAndSend("payeeAddressState","turkiye");
        homePage.findAndSend("payeeAddressZipcode","34535");
        homePage.findAndSend("payeePhoneNumber","34535436345");
        homePage.findAndSend("payeeAccountNumber","3748934");
        homePage.findAndSend("verifyAccount","3748934");
        homePage.findAndSend("amount",amount);
        homePage.findAndClick("sendPayment");
    }
    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        homePage.findAndContainsText("paymentSuccessful","Complete");
    }


}
