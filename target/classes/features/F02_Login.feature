@smoke
Feature: F02_Login - user could log in with valid email and password

  Scenario: user could log in with valid credentials

    Given user navigates to log in page
    And user fills his email
    And user fills his password
    And user clicks on log in button
    Then user logged in successfully