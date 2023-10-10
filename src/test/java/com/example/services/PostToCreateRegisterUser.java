package com.example.services;

import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;


public class PostToCreateRegisterUser extends Globals {


   @Test
    public void postToCreateRegisterUser() {
        // API Base URL
        RestAssured.baseURI = "https://automationexercise.com";

        // JSON Request Body
        String requestBody = "{"
                + "\"name\":\"John Dorec\","
                + "\"email\":\"johndorec@example.com\","
                + "\"password\":\"securedpassword\","
                + "\"title\":\"Mr\","
                + "\"birth_date\":\"01\","
                + "\"birth_month\":\"01\","
                + "\"birth_year\":\"1990\","
                + "\"firstname\":\"John\","
                + "\"lastname\":\"Dorec\","
                + "\"company\":\"Example Company\","
                + "\"address1\":\"123 Main St\","
                + "\"address2\":\"Apartment 456\","
                + "\"country\":\"US\","
                + "\"zipcode\":\"12345\","
                + "\"state\":\"CA\","
                + "\"city\":\"San Francisco\","
                + "\"mobile_number\":\"1234567890\""
                + "}";


        String apiEndpoint = "/api/createAccount";

        // Perform API request and validate response
        response= RestAssured.given()
                .contentType(ContentType.MULTIPART)
                .multiPart("name", "Ahmet")
                .multiPart("email", "ahmetwd@dr.com")
                .multiPart("password", "Ahmet123")
                .multiPart("title", "Mr")
                .multiPart("birth_date", "10")
                .multiPart("birth_month", "12")
                .multiPart("birth_year", "1983")
                .multiPart("firstname", "Ahmet")
                .multiPart("lastname", "Kara")
                .multiPart("company", "Technox")
                .multiPart("address1", "Saint Antuan")
                .multiPart("address2", "CL")
                .multiPart("country", "Canada")
                .multiPart("zipcode", "25478")
                .multiPart("state", "Canada")
                .multiPart("city", "Toronto")
                .multiPart("mobile_number", "32452168")
                .when()
                .post(apiEndpoint);

       System.out.println("response = " + response);


   }
}