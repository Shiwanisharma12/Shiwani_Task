Feature: Log into the application, Verify profile and logout from the application


  Scenario:Log into the application
    Given User login
    And  enter valid credentials
    And  Verify user is on first_screen
    When I click on login button of application

  Scenario: Verify the profile of the user and log out
    Given I am on the first screen
    When user click on office and dragon, icon popup comes up
    Then User logout from the application

    Scenario: Verify the components after logout
      Given I am on the welcome screen again
      And  user verify the project icon and login button.

