package com.example.leave_management;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;

public class LeaveService {
    private static final String BASE_URL = "http://localhost:8080/api/leaves";
    private final HttpClient client;

    public LeaveService() {
        client = HttpClient.newHttpClient();
    }

    public String createLeave(String leaveJson) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(leaveJson))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 201) {
            throw new RuntimeException("Failed to create leave: " + response.statusCode());
        }
        return response.body();
    }

    public String getAllLeaves() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new RuntimeException("Failed to get leaves: " + response.statusCode());
        }
        return response.body();
    }

    public String updateLeave(Long id, String leaveJson) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/" + id))
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(leaveJson))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new RuntimeException("Failed to update leave: " + response.statusCode());
        }
        return response.body();
    }

    public void deleteLeave(Long id) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/" + id))
                .DELETE()
                .build();
        HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());
        if (response.statusCode() != 204) {
            throw new RuntimeException("Failed to delete leave: " + response.statusCode());
        }
    }

    // Main method for testing can remain as is, but you might want to update it to use the new method signatures
}