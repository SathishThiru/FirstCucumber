@user
Feature: Feature to test user screen related functionalitites

  #Background:
  #Given the user opens the application in "chrome"
  @login
  Scenario Outline: To validate login functionality
    Given the user opens the application in "<Browser>"
    When the user enters prints the below data
      | Username   | DOB        |
      | <UserName> | <Password> |
    When the user enters username as "<UserName>" and password as "<Password>"
    Then login should be successful with the "<Expected Message>"

    Examples: 
      | UserName | Password       | Expected Message                   | Browser |
      | Nivi2296 | Saravanan@2296 | Welcome to Adactin Group of Hotels | chrome  |

  #| sathishtest12344 | sathish123 | Welcome to Adactin Group of Hotels | chrome  |
  @logout
  Scenario Outline: To validate logout functionality
    Given the user opens the application in "<Browser>"
    When the user enters username as "<UserName>" and password as "<Password>"
    Then login should be successful with the "<Expected Message>"
    And logout of the application

    Examples: 
      | UserName         | Password   | Expected Message                   | Browser |
      | sathishtest12344 | sathish123 | Welcome to Adactin Group of Hotels | chrome  |
