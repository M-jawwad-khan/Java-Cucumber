
@Pagefactory
Feature: Running pagefactorydemo

  @pagefactorytest
  Scenario Outline: Login test and logout
    Given Open browser goto the login
    Then Enter the <username> and <password> and hits the
    And user was navigated to the Next
    
    
    Examples:
     |username|password|
     |standard_user|secret_sauce|

 
