@smoke
Feature: F13_HomeSliders - user could open product from sliders

  Scenario: user could open product from first slider

    When user navigates to home page
    And user clicks on first slider
    Then slider opens first product

  Scenario: user could open product from second slider
    When user navigates to home page
    And user clicks on second slider
    Then slider opens second product