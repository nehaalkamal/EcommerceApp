@smoke
Feature: F06_Categories - user could chooses different categories

  Background:user could log in with valid credentials

    Given user navigates to log in page
    And user fills his email
    And user fills his password
    And user clicks on log in button
    Then user logged in successfully

Scenario: user could chooses different categories

Given user navigates to home page
When user chooses Jewelry category
And user chooses Computers category then hover to Software subcategory