@All
Feature: Login on web

  @SuccessfulLogin
  Scenario: Verify successful login with a existing user
    Given the user is in login screen
    When enters the username and password
    Then should login in the web