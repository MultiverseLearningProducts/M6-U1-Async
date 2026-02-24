package com.jse.module06.lab01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run this application to test your ApiClient against a public mock API (JSONPlaceholder).
 * Complete the methods in ApiClient first.
 */
@SpringBootApplication
public class Lab01ApisServicesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Lab01ApisServicesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ApiClient client = new ApiClient("https://jsonplaceholder.typicode.com");
        // Uncomment after implementing ApiClient:
        // System.out.println("GET /posts/1: " + client.get("posts/1"));
        // System.out.println("POST: " + client.post("posts", "{\"title\":\"Lab\",\"body\":\"Test\",\"userId\":1}"));
        // System.out.println("PUT: " + client.put("posts/1", "{\"id\":1,\"title\":\"Updated\",\"body\":\"Body\",\"userId\":1}"));
        // System.out.println("DELETE status: " + client.delete("posts/1"));
    }
}
