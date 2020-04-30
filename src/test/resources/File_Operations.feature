Feature: Upload folder with docx files and perform end to end operations

  Scenario: User uploads folder with docx files
    Given User is on screenFirst
    When user click on add more button
    And Pass the path of the folder in search bar of the window
    Then files will be uploaded and user move to second screen

  Scenario: User perform second screen operations

    Given user is on screen_two and fill the find what and replace with text
    When user  click on Apply button,changes will be applied

  Scenario: User performs screen 3 operations
    When user click on next button of screen ,redirects to last screen
    And user apply prefix to the filenames
    And user apply suffix to the filenames
    And click on save button, zip file with all the edit in file will be exported
