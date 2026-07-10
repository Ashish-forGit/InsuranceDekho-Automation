@NV_US04_TC04 
Feature: NV_US04_TC04 Verify successful quote submission from Business News section

  Scenario: Submit quote successfully with valid details
    Given I launch the browser and open InsuranceDekho application
    When person hover over News menu
    And he click on Business News
    Then he verify Business Insurance News header is displayed
    When he enter Name in business quote form
    And he enter Business Name in business quote form
    And he enter valid Mobile in business quote form
    And he select Product Type
    And he enter Email in business quote form
    And he click Get Quote button
    Then he verify Thank You text is displayed for business quote
