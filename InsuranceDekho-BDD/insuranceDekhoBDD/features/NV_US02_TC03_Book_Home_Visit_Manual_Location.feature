@NV_US02_TC03 
Feature: NV_US02_TC03 Verify Book Home Visit flow for Insurance Advisors

  Scenario: Verify manual location details section is displayed
    Given I launch the browser and open InsuranceDekho application
    When I hover over Insurance Advisors
    And I click Insurance Advisors in New Delhi
    When I click Book Home Visit
    And I click Schedule Home Visit
    And I enter valid Name and Mobile
    And I click Schedule Home Visit
    And I click Schedule Visit
    And I click Enter Location Manually
    Then I verify Your Location Details section is displayed
    When I enter Pincode
    And I enter House Number
    And I enter Area
