Feature: Verify that the Admin functionality

  Background:
    Given I open orangeHRM application and login page is displayed
    When I enter the valid username
    And I enter the valid password
    And I click on login button

  Scenario: Verify that the new user role is created
    Given I click on the Admin