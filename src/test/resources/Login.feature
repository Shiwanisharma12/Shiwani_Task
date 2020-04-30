Feature: Verify the login functionality with all positive negative scenario

  Scenario Outline: : Verify the login functionality with all possible negative scenarios
    Given I am on test login page
    When I click on login button of application
    And  I enter "<username>" and "<password>"
    //username and password will be fetched from example table one by one
    And  I click on login button

    Examples:
              |username                      | password    |
              //both username and password is incorrect
              | Shivani5111                  | hohdhiodh   |
              //user name is correct and password is incorrect
              | Shiwani@Officeanddragons.com |shiwani@123  |
              //Both usernme and password is empty
              |                              |             |
              //user id is incorrect and password is correct
              | Shiwani.sharma0511           | Test@1234   |
              //email id is empty and password is correct
              |                              | Test@1234   |
              //email is correct and password is empty
              | Shiwani@Officeanddragons.com |             |
              // Both email id and password is correct and user will login
              | Shiwani@Officeanddragons.com | Test@1234   |


