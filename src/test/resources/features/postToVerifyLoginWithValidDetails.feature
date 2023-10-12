@Regression
Feature: Post TO Verify Login

  @api7
  Scenario: API 7
    When Post to verify login
    Then Verify that valid result
