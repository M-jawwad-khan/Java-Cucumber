@GoogleTesting
Feature: Test Google Funcionality

  @GoogleSearchTest
  Scenario: Validate google search is working
    Given browser is open
    And user is on google screen page
    When user enters a text in search box
    And hits the enter
    Then user is navigated to search result screen
