@Regression
Feature: POST To Verify Login with invalid details

  @api10
  Scenario: API Test 10
    When User writes invalid email and password
    Then Validate that invalid result