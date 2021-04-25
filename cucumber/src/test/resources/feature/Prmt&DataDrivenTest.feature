
@DDTDemo
Feature: Paramaterized and Data Drive Test Demo

  @DDT
  Scenario Outline: Title of your scenario
    Given Open browser goto the login page
    Then Enter the <username> and <password> and hits the Enter
    And user was navigated to the Next page
    
    
    Examples:
     |username|password|
     |standard_user|secret_sauce|

 
