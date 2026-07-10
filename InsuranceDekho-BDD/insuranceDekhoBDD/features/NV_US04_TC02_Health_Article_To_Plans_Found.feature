@NV_US04_TC02 
Feature: NV_US04_TC02 Verify Health Insurance articles navigation and insurance plan search results

  Scenario: Navigate health article and verify plans found in calculator flow
    Given I launch the browser and open InsuranceDekho application
    When I will hover over News menu
    And I will hover over Health Insurance News
    And I will click on Health Insurance Article
    Then I will  verify Health Insurance Article header is displayed
    When I will open first health insurance article
    Then I will verify news is written by author
    When I will navigate to Health Insurance Calculator
    And I will enter Age
    And I will enter Pincode
    And I will click Calculate Price
    And I will enter Name
    And I will enter Mobile Number
    And I will click View Plans
    Then I will verify number of plans found is displayed