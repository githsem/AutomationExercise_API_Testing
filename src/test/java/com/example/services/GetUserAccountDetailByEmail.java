package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class GetUserAccountDetailByEmail extends Globals {

    public void GetUserAccountDetailByEmail() {
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("email", "hans@hans.com")
                .when()
                .get("/api/getUserDetailByEmail");
    }

    public void validateUserDetail() {

        Assert.assertEquals(200, response.jsonPath().getInt("responseCode"));

        //validate username
        Assert.assertEquals("hans", response.jsonPath().getString("user.name"));

        //validate city
        Assert.assertEquals("Berlin", response.jsonPath().getString("user.city"));
    }
}
