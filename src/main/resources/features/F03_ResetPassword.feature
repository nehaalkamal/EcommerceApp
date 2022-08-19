@smoke
Feature: F03_ResetPassword - user could reset his password successfully

  Background:user could log in with valid credentials

    Given user navigates to log in page
    And user fills his email
    And user fills his password
    And user clicks on log in button
    Then user logged in successfully


  Scenario: user could reset his password successfully

    Given user navigates to login page
    And user clicks on forgot password
    And user fills his Email
    And user clicks on Recover button

    Then user reset his password successfully