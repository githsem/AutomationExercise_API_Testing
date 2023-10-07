package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class GetAllProductsList extends Globals {
    public void getAllProductsList(){
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .get("/api/productsList");
    }

    public void validateThatAllProductsAreListed(){
        Assert.assertEquals(200, response.statusCode());

        List<Map> products = response.jsonPath().getList("products");
        Assert.assertEquals(34, products.size());
    }
}
