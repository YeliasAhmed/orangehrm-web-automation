Feature: Distributor Web Login and Product Add


  @t
  Scenario: Login and add product to the list
    Given I launch the distributor application
    When I enter the phone number
    And I click on submit button
    And I enter the PIN
    And I click on submit button again
    Then I should see the product list
    When I click on the product list
#    And I click on add product


  @t
  Scenario: Login and add product to the lists
    Given I launch the distributor application
    When I enter the phone number
    And I click on submit button
    And I enter the PIN
    And I click on submit button again
    Then I should see the product list
    When I click on the product list