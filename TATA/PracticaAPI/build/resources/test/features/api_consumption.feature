#Author: francymilena.zapata@tcs.com

  #language:en

Feature: I as a user need to consume an api

  Scenario: consult api
    When the user consults the api information
    Then the user will see the response code 200

  @ConsultName
  Scenario: consult name
    When the user consults the user with id 9
    Then the user will see the name Tobias

  @CreateRegister
  Scenario: create register
    When the user sends the information for registration
      | amapola |
      | verde   |
    Then the user will see the response code 200