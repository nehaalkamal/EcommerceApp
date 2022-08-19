@smoke
Feature: F10_Wishlist - user could add different products to wishlist
  Background:user could log in with valid credentials

    Given user navigates to log in page
    And user clicks on log in button
    And user fills his email
    And user fills his password
    And user clicks on log in button
    Then user logged in successfully

  Scenario: user could add different products to wishlist
    Given user navigates to home page
    And user chooses Apple macbook
    And user clicks on add to wishlist button
    Then product added successfully to wishlist

    And user chooses Books category
    And user chooses Bradbury book
    And user clicks on add to wishlist button again
    Then product added successfully to wishlist