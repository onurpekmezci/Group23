Feature: Field Factory
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
   Scenario: Open Field Pages throw send name and code
     And Navigate Field Pages
     When Create a new Fields
     And Edit a Fields
     And Delete a Fields




     #Then Check Success message







