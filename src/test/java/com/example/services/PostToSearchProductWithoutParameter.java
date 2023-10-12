package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class PostToSearchProductWithoutParameter extends Globals {

    public void postToSearchProductWithoutParameter() {

        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .post("/api/searchProduct");
    }

    public void validateThatProductSearchedWithoutParameter() {
        Assert.assertEquals(400, response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("Bad request, search_product parameter is missing in POST request.", response.jsonPath().getString("message"));
    }
}
