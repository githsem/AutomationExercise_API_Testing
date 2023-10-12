package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class DeleteToVerifyLogin extends Globals {

    public void deleteToVerifyLogin() {
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .delete("/api/verifyLogin");
    }

    public void validateThatDeleteToVerifyLogin() {
        Assert.assertEquals(405, response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("This request method is not supported.", response.jsonPath().getString("message"));
    }
}
