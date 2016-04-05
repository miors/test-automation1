Feature: Navigate to web testing book

  In order to read about web testing
  As a potential customer
  I want to be able to navigate to the web testing handbook

  Scenario: Should be able to navigate to web testing handbook
    Given I navigate to the website
    When I choose the web testing handbook link
    Then I can navigate to 'TechWell' page successfully