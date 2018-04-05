Feature: First test
  Scenario Outline: Check multiplication
    When initial value is <Value>
    Then result should be <Result>

  Examples:
    | Value | Result |
    | 5     | 25     |
    | 4     | 16     |
    | 3     | 9      |

  Scenario: Check List
    When initial List is: a, b, c, d
    Then result set is: a, b, d, c

  Scenario Outline: Check List outline
    When initial outline List is: <Value>
#    Then result outline set is: <Expected>

    Examples:
    | Value   | Expected |
    | a,b,c,d | a,b,c,d  |
    | a,b,c,d | a,b,c    |
