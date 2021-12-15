$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BankTest.feature");
formatter.feature({
  "line": 1,
  "name": "XYZ Bank Test",
  "description": "As a user I am on home page and i am able to check all function perform by bank manager and customer of bank",
  "id": "xyz-bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4936987400,
  "status": "passed"
});
formatter.scenario({
  "line": 85,
  "name": "Customer Should Withdraw Money Successfully",
  "description": "",
  "id": "xyz-bank-test;customer-should-withdraw-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 84,
      "name": "@Case5"
    },
    {
      "line": 84,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 86,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 87,
  "name": "I click on bank manager login  tab",
  "keyword": "When "
});
formatter.step({
  "line": 88,
  "name": "I click on add customer tab",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "I enter first name \"james\"",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "I enter last name \"ore\"",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "I enter post code \"40001\"",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "I click on add customer button",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "I see popup window verify message \"Customer added successfully with customer id :6\" and click on it",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "I click on home button",
  "keyword": "When "
});
formatter.step({
  "line": 95,
  "name": "I click on bank manager login  tab",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "I click on open account tab",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "I search customer which i already created by value\"6\"",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "I select currency \"Pound\"",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "I click on process button",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "I see popup window verify message \"Account created successfully with account Number :1016\" and click on it",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "I click on home button",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "I click on customer login tab",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "I search customer which i already created by value\"6\"",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "I should verify logout button is display and click on it",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "I click on home button",
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "I click on customer login tab",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "I search customer which i already created by value\"6\"",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "I click on deposit tab",
  "keyword": "And "
});
formatter.step({
  "line": 111,
  "name": "I enter amount \"100\"",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "I click on deposit  button",
  "keyword": "And "
});
formatter.step({
  "line": 113,
  "name": "I should verify message \"Deposit Successful\"",
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "I click on home button",
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "I click on customer login tab",
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "I search customer which i already created by value\"6\"",
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "I click on withdrawal tab",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "I enter withdrawal amount \"50\"",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "I click on withdrawal button",
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "I verify withdrawal message \"Transaction successful\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 194851400,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 2130984100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnAddCustomerTab()"
});
formatter.result({
  "duration": 631053800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "james",
      "offset": 20
    }
  ],
  "location": "BankTestSteps.iEnterFirstName(String)"
});
formatter.result({
  "duration": 323289400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ore",
      "offset": 19
    }
  ],
  "location": "BankTestSteps.iEnterLastName(String)"
});
formatter.result({
  "duration": 99847200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "40001",
      "offset": 19
    }
  ],
  "location": "BankTestSteps.iEnterPostCode(String)"
});
formatter.result({
  "duration": 96429100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 86490000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer added successfully with customer id :6",
      "offset": 35
    }
  ],
  "location": "BankTestSteps.iSeePopupWindowVerifyMessageAndClickOnIt(String)"
});
formatter.result({
  "duration": 26349900,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnHomeButton()"
});
formatter.result({
  "duration": 2100735100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 2095178500,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnOpenAccountTab()"
});
formatter.result({
  "duration": 82438600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 51
    }
  ],
  "location": "BankTestSteps.iSearchCustomerWhichIAlreadyCreatedByValue(String)"
});
formatter.result({
  "duration": 326037600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pound",
      "offset": 19
    }
  ],
  "location": "BankTestSteps.iSelectCurrency(String)"
});
formatter.result({
  "duration": 124434300,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnProcessButton()"
});
formatter.result({
  "duration": 86229800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account created successfully with account Number :1016",
      "offset": 35
    }
  ],
  "location": "BankTestSteps.iSeePopupWindowVerifyMessageAndClickOnIt(String)"
});
formatter.result({
  "duration": 16541300,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnHomeButton()"
});
formatter.result({
  "duration": 2097968800,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 83301900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 51
    }
  ],
  "location": "BankTestSteps.iSearchCustomerWhichIAlreadyCreatedByValue(String)"
});
formatter.result({
  "duration": 370921000,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 80687400,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iShouldVerifyLogoutButtonIsDisplayAndClickOnIt()"
});
formatter.result({
  "duration": 272163500,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnHomeButton()"
});
formatter.result({
  "duration": 2104585000,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 81373400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 51
    }
  ],
  "location": "BankTestSteps.iSearchCustomerWhichIAlreadyCreatedByValue(String)"
});
formatter.result({
  "duration": 115855800,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 87214900,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnDepositTab()"
});
formatter.result({
  "duration": 79333600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 16
    }
  ],
  "location": "BankTestSteps.iEnterAmount(String)"
});
formatter.result({
  "duration": 739982600,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnDepositButton()"
});
formatter.result({
  "duration": 90338900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit Successful",
      "offset": 25
    }
  ],
  "location": "BankTestSteps.iShouldVerifyMessage(String)"
});
formatter.result({
  "duration": 54302300,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnHomeButton()"
});
formatter.result({
  "duration": 2093426600,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 75240500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 51
    }
  ],
  "location": "BankTestSteps.iSearchCustomerWhichIAlreadyCreatedByValue(String)"
});
formatter.result({
  "duration": 107015400,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 85544100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnWithdrawalTab()"
});
formatter.result({
  "duration": 82263900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 27
    }
  ],
  "location": "BankTestSteps.iEnterWithdrawalAmount(String)"
});
formatter.result({
  "duration": 367630000,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnWithdrawalButton()"
});
formatter.result({
  "duration": 86324900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transaction successful",
      "offset": 29
    }
  ],
  "location": "BankTestSteps.iVerifyWithdrawalMessage(String)"
});
formatter.result({
  "duration": 47938600,
  "status": "passed"
});
formatter.after({
  "duration": 671531900,
  "status": "passed"
});
});