package com.jse.module06.lab01;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * API client for making HTTP requests to a REST API.
 * Complete the methods below to implement GET, POST, PUT, and DELETE with proper headers and response handling.
 */
public class ApiClient {

    private final HttpClient httpClient;
    private final String baseUrl;

    public ApiClient(String baseUrl) {
        this.baseUrl = baseUrl.endsWith("/") ? baseUrl : baseUrl + "/";
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    /**
     * Send a GET request to the given path (e.g. "users/1").
     * Return the response body as a string, or throw if status is not 2xx.
     */
    public String get(String path) throws Exception {
        // TODO: Build GET request with Accept: application/json
        // TODO: Send request and check status code (200, 201, etc.)
        // TODO: Return body as string; on non-2xx throw or return error info
        throw new UnsupportedOperationException("Implement GET request");
    }

    /**
     * Send a POST request with a JSON body to the given path.
     * Return the response body as a string.
     */
    public String post(String path, String jsonBody) throws Exception {
        // TODO: Build POST request with Content-Type: application/json and body
        // TODO: Send and handle response (e.g. 201 Created)
        throw new UnsupportedOperationException("Implement POST request");
    }

    /**
     * Send a PUT request with a JSON body to the given path.
     * Return the response body as a string.
     */
    public String put(String path, String jsonBody) throws Exception {
        // TODO: Build PUT request with Content-Type: application/json and body
        // TODO: Send and handle response
        throw new UnsupportedOperationException("Implement PUT request");
    }

    /**
     * Send a DELETE request to the given path.
     * Return the response body (may be empty) or confirm success.
     */
    public int delete(String path) throws Exception {
        // TODO: Build DELETE request
        // TODO: Return status code (e.g. 200 or 204)
        throw new UnsupportedOperationException("Implement DELETE request");
    }
}
