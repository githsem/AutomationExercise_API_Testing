package com.example.services;

import com.example.utilities.ConfigurationReader;
import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class DeleteUserAccount extends Globals {

    public void DeleteUserAccountApi() {

        // Perform API request and validate response
        response = RestAssured.given()
                .contentType(ContentType.MULTIPART)
                .multiPart("email", ConfigurationReader.get("email"))
                .multiPart("password", ConfigurationReader.get("password"))
                .when()
                .delete("/api/deleteAccount");

        //clear configurationReader
        ConfigurationReader.set("userName","");
        ConfigurationReader.set("email","");
        ConfigurationReader.set("password","");
    }

    public void verifyAccountUser() {
        Assert.assertEquals(200, response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("Account deleted!", response.jsonPath().getString("message"));
    }
}

