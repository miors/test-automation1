Feature: Navigate to site

  In order to read about the Company
  As a potential customer
  I want to be able to navigate to the Company's website

  Scenario: Should be able to navigate to Company's website
    Given I navigate to the website
    When I observe the page title
    Then I should observe the title is 'The Web Testing Book'

  Scenario: Link should exist
    Given I navigate to the website
    Then I should observe the hyperlink 'Techwell.com' exists