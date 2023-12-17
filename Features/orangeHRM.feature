Feature: Login into the Application.

  Scenario: Logo Present on home Page
    Given I launch chrome Browser
    When  I open hrm home page
    Then I verify that the logo is present or not
    And close Browser