package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

public class PostToSearchProduct extends Globals {

    public void postToSearchProduct(){

        response=RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("search_product","jeans")
                .and()
                .when()
                .post("/api/searchProduct")
                .prettyPeek();

    }
    public void validateProductsSearched(){

        JsonPath jsonPath=response.jsonPath();
        Assert.assertEquals(200,response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("Searched products list",response.jsonPath().getString("responseJson"));
    }

}
