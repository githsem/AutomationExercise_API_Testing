package com.example.services;

import com.example.utilities.ConfigurationReader;
import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class PostToVerifyLoginWithoutEmail extends Globals {

    public void postToVerifyLoginWithoutEmail() {
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.MULTIPART)
                .multiPart("password", ConfigurationReader.get("password"))
                .when()
                .post("/api/verifyLogin");
    }

    public void verifyLoginWithInvalidDetails() {
        Assert.assertEquals(400, response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("Bad request, email or password parameter is missing in POST request.", response.jsonPath().getString("message"));
    }
}









