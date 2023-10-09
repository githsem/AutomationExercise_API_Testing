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
                .contentType(ContentType.JSON)
                .body("{\"search_product\": \"top\"}")
                .and()
                .when()
                .post("/api/searchProduct")
                .prettyPeek();

    }
    public void validateProductsSearched(){

        Assert.assertEquals(200,response.statusCode());

       // Map<String,List<String>> jeanList=new HashMap<>();
       // jeanList= (Map<String, List<String>>) response.jsonPath().getList("products.name"));
        Assert.assertEquals("Searched products list",response.jsonPath().getString("message"));


      /*  int statusCode = response.getStatusCode();
        System.out.println("Durum Kodu: " + statusCode);

        // Yanıtı JSON formatında alın
        String responseBody = response.getBody().asString();
        System.out.println("Yanıt JSON: " + responseBody);

       */


    }

}
