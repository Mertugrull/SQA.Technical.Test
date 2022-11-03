
Feature: Negative log in cases, assertion the message; Something’s missing. Please check and try again. And
  assertion the message; Sorry, that password is too short. It needs to be eight characters or more.


  Background:
    Given user is on the sign in page

  Scenario Outline:
    When User blank the username field and input "<invalid password>"
    And user clicks sign in button
    Then user should  see; "<error message>"
    Examples:
      | invalid password | error message                                                               |
      | @@££@@££         | Something’s missing. Please check and try again.                            |
      | @@££@@           | Sorry, that password is too short. It needs to be eight characters or more. |