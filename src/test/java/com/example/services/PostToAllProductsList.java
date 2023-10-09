package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class PostToAllProductsList extends Globals {

    public void postToAllProductsList(){
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .post("/api/productsList");
    }

    public void validateThisPostRequestMethod(){
        Assert.assertEquals(405, response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("This request method is not supported.", response.jsonPath().getString("message"));
    }
}
