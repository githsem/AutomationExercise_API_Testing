package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.codehaus.groovy.control.io.ReaderSource;
import org.junit.Assert;

public class PostToVerifyLoginWithInvalidDetails extends Globals {


    public void postToVerifyLoginWithInvalidDetails(){
        response= RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("email","b@aa.com")
                .and()
                .queryParam("password","1234")
                .when()
                .post("/api/verifyLogin");

    }
    public void validateLoginWithInvalidDetails(){
        Assert.assertEquals(400,response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("Bad request, email or password parameter is missing in POST request.",response.jsonPath().getString("message"));

    }
}
