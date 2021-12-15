Feature: XYZ Bank Test
  As a user I am on home page and i am able to check all function perform by bank manager and customer of bank
  @Case1 @Smoke
  Scenario: Bank manager should add customer successfully
    Given I am on home page
    When  I click on bank manager login  tab
    And   I click on add customer tab
    And   I enter first name "james"
    And   I enter last name "ore"
    And   I enter post code "40001"
    And   I click on add customer button
    And   I see popup window verify message "Customer added successfully with customer id :6" and click on it
@Case2 @Sanity
  Scenario: Bank manager should open account successfully
 # Given I repeat all steps of bank manage add customer successfully
  Given I am on home page
  When  I click on bank manager login  tab
  And   I click on add customer tab
  And   I enter first name "james"
  And   I enter last name "ore"
  And   I enter post code "40001"
  And   I click on add customer button
  And   I see popup window verify message "Customer added successfully with customer id :6" and click on it
  When  I click on home button
  And   I click on bank manager login  tab
  And   I click on open account tab
  And   I search customer which i already created by value"6"
  And   I select currency "Pound"
  And   I click on process button
  And   I see popup window verify message "Account created successfully with account Number :1016" and click on it
  @Case3 @Sanity
  Scenario:Customer Should Login And Logout Successfully.
    #Given I repeat all steps of Bank manager should open account successfully
    Given I am on home page
    When  I click on bank manager login  tab
    And   I click on add customer tab
    And   I enter first name "james"
    And   I enter last name "ore"
    And   I enter post code "40001"
    And   I click on add customer button
    And   I see popup window verify message "Customer added successfully with customer id :6" and click on it
    When  I click on home button
    And   I click on bank manager login  tab
    And   I click on open account tab
    And   I search customer which i already created by value"6"
    And   I select currency "Pound"
    And   I click on process button
    And   I see popup window verify message "Account created successfully with account Number :1016" and click on it
    And   I click on home button
    And   I click on customer login tab
    And   I search customer which i already created by value"6"
    And   I click on login button
    And   I should verify logout button is display and click on it
@Case4 @Sanity
Scenario:Customer Should Deposit Money Successfully.
  Given I am on home page
  When  I click on bank manager login  tab
  And   I click on add customer tab
  And   I enter first name "james"
  And   I enter last name "ore"
  And   I enter post code "40001"
  And   I click on add customer button
  And   I see popup window verify message "Customer added successfully with customer id :6" and click on it
  When  I click on home button
  And   I click on bank manager login  tab
  And   I click on open account tab
  And   I search customer which i already created by value"6"
  And   I select currency "Pound"
  And   I click on process button
  And   I see popup window verify message "Account created successfully with account Number :1016" and click on it
  And   I click on home button
  And   I click on customer login tab
  And   I search customer which i already created by value"6"
  And   I click on login button
  And   I should verify logout button is display and click on it
  And   I click on home button
  And   I click on customer login tab
  And   I search customer which i already created by value"6"
  And   I click on login button
  And   I click on deposit tab
  And   I enter amount "100"
  And   I click on deposit  button
  And   I should verify message "Deposit Successful"
@Case5 @Regression
Scenario:Customer Should Withdraw Money Successfully
  Given I am on home page
  When  I click on bank manager login  tab
  And   I click on add customer tab
  And   I enter first name "james"
  And   I enter last name "ore"
  And   I enter post code "40001"
  And   I click on add customer button
  And   I see popup window verify message "Customer added successfully with customer id :6" and click on it
  When  I click on home button
  And   I click on bank manager login  tab
  And   I click on open account tab
  And   I search customer which i already created by value"6"
  And   I select currency "Pound"
  And   I click on process button
  And   I see popup window verify message "Account created successfully with account Number :1016" and click on it
  And   I click on home button
  And   I click on customer login tab
  And   I search customer which i already created by value"6"
  And   I click on login button
  And   I should verify logout button is display and click on it
  And   I click on home button
  And   I click on customer login tab
  And   I search customer which i already created by value"6"
  And   I click on login button
  And   I click on deposit tab
  And   I enter amount "100"
  And   I click on deposit  button
  And   I should verify message "Deposit Successful"
  And   I click on home button
  And   I click on customer login tab
  And   I search customer which i already created by value"6"
  And   I click on login button
  And   I click on withdrawal tab
  And   I enter withdrawal amount "50"
  And   I click on withdrawal button
  Then  I verify withdrawal message "Transaction successful"







