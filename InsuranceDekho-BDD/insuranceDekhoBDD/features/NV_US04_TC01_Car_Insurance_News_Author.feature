@NV_US04_TC01 
Feature: NV_US04_TC01 Verify navigation to Car Insurance news and display of article author information

  Scenario: Verify author info is displayed on first car insurance news article
    Given I launch the browser and open InsuranceDekho application
    When I hover over News menu
    And I click on Car Insurance News
    Then I verify Car Insurance News header is displayed
    When I open first news article
    Then I verify news is written by author
