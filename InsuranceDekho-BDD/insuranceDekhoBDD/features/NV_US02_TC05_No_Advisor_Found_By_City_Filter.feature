@NV_US02_TC05
Feature: NV_US02_TC05 Verify No Advisors Found when filtering advisors by city

  Scenario: Verify No Advisors Found message after applying city filter
    Given I launch the browser and open InsuranceDekho application
    When we hover over Insurance Advisors
    And we click Insurance Advisors in New Delhi
    When we select a city filter with no advisors
    Then we verify location header and No Advisor Found message is displayed