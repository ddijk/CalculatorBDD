Feature: The calculator must support subtracting two numbers

  Scenario Outline: Subtract two numbers
    Given a number 10
    And another number 3
    When the user subtracts them
    Then the calculator shows the result 7

  Examples:
  |number1|number2|result|
  |5      |2      | 3    |
  |5      |7      | -2    |


