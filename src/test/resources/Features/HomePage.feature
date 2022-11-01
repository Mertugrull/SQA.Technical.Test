
Feature: Home page assertion


    Scenario: Verify that Sign In Icon at the top of the screen
      When user goes to Home Page
      Then user is able to see Sign In Icon at the top of the screen

      Scenario: Verify that England, N.Ireland and Scotland on the home page
        When user goes to Home Page
        Then England, N.Ireland and Scotland on the home page

