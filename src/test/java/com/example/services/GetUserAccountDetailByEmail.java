package com.example.services;

import com.example.utilities.ConfigurationReader;
import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class GetUserAccountDetailByEmail extends Globals {

    public void GetUserAccountDetailByEmail() {
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("email", ConfigurationReader.get("email"))
                .when()
                .get("/api/getUserDetailByEmail");
    }

    public void validateUserDetail() {

        Assert.assertEquals(200, response.jsonPath().getInt("responseCode"));

        //validate username
        Assert.assertEquals(ConfigurationReader.get("userName"), response.jsonPath().getString("user.name"));
    }
}
