@NV_US03_TC02
Feature: NV_US03_TC02 Verify invalid mobile number validation message from Support menu

  Scenario: Verify invalid mobile number error message is shown
    Given I launch the browser and open InsuranceDekho application
    When user hover over Support menu
    And user click on Renew Policy
    And user click on Terms and Conditions
    Then user verify Terms and Conditions text is displayed
    When user enter invalid mobile number
    And user click on Continue
    Then user verify invalid mobile number error message is displayed
