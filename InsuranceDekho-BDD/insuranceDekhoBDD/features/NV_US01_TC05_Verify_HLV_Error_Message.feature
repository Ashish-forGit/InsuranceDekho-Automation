@NV_US01_TC05 
Feature: NV_US01_TC05 Human Life Value Calculator and verify error message in HLVC

  Scenario: Verify error message is displayed for incomplete/invalid inputs
    Given I launch the browser and open InsuranceDekho application
    When I hover on Insurance menu
    And I hover on Life Insurance menu
    And I click on Human Life Value Calculator
    Then I verify HLV calculator page title is displayed
    When I enter Name in HLV form
    And I enter Birthday in HLV form
    And I select Annual Income in HLV form
    And I enter Mobile Number in HLV form
    Then I verify HLV error message is displayed