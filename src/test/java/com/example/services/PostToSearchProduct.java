package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostToSearchProduct extends Globals {

    public void postToSearchProduct(){

        response=RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.MULTIPART)
                .multiPart("search_product","jean")
                .and()
                .when()
                .post("/api/searchProduct")
                .prettyPeek();

    }
    public void validateProductsSearched(){

        Assert.assertEquals(200,response.jsonPath().getInt("responseCode"));
        List<Map> jeanProductsList=response.jsonPath().getList("products");
        Assert.assertEquals(3,jeanProductsList.size());


    }

}
