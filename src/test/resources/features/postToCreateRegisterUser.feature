Feature: Post To Create And Register User
@wip
  Scenario: API Test 11
    When Create And Register User
    Then Validate that new user are registered
    And Validate that status code is "200"