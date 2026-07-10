@NV_US01_TC03 
Feature: NV_US01_TC03 Two-Wheeler IDV via Bike Claim Settlement and verify amount

  Scenario: Calculate Bike IDV and validate amount is displayed
    Given I launch the browser and open InsuranceDekho application
    When I hover on Insurance menu
    And I hover on Bike Insurance menu
    And I click on Claim Settlement
    Then I verify Bike Insurance Claim heading is present
    When I scroll to Calculate Two Wheeler IDV section
    And I select first bike brand
    And I select first bike model
    And I select first bike year
    Then I calculate and verify Two Wheeler IDV amount