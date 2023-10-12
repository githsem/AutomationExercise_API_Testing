@Regression
Feature: Verify missing email parameter

  @api8
  Scenario: API 8
    When Post to login without email
    Then Verify that invalid result
