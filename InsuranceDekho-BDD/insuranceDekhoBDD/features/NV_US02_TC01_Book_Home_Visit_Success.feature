@NV_US02_TC01 
Feature: NV_US02_TC01 Verifying booking home visit advisors

  Scenario: Submit home visit request successfully
    Given I launch the browser and open InsuranceDekho application
    When I hover over Insurance Advisors
    And I click Insurance Advisors in New Delhi
    Then I verify Insurance Advisors Found text is displayed
    When I click Book Home Visit for first advisor
    And I enter valid Name and Mobile
    And I submit the request
    Then I verify Thank You text is displayed