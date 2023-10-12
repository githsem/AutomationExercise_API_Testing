package com.example.services;

import com.example.utilities.Globals;
import io.restassured.http.ContentType;
import org.junit.Assert;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class GetAllBrandsList extends Globals {

    public void getAllBrandsList() {
        response = given().accept(ContentType.JSON).contentType(ContentType.JSON).when().get("/api/brandsList");
    }

    public void validateThatAllBrands() {
        Assert.assertEquals(200, response.statusCode());
        List<Map> brands = response.jsonPath().getList("brands");
        Assert.assertEquals(34, brands.size());
    }
}
