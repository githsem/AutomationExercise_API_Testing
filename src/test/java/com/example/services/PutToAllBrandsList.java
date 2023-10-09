package com.example.services;

import com.example.utilities.Globals;
import io.restassured.http.ContentType;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class PutToAllBrandsList extends Globals {

    public void putToAllBrandsList(){
        response= given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .put("/api/brandsList");
    }

    public void validateThatPostRequestMethod(){
        String expectedMessage="This request method is not supported.";
        Assert.assertEquals(405, response.jsonPath().getInt("responseCode"));
        Assert.assertEquals(expectedMessage, response.jsonPath().getString("message"));
    }


}
