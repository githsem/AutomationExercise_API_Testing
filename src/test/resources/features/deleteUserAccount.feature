Feature: Account Deletion
@wip
  Scenario: Delete an account with valid credentials
    Given the base URL is "https://automationexercise.com"
    And the API endpoint is "/api/deleteAccount"
    And the request parameters are as follows:
      | email       | johndoe@example.com |
      | password    | securepassword      |
    When the DELETE request is sent
    Then the response code should be 200
    And the response message should be "Account deleted!"


