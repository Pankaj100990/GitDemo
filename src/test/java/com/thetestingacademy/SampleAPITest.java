package com.thetestingacademy;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class SampleAPITest {

    @Test
    @Description("Verify GET API Response Status Code")
    public void testGetAPI() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        Response response = given()
                .when()
                .get("/posts/1")
                .then()
                .extract()
                .response();

        logResponse(response);
        Assert.assertEquals(response.getStatusCode(), 200, "Status Code is incorrect");
    }

    @Step("Logging API Response")
    public void logResponse(Response response) {
        System.out.println(response.getBody().asString());
        System.out.println("Git Response1");
        System.out.println("Git Response2");


    }
}

