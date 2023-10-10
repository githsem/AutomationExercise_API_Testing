package com.example.services;
import com.example.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.testng.annotations.Test;
public class DeleteUserAccount extends Globals {



        public void DeleteUserAccountApi() {


            // Request Parameters
            String email = "ahmetwd@dr.com";
            String password = "Ahmet123";

            // API Endpoint
            String apiEndpoint = "/api/deleteAccount";

            // Perform API request and validate response
            response= RestAssured.given()
                    .contentType(ContentType.MULTIPART)
                    .multiPart("email", email)
                    .multiPart("password", password)
                    .when()
                    .delete(apiEndpoint);

        }

        public void verifyAccountUser(){
            Assert.assertEquals(200, response.jsonPath().getInt("responseCode"));
            Assert.assertEquals("Account deleted!", response.jsonPath().getString("message"));
        }
    }

