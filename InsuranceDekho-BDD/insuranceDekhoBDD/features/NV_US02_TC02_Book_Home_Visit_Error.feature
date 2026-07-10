@NV_US02_TC02
Feature: NV_US02_TC02 Verifying booking home visit advisors error message

  Scenario: Verify error message for invalid inputs
    Given I launch the browser and open InsuranceDekho application
    When I hover over a Insurance Advisors
    And I click Insurance a Advisors in New Delhi
    Then I verify Insurance a Advisors Found text is displayed
    When I click Book Home a Visit for first advisor
    When I enter a invalid Name and Mobile
    And I submit a request
    Then I verify input validation error is displayed
