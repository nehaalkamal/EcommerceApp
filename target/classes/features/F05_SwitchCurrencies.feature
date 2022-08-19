@smoke
Feature: F05_SwitchCurrencies - user could switch between currencies US-Euro

  Background:user could log in with valid credentials

    Given user navigates to log in page
    And user fills his email
    And user fills his password
    And user clicks on log in button
    Then user logged in successfully

  Scenario:user could switch between currencies US-Euro
    Given user navigates to home page
    And user chooses Euro from dropdown menu

    Then Euro is switched successfully
