Feature: The calculator must support basic arithmetic operations

  Scenario: Add two numbers
    Given a number 10
    And another number 3
    When the user adds them
    Then the calculator shows the result 13

  Scenario: Subtract two numbers
    Given a number 10
    And another number 3
    When the user subtracts them
    Then the calculator shows the result 7
