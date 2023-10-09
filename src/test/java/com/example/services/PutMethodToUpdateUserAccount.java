package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class PutMethodToUpdateUserAccount extends Globals {
    public void updateAccount(){
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.MULTIPART)
                .multiPart("name", "hans")
                .multiPart("email", "hans@hans.com")
                .multiPart("password", "Test1234")
                .multiPart("city", "Berlin")
                .when()
                .put("/api/updateAccount");
    }

    public void validateUSerUpdated(){
        Assert.assertEquals(200, response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("User updated!", response.jsonPath().getString("message"));
    }
}
