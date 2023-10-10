package com.example.step_defs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.Map;

import static com.example.utilities.Globals.response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DeleteUserAccount_stepDefs {

        private String baseUrl;
        private String apiEndpoint;
        private int statusCode;
        private String responseMessage;
    private Map<String, String> requestParameters;

        @Given("the base URL is {string}")
        public void setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            RestAssured.baseURI = baseUrl;
        }

        @Given("the API endpoint is {string}")
        public void setApiEndpoint(String apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
        }

        @Given("the request parameters are as follows:")
        public void setRequestParameters(Map<String, String> parameters) {
            this.requestParameters = parameters;
        }

        @When("the DELETE request is sent")
        public void sendDeleteRequest() {
            // Perform API request and capture response details
            io.restassured.response.Response response = RestAssured.given()
                    .contentType(ContentType.URLENC)
                    .formParam("email", "johndoe@example.com")
                    .formParam("password", "securepassword")
                    .when()
                    .delete(apiEndpoint);

            // Capture response details for assertion
            statusCode = response.getStatusCode();
            responseMessage = response.getBody().asString();
        }

        @Then("the response code should be {int}")
        public void verifyResponseCode(int expectedStatusCode) {
            assertThat(statusCode, is(expectedStatusCode));
        }

        @And("the response message should be {string}")
        public void verifyResponseMessage(String expectedMessage) {
            assertThat(responseMessage, is(expectedMessage));
        }
    }

