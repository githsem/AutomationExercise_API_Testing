@Regression
Feature: Post To Search Product Without Parameter

  @api5
  Scenario: API Test 6
    When Post To Search Product without Search product parameter
    Then Validate that product parameter is missing in post request