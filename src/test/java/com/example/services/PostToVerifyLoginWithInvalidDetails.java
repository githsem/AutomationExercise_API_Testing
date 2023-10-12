package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class PostToVerifyLoginWithInvalidDetails extends Globals {

    public void postToVerifyLoginWithInvalidDetails() {
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.MULTIPART)
                .multiPart("email", "b@aa.com")
                .and()
                .multiPart("password", "1234")
                .when()
                .post("/api/verifyLogin");
    }

    public void validateLoginWithInvalidDetails() {
        Assert.assertEquals(404, response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("User not found!", response.jsonPath().getString("message"));
    }
}
