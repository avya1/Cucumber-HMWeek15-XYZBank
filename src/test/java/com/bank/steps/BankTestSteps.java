package com.bank.steps;

import com.bank.Case1TestRunner;
import com.bank.Case2TestRunner;
import com.bank.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_old.Ac;
import org.checkerframework.checker.units.qual.C;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class BankTestSteps {

    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^I click on bank manager login  tab$")
    public void iClickOnBankManagerLoginTab() throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().clickOnBankManagerLogin();
    }

    @And("^I click on add customer tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLogInPage().clickOnAddCustomerTab();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String FName)  {
        new AddCustomerPage().fillFirstName(FName);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String LName)  {
        new AddCustomerPage().fillLastName(LName);

    }

    @And("^I enter post code \"([^\"]*)\"$")
    public void iEnterPostCode(String PCode)  {
        new AddCustomerPage().fillPostCode(PCode);
    }

    @And("^I click on add customer button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }


    @And("^I see popup window verify message \"([^\"]*)\" and click on it$")
    public void iSeePopupWindowVerifyMessageAndClickOnIt(String message)  {
       new AddCustomerPage().verifyMessageAndAcceptIt(message);
    }

    @Given("^I repeat all steps of bank manage add customer successfully$")
    public void iRepeatAllStepsOfBankManageAddCustomerSuccessfully() throws InterruptedException {
        Thread T1 = new Thread(new Thread(() -> {
            JUnitCore jExecFeature = new JUnitCore();
            Result result = jExecFeature.run(Case1TestRunner.class);
        }));

        T1.start();
        T1.join();
    }

    @And("^I click on open account tab$")
    public void iClickOnOpenAccountTab() {
      new AccountPage().clickOnOpenAccount();
    }

    @And("^I search customer which i already created by value\"([^\"]*)\"$")
    public void iSearchCustomerWhichIAlreadyCreatedByValue(String value)  {
        new AccountPage().selectCustomerSearch(value);

    }

    @And("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String currency) {
      new AccountPage().selectCurrency(currency);
    }

    @And("^I click on process button$")
    public void iClickOnProcessButton() {
        new AccountPage().clickOnProcessButton();
    }


    @When("^I click on home button$")
    public void iClickOnHomeButton() throws InterruptedException {
        Thread.sleep(2000);
      new HomePage().clickOnHomeButton();

    }

    @And("^I click on bank manager login  tab to open account$")
    public void iClickOnBankManagerLoginTabToOpenAccount() {
        new HomePage().clickOnBankManagerLogin();
    }

    @And("^I click on customer login tab$")
    public void iClickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLogin();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @And("^I should verify logout button is display and click on it$")
    public void iShouldVerifyLogoutButtonIsDisplayAndClickOnIt() {
        new CustomerLoginPage().verifyLogOutTabAndClickOnLogOutTab();
    }

    @Given("^I repeat all steps of Bank manager should open account successfully$")
    public void iRepeatAllStepsOfBankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        Thread T1 = new Thread(new Thread(() -> {
            JUnitCore jExecFeature = new JUnitCore();
            Result result = jExecFeature.run(Case2TestRunner.class);
        }));

        T1.start();
        T1.join();
    }

    @And("^I click on deposit tab$")
    public void iClickOnDepositTab() {
        new CustomerPage().clickOnDeposit();
    }

    @And("^I enter amount \"([^\"]*)\"$")
    public void iEnterAmount(String amount)  {
        new CustomerPage().enterAmount100(amount);

    }

    @And("^I click on deposit  button$")
    public void iClickOnDepositButton() {
        new CustomerPage().clickOnDepositButtonLast();
    }

    @And("^I should verify message \"([^\"]*)\"$")
    public void iShouldVerifyMessage(String message) {
        new CustomerPage().verifyDepositSuccessfully(message);

    }


    @And("^I click on withdrawal tab$")
    public void iClickOnWithdrawalTab() {
        new CustomerPage().clickOnWithDraw();
    }

    @And("^I enter withdrawal amount \"([^\"]*)\"$")
    public void iEnterWithdrawalAmount(String arg0)  {
        new CustomerPage().enterWithDrawlAmount(arg0);

    }

    @And("^I click on withdrawal button$")
    public void iClickOnWithdrawalButton() {
        new CustomerPage().clickOnWithDrawlButton();
    }

    @Then("^I verify withdrawal message \"([^\"]*)\"$")
    public void iVerifyWithdrawalMessage(String message)  {
        new CustomerPage().verifyTransactionSuccessful(message);

    }
}
