Feature: Open a PDF File

  In order to know more about the Company
  As a potential customer
  I want to be able to open its PDF document

  Scenario: Should be able to open PDF document
    Given I navigate to the website
    When I navigate to the PDF document
    Then I am able to open PDF document successfully