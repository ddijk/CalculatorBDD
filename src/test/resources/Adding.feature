Feature: The calculator must support basic arithmetic operations

  Scenario: Two numbers are given
    Given a number 10
    And another number 3
    When the user adds them
    Then the calculator shows the result 13

  Scenario: Two numbers are given
    Given a number 10
    And another number 3
    When the user subtracts them
    Then the calculator shows the result 7
