#Author: katerin.r@tcs.com

Feature: As a user I need

  Background: Open page.
    Given the user is on the viva air page

  @SmokeTest
  Scenario: Smoke Test
    Then the user will see the necessary fields for the reservation is visible

  @ReservedFlight
  Scenario: Reserved Flight
    When the user enter your information for reserved a flight
      | originCity     | Cartagena |
      | destinyCity    | Medellín  |
      | departureDay   | 1         |
      | departureMonth | Diciembre |
      | departureYear  | 2021      |
      | arrivalDay     | 10        |
      | arrivalMonth   | Diciembre |
      | arrivalYear    | 2021      |
      | adults         | 2         |
      | child          | 2         |
    And the user selects the cheapest flight with a medium fare
    Then the total price should be correct

  @ModifyFlight
  Scenario: Modify Flight
    When the user enter your information for reserved a flight
      | originCity     | Cartagena |
      | destinyCity    | Medellín  |
      | departureDay   | 1         |
      | departureMonth | Diciembre |
      | departureYear  | 2021      |
      | arrivalDay     | 10        |
      | arrivalMonth   | Diciembre |
      | arrivalYear    | 2021      |
      | adults         | 2         |
      | child          | 2         |
    And the user modify your information for reserved a flight
      | originCity     | Cartagena |
      | destinyCity    | Cali      |
      | departureDay   | 1         |
      | departureMonth | Diciembre |
      | departureYear  | 2021      |
      | arrivalDay     | 10        |
      | arrivalMonth   | Diciembre |
      | arrivalYear    | 2021      |
      | adults         | 2         |
      | child          | 2         |
    Then the text modify should be correct


