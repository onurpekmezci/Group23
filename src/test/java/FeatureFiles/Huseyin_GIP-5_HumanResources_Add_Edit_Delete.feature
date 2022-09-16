Feature: Add - Edit - Delete Positions Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and click login button
    Then  User should login successfuly
  @Regression
  Scenario: Add add position to human resources
      Given Clicking on the relevant menu options
      When  Fill in the fields related to adding a position
      Then  Successfully add operation
  @Regression
   Scenario: Edit and make necessary adjustments
    Given Clicking on the relevant menu options
    Given Arrangement of first and last names
    Then  Confirmation of successfully
  @RegressionTest
    Scenario: Delete and make necessary adjustments
      Given Clicking on the relevant menu options
      When  Execution of deletion
      Then  Delete and successfully



