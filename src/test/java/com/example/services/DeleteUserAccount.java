package com.example.services;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
public class DeleteUserAccount {


        @Test
        public void DeleteUserAccountApi() {
            // API Base URL
            RestAssured.baseURI = "https://automationexercise.com";

            // Request Parameters
            String email = "johndoe@example.com";
            String password = "securepassword";

            // API Endpoint
            String apiEndpoint = "/api/deleteAccount";

            // Perform API request and validate response
            RestAssured.given()
                    .contentType(ContentType.URLENC)
                    .formParam("email", email)
                    .formParam("password", password)
                    .when()
                    .delete(apiEndpoint)
                    .then()
                    .statusCode(200)
                    .statusLine("Account deleted!");

        }
    }

