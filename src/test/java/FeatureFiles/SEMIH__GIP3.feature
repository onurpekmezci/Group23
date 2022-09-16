Feature: Add-Edit-Delete Document Types under Parameters Setup

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button

    Scenario: Add Document Processes

      When Navigate to Document Types
      And Click on the addDocument
      And User sending the keys in Document Page
      And User click document stage and choose Sertificate Stage in Document Page
      And Click on Save Button in Document Page
      And Success message should be displayed

  Scenario: Edit Document Processes
    When Navigate to Document Types
    And Search on the Document
    And Click on the Search Button
    And User edit the keys in Document Page
    And Click on Save Button the Edit Page
    And Success message should be displayed


  Scenario: Delete Document Processes
    When Navigate to Document Types
    And Search on the Document
    And Click on the Search Button
    And Click on the deleteDocument
    And User confirms delete processes
