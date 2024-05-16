Feature: Login Functionality
  As a user
  I want to be able to login
  So that I can access my account

  Scenario: Successful login
    Given I am on the login page
    When I enter my username and password
    And I click the login button
    Then I should be logged into my account