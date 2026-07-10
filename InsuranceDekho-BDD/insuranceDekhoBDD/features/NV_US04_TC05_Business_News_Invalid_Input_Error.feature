@NV_US04_TC05 
Feature: NV_US04_TC05 Verify validation error messages for invalid inputs from Business News

  Scenario: Verify error messages for wrong mobile and invalid submission
    Given I launch the browser and open InsuranceDekho application
    When we hover over News menu
    And we click on Business News
    Then we verify Business Insurance News header is displayed
    When we enter Name in business quote form
    And we enter Business Name in business quote form
    And we enter invalid Mobile in business quote form
    And we select Product Type
    And we enter Email in business quote form
    Then we verify business quote error message is displayed