@smoke
Feature: F11_Comparelist - user could add different products to comparelist
  Background:user could log in with valid credentials

    Given user navigates to log in page
    And user clicks on log in button
    And user fills his email
    And user fills his password
    And user clicks on log in button
    Then user logged in successfully

  Scenario: user could add different products to comparelist
    Given user navigates to home page
    And user chooses Jewel
    When user chooses vintage ring
    And user clicks on add to comparelist button
    Then product added successfully to comparelist

    And user selects Books
    And user selects Bradbury book
    And user clicks on add to comparelist button again
    Then product added successfully to comparelist