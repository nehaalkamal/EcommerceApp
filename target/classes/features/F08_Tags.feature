@smoke

Feature: F08_Tags - user could select different tags

  Background:user could log in with valid credentials

    Given user navigates to log in page
    And user clicks on log in button
    And user fills his email
    And user fills his password
    And user clicks on log in button
    Then user logged in successfully


  Scenario:
    Given user chooses apparel category
    When user selects jewelry tag
    And user selects jeans tag