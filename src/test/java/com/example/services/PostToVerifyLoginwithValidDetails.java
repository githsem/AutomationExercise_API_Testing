package com.example.services;

import com.example.utilities.ConfigurationReader;
import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class PostToVerifyLoginwithValidDetails extends Globals {

    public void postToVerifyLoginwithValidDetails() {
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.MULTIPART)
                .multiPart("email", ConfigurationReader.get("email"))
                .multiPart("password", ConfigurationReader.get("password"))
                .when()
                .post("/api/verifyLogin");
    }

    public void verifyUserLogin() {
        Assert.assertEquals(200, response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("User exists!", response.jsonPath().getString("message"));
    }
}



