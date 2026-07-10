
@NV_US01_TC01
Feature: NV_US01_TC01 Navigate to Car Insurance page and verify heading

  Scenario: Verify Car Insurance heading is present
    Given I launch the browser and open InsuranceDekho application
    Then I verify InsuranceDekho is visible on the homepage
    When I hover on Insurance menu
    And I click on Car Insurance
    Then I verify Car Insurance heading is present
