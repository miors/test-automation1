Feature: Navigate to link

  In order to use the website effectively
  As a potential customer
  I want to be able to navigate to other links
  @mior
  Scenario: Should be able to click on link and navigate
    Given I navigate to the website
    When I navigate to any link
    Then I am able to navigate successfully