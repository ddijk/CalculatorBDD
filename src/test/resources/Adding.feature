Feature: The calculator must support Adding two numbers

  Scenario Outline: Add two numbers
    Given a number <number1>
    And another number <number2>
    When the user adds them
    Then the calculator shows the result <result>



  Examples:
  |number1|number2|result|
  |1      |2      | 3    |
  |2      |2      | 4    |
  |10      |20      | 3    |


