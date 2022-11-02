
Feature: Sign In icon and assertion

  Background:
    Given user is on the Home Page

  Scenario:  Click on the Sign In icon and assert the following on the page:
  Email or Username, Password, Sign in, Need help signing in?
    When user click on the Sign In icon
    Then user is able to see Email or Username, Password, Sign in, Need help signing in?

    Scenario: Enter a password of @@££@@££ in the password field and click Sign In
      When user click the Sign In icon
      When user input password
      And user click sign in button
      Then user is able to see; Sorry, that password isn't valid. Please include a letter.










