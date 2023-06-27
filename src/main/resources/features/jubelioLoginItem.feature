@All
Feature: Login and Adjust Item

  @positive @login
  Scenario: Success login
    Given User is on jubelio homepage
    When User input email and password
    And User click login button
    Then User verify login result

  @negative @login
  Scenario: Failed login - Missmatch password
    Given User is on jubelio homepage
    When User input valid email and invalid password
    And User click login button
    Then User get error message

  @positive @item
  Scenario: Success adjust item
    Given User is on jubelio homepage
    When User input email and password
    And User click login button
    Then User verify jubelio dashboard
    When User click item menu
    And User click stock menu
    Then User verify stock page
    When User input item
    And User click search button
    Then User verify choosen item
    When User choose item
    And User click stock adjustment
    Then User verify stock adjustment page
    When User input qty stock
    And User click save button
    Then User verify save result

  @negative @item
  Scenario: Failed adjust item - Missmatch data
    Given User is on jubelio homepage
    When User input email and password
    And User click login button
    Then User verify jubelio dashboard
    When User click item menu
    And User click stock menu
    Then User verify stock page
    When User input item
    And User click search button
    Then User verify choosen item
    When User choose item
    And User click stock adjustment
    Then User verify stock adjustment page
    When User directly click save button
    Then User get error message for save result