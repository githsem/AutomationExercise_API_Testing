package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;


public class PostToCreateRegisterUser extends Globals {


    public void postToCreateRegisterUser() {

        // API Base URL
        RestAssured.baseURI = "https://automationexercise.com";

        String apiEndpoint = "/api/createAccount";

        // Perform API request and validate response
        response = RestAssured.given()
                .contentType(ContentType.MULTIPART)
                .multiPart("name", "Ahmetz")
                .multiPart("email", "ahmetwdze@drm.com")
                .multiPart("password", "Ahmet12345z")
                .multiPart("title", "Mr")
                .multiPart("birth_date", "10")
                .multiPart("birth_month", "12")
                .multiPart("birth_year", "1983")
                .multiPart("firstname", "Ahmet")
                .multiPart("lastname", "Kara")
                .multiPart("company", "Technox")
                .multiPart("address1", "Saint Antuan")
                .multiPart("address2", "CL")
                .multiPart("country", "Canada")
                .multiPart("zipcode", "25478")
                .multiPart("state", "Canada")
                .multiPart("city", "Toronto")
                .multiPart("mobile_number", "32452168")
                .when()
                .post(apiEndpoint);
    }

    public void validateCreatedUser() {
        Assert.assertEquals(201, response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("User created!", response.jsonPath().getString("message"));
    }
}