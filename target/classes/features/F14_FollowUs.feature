@smoke
Feature: F14_Followus - user could open followus

  Scenario: user could open twitter
    When user navigates to home page
    And user clicks twitter
    Then twitter is opened successfully

  Scenario: user could open youtube
    When user navigates to home page
    And user clicks youtube
    Then youtube is opened successfully

  Scenario: user could open RSS
    When user navigates to home page
    And user clicks RSS
    Then RSS is opened successfully

  Scenario: user could open facebook
    When user navigates to home page
    And user clicks facebook
    Then facebook is opened successfully