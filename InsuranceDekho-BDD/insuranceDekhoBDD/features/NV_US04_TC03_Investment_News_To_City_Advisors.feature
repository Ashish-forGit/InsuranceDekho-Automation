@NV_US04_TC03 
Feature: NV_US04_TC03 Verify navigation from Investment News to city-specific Investment Advisors listing

  Scenario: Verify Gurgaon advisors listing opens from investment news section
    Given I launch the browser and open InsuranceDekho application
    When I have to hover over News menu
    And I have to click on Investment News
    Then I have to verify Investment Insurance News header is displayed
    When I navigate to Investment Advisors in your city
    And I click Gurgaon advisors
    Then I verify Insurance Advisors in Gurgaon header is displayed