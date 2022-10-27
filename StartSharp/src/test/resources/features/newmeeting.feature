#author: Luz Adriana Dotor Tafur

Feature: The user enters the Start Sharp page, logs in to create a business unit and a new meeting with it

  Scenario Outline: the user creates a new meeting
    Given The user enters the page and logs in
    When The user creates a new business unit
    And the user creates a new meeting with the business unit he created
      | timeStart   | timeEnd   | reporter   | number   | name   | organizedBy   | location   | type   | attendeeList   | attendeeType   | attendeeStatus   |
      | <timeStart> | <timeEnd> | <reporter> | <number> | <name> | <organizedBy> | <location> | <type> | <attendeeList> | <attendeeType> | <attendeeStatus> |
    Then The user validates that the meeting was created
    Examples:
      | timeStart | timeEnd | reporter     | number | name                               | organizedBy  | location | type     | attendeeList | attendeeType | attendeeStatus |
      | 09:00     | 10:00   | Adam Stewart | WDM-15 | Space to socialize business issues | Aaron Taylor | HQ-02    | Strategy | Allison Bell | Guest        | Attended       |