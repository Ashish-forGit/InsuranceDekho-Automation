@NV_US02_TC04
Feature: NV_US02_TC04 Verify error message for incomplete manual location details

  Scenario: Verify area field error when not provided
    Given I launch the browser and open InsuranceDekho application
    When user hover over Insurance Advisors
    And user click Insurance Advisors in New Delhi
    When user click Book Home Visit
    And user click Schedule Home Visit
    And user enter valid Name and Mobile
    And user click Schedule Home Visit
    And user click Schedule Visit
    And user click Enter Location Manually
    When user enter Pincode
    And user enter House Number
    And user click Schedule Visit on location form
    Then user verify Area input error message is displayed
