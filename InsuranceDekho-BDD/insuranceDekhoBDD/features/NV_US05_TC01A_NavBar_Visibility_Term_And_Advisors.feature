@NV_US05_TC01
Feature: NV_US05_TC01 Verify navigation bar visibility on Term Insurance and Advisors pages

  Scenario: Verify navigation bar remains visible across navigation (Part A)
    Given I launch the browser and open InsuranceDekho application
    Then I verify navigation bar is displayed in home page
    When I hover over  Insurance menu
    And I click on the Term Insurance link
    Then I verify navigation bar is displayed on term insurance page
    When I hover over Insurance Advisors in navigation bar
    And I click Insurance Advisors in New Delhi from list
    Then I again verify navigation bar is displayed in advisor page
    When i start hovering over news
    And i click on the Travel Insurance Link
    Then verify Navigation bar is present in travel insurance page
    When i click on first article present in travel insurance page
    Then at last again verify navigation bar is displayed