@wip
Feature: Negative log in cases, assertion the message;Something’s missing. Please check and try again. And
  assertion the message; Sorry, that password is too short. It needs to be eight characters or more.


  Background:
    Given user is on the sign in page

    Scenario: User blank the username field and input password
      And user inputs password and clicks sign in button
      Then user should  see;Something’s missing. Please check and try again.

        Scenario: User blank the Email or username field and inputs invalid password
          And user inputs the invalid password and clicks sign in button
          Then user is able to see; Sorry, that password is too short. It needs to be eight characters or more.

