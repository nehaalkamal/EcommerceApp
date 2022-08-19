@smoke
Feature: F01_Register - user could register with new account

  Scenario: user could register with valid data successfully
    When user navigates to home page
    And user clicks on register to open registration page
    And user enters her gender
    And user enters valid first name
    And user enters valid last name
    And user enters birthdate
    And user enters valid email
    And user enters valid password
    And user clicks on register button
    Then user registered successfully