package com.thetestingacademy.testcases;


import com.google.gson.Gson;
import com.thetestingacademy.models.User;
import org.testng.annotations.Test;

public class GsonExample {

    @Test
    public void testGson() {
        User user = new User("John Doe", "john.doe@example.com", "Software Engineer");

        Gson gson = new Gson();
        String jsonPayload = gson.toJson(user);

        System.out.println("Generated JSON: " + jsonPayload);
    }
}

