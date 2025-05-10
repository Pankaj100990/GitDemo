package com.thetestingacademy.apis;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import com.thetestingacademy.constants.APIConstants;

public class UserAPI {
    public static Response getPosts() {
        return given()
                .when()
                .get(APIConstants.BASE_URL + APIConstants.GET_POSTS);
    }
}

