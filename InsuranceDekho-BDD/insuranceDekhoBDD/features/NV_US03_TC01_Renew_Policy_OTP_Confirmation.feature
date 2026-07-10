@NV_US03_TC01 
Feature: NV_US03_TC01 Verify Renew Policy navigation and OTP confirmation from Support menu

  Scenario: Verify OTP sent confirmation is shown
    Given I launch the browser and open InsuranceDekho application
    When I hover over Support menu
    And I click on Renew Policy
    And I click on Terms and Conditions
    Then I verify Terms and Conditions text is displayed
    When I enter valid mobile number
    And I click on Continue
    Then I verify OTP sent to SMS message is displayed