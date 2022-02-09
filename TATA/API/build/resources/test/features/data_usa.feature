#Author: katerin.r@tcs.com

Feature: As a user of the service, I need to consult the fields of the service

  @SmokeTest
  Scenario: Smoke Test
    When the user enters query parameters
      | measure    | Population |
      | drilldowns | Nation     |
    Then the user will see the required fields
      | ID Nation   |
      | Nation      |
      | ID Year     |
      | Year        |
      | Population  |
      | Slug Nation |

  @ConsultYear
  Scenario: Consult year
    When the user enters query parameters
      | measure    | Population |
      | drilldowns | Nation     |
      | Year       | 2019       |
    Then the user will see the code Population 328239525

  @ConsultYearEqualId
  Scenario: Consult year equal ID
    When the user enters query parameters
      | measure    | Population |
      | drilldowns | Nation     |
      | Year       | 2019       |
    Then the user will see the ID Year 2019

  @ConsultCodePopulation
  Scenario: Consult code population
    When the user enters query parameters
      | measure    | Population |
      | drilldowns | Nation     |
      | Population | 316128839  |
    Then the user will see the ID Nation 0100U

  @NewRegister
  Scenario Outline: New register
    When the user creates a new register
      | idNation   | nation   | idYear   | year   | population   | slugNation   | postalCode   |
      | <idNation> | <nation> | <idYear> | <year> | <population> | <slugNation> | <postalCode> |
    Then the user will see their code registration created successfully 201
    Examples:
      | idNation | nation        | idYear | year | population | slugNation    | postalCode |
      | 02000US  | United States | 2020   | 2020 | 329865981  | united-states | 1356743    |




