package com.example.services;

import com.example.utilities.Globals;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;


public class PostToCreateRegisterUser extends Globals {


   @Test
    public void postCreateRegisterUser() {
        // API Base URL
        RestAssured.baseURI = "https://automationexercise.com";

        // JSON Request Body
        String requestBody = "{"
                + "\"name\":\"John Dorec\","
                + "\"email\":\"johndorec@example.com\","
                + "\"password\":\"securedpassword\","
                + "\"title\":\"Mr\","
                + "\"birth_date\":\"01\","
                + "\"birth_month\":\"01\","
                + "\"birth_year\":\"1990\","
                + "\"firstname\":\"John\","
                + "\"lastname\":\"Dorec\","
                + "\"company\":\"Example Company\","
                + "\"address1\":\"123 Main St\","
                + "\"address2\":\"Apartment 456\","
                + "\"country\":\"US\","
                + "\"zipcode\":\"12345\","
                + "\"state\":\"CA\","
                + "\"city\":\"San Francisco\","
                + "\"mobile_number\":\"1234567890\""
                + "}";


        String apiEndpoint = "/api/createAccount";

        // Perform API request and validate response
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(apiEndpoint)
                .then()
                .statusCode(201)
                .statusLine("User created!");




    }
}