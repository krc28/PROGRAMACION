#Author: santiago.gomezbedoya@tcs.com

Feature: as a user I want to create an account on the advantage page

  Background: Open Page
    Given the user is on the main page
    And the user goes to the register form

  @AccountSuccessfully
  Scenario: account created successfully
    When the user enters its information
      | username | email              | password | confirmPassword | firstName | lastName | phone     | country | city     | address | region | code  |
      | Santiago | santiago@gmail.com | 12345Aa. | 12345Aa.        | Santi     | Gomez    | 555 55 55 | Denmark | Medellin | cra 27  | oeste  | 12345 |
    Then the user will watch the register button enabled

  @ButtonDisabled
  Scenario Outline: account created failed
    When the user enters its information
      | username   | email   | password   | confirmPassword   | firstName   | lastName   | phone   | country   | city   | address   | region   | code   |
      | <username> | <email> | <password> | <confirmPassword> | <firstName> | <lastName> | <phone> | <country> | <city> | <address> | <region> | <code> |
    Then the user will watch the register button disabled

    Examples:
      | username | email              | password | confirmPassword | firstName | lastName | phone     | country | city     | address | region | code  |
      |          |                    | 12345Aa. | 12345Aa.        | Santi     | Gomez    | 555 55 55 | Denmark | Medellin | cra 27  | oeste  | 12345 |
      | Santi    | santiago@gmail.com | 12345Aa. | 12345Aa.        |           |          | 555 55 55 | Denmark | Medellin | cra 27  | oeste  | 12345 |
      | Santi    | santiago@gmail.com | 12345Aa. | 12345Aa.        | Santi     | Gomez    | 555 55 55 | Denmark | Medellin |         | oeste  | 12345 |

  @FieldEmail
  Scenario Outline: Validate Email
    When the user enters the email <email>
    Then the user will watch the message <message>

    Examples:
      | email        | message         |
      |              | field empty     |
      | santiago.com | field incorrect |