#Author 2113527@tcs.com
Feature:  as a user I want to make a purchase on eribank app

  @Decrement
  Scenario Outline: purchasing and paying
    When the user fills data correctly
      | user    | pwd     |
      | company | company |
    And user buys products
      | phone   | name   | country   | pay   |
      | <phone> | <name> | <country> | <pay> |
    Then the user validates price decrement matches 48.00
    Examples:
      | phone      | name         | country  | pay |
      | 3216549870 | Android test | USA      | 60  |
      | 3216549870 | Android test | Colombia | 70  |
      | 3216549870 | Android test | Iceland  | 10  |
      | 3216549870 | Android test | Russia   | 52  |

  @OutofMoney
  Scenario: paying more than user wealth
    When the user fills data correctly
      | user    | pwd     |
      | company | company |
    And user pays out of money
      | phone      | name         | country | pay |
      | 3216549870 | Android test | USA     | 60  |
    And user pays out of money
      | phone      | name         | country | pay |
      | 3216549870 | Android test | USA     | 60  |
    Then the user validates negative credit matches -20.00

  @PayingNothing
  Scenario: paying nothing at all
    When the user fills data correctly
      | user    | pwd     |
      | company | company |
    And user pays zero dollars
      | phone      | name         | country | pay |
      | 3216549870 | Android test | USA     | 0   |
    Then user validate send button inactive

  @AllDataOK
  Scenario: filling data and validating button
    When the user fills data correctly
      | user    | pwd     |
      | company | company |
    And user pays 50
      | phone      | name         | country | pay |
      | 3216549870 | Android test | USA     | 50  |
    Then user validate send button inactive

  @WrongPhone
  Scenario: filling wrong phone and validating button
    When the user fills data correctly
      | user    | pwd     |
      | company | company |
    And user fills wrong phone
      | phone     | name         | country | pay |
      | 3njbhbhbh | Android test | USA     | 50  |
    Then user validate send button inactive