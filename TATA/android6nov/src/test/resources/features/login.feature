#Author 2113527@tcs.com
Feature:  as a user I want to login to the app

  Scenario: successful login
    When the user fills data correctly
      | user    | pwd     |
      | company | company |
    Then the user should watch a message