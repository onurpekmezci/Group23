Feature: Bank account Functionality
  @Regression
  Scenario:user should be able to add edit and delete bank account

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Bank Account page
    When Create a Bank Account
    And find created account
    And delete bank account
