@NV_US01_TC06
Feature: NV_US01_TC06 Navigating Investment Plans and verifying saving plan

  Scenario: Verify saving plan is shown under Market Linked plans
    Given I launch the browser and open InsuranceDekho application
    When I hover on Insurance menu
    And I hover over Investment menu
    And I click on Investment Plans
    Then I verify Best Investment Plans heading is displayed
    When I click on Market Linked
    Then I verify Saving Plan is displayed