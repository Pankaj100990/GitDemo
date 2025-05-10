package com.thetestingacademy;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class SchemaValidationTest {

    @Test
    public void validateJsonSchema() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .when()
                .get("/posts/1")
                .then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("com/thetestingacademy/schema/schema.json"));
        System.out.println("Git Response Test");
        System.out.println("Test Develop Git Response Test");
        
        System.out.println("Test Develop to master Git Response Test");



    }
}

