@SmokeScanerio
Feature: feature to test login funconality

  @SmokeTest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When when enter username and password
    And Click on login button
    Then user is navigated to the home page

  #Scenario Outline: Check login is successful with valid credentials
    #Given user is on login page
    #When when enter <username> and <password>
    #And Click on login button
    #Then user is navigated to the home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
