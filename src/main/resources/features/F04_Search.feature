@smoke
Feature: F04_Search - user could search for any product

  Background: user could log in with valid credentials

    Given user navigates to log in page
    And user fills his email
    And user fills his password
    And user clicks on log in button
    Then user logged in successfully

  Scenario: user could search for any product with name

    When user navigates to home page
    And user searches with name of product
    Then user could find product results

  Scenario:  user could search for any product with sku

    When user navigates to home page
    And user searches with sku of product
    And user selects the product

    Then user could find product results with sku