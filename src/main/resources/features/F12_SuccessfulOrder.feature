@smoke
Feature: F12_SuccessfulOrder - user could create successful order
  Background:user could add different products to shopping cart
    Given user navigates to home page

    And user chooses Computers category then hover to Software subcategory
    When user chooses Windows 8 Pro
    And user clicks on add to cart button
    Then product added successfully message

    And user chooses Jewelry category
    When user chooses flower girl bracelet
    And user clicks on add to cart button again
    Then product added successfully message

#  Scenario: user could create successful order
#    Given user navigates to home page
#
#    And user chooses Computers category then hover to Software subcategory
#    When user chooses Windows 8 Pro
#    And user clicks on add to cart button
#    Then product added successfully message
#
#    And user chooses Jewelry category
#    When user chooses flower girl bracelet
#    And user clicks on add to cart button again
#    Then product added successfully message

  Scenario: user could create successful order
    Given user clicks on shopping cart
    And user agreed on terms
    When user clicks on checkout
    And user fills his email
    And user fills his password
    And user clicks on log in button
    Then user logged in successfully
    And user agreed on terms
    When user clicks on checkout
    And user fills user data
    And user clicks on continue
    And user chooses delivery and continue
    And user select payment and continue
    And user clicks continue
    And user clicks confirm

    Then checkout is completed successfully