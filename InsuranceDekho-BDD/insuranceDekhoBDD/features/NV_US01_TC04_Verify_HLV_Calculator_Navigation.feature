@NV_US01_TC04 
Feature: NV_US01_TC04 Verify Human Life Value Calculator is navigated through Life Insurance

  Scenario: Verify HLV calculator page title is displayed
    Given I launch the browser and open InsuranceDekho application
    When I hover on Insurance menu
    And I hover on Life Insurance menu
    And I click on Human Life Value Calculator
    Then I verify HLV calculator page title is displayed