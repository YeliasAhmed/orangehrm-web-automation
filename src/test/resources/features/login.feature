Feature: Orange HRM login functionality

  @login
  Scenario: Verify that the login with valid username and invalid password
    Given I open orangeHRM application and login page is displayed
    When I enter the valid username
    And I enter the invalid password
    And I click on login button
    Then I checked that invalid credential message is displayed

  @login
  Scenario: Verify that the login with invalid username and valid password
    Given I open orangeHRM application and login page is displayed
    When I enter the invalid username
    And I enter the valid password
    And I click on login button
    Then I checked that invalid credential message is displayed

  @login
  Scenario: Verify that the login with invalid credentials
    Given I open orangeHRM application and login page is displayed
    When I enter the invalid username
    And I enter the invalid password
    And I click on login button
    Then I checked that invalid credential message is displayed

  @login
  Scenario: Verify that the login with valid credentials
    Given I open orangeHRM application and login page is displayed
    When I enter the valid username
    And I enter the valid password
    And I click on login button
    Then I checked that the dashboard page is displayed



#  @t
#  Scenario: Login and add product to the lists
#    Given I launch the distributor application
#    When I enter the phone number
#    And I click on submit button
#    And I enter the PIN
#    And I click on submit button again
#    Then I should see the product list
#    When I click on the product list