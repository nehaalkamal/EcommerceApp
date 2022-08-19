@smoke
Feature: F07_FilterColour - user could filter with colour

  Background:user could log in with valid credentials

    Given user navigates to log in page
    And user fills his email
    And user fills his password
    And user clicks on log in button
    Then user logged in successfully

  Scenario: user could filter with colour
    Given user navigates to home page
    When user chooses Apparel category then hover to Shoes subcategory
    And user chooses Shoes subcategory

    Then user filtered by red colour successfully