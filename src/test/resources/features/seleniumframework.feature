Feature: Access seleniumframework.com website
  Use selenium java with cucumber-jvm and navigate to website

  Scenario: Print title, url
    Given I open seleniumframework website
    And I search for a text Automation Testing
