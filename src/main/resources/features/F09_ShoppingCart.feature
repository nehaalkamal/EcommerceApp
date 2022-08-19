@smoke
Feature: F09_ShoppingCart - user could add different products to shopping cart
  Background:user could log in with valid credentials

    Given user navigates to log in page
    And user clicks on log in button
    And user fills his email
    And user fills his password
    And user clicks on log in button
    Then user logged in successfully

  Scenario: user could add different products to shopping cart
    Given user navigates to home page

    And user chooses Computers category then hover to Software subcategory
    When user chooses Windows 8 Pro
    And user clicks on add to cart button
    Then product added successfully message

    And user chooses Jewelry category
    When user chooses flower girl bracelet
    And user clicks on add to cart button again
    Then product added successfully message