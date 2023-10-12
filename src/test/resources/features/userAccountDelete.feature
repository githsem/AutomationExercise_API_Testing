@Regression
Feature: Account Deletion

  @api12
  Scenario: Delete an account with valid credentials
    When Delete User Account
    Then Validate that Account was deleted





