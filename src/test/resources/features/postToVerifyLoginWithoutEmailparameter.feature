@Regression
Feature: Verify missing email parameter
@api8
Scenario: API 8
     When Post to login witout email
    Then Verify that invalid result
