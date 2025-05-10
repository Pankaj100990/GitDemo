package com.thetestingacademy.testcases;


import com.thetestingacademy.apis.UserAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {

    @Test
    public void verifyGetPostsAPI() {
        Response response = UserAPI.getPosts();
        Assert.assertEquals(response.getStatusCode(), 200, "Incorrect Status Code");
    }
}

