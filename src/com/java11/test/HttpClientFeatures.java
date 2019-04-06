package com.java11.test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientFeatures {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpRequest request=HttpRequest.newBuilder().uri(URI.create("https://postman-echo.com/get")).GET().build();
		HttpResponse<String> response=HttpClient.newHttpClient().send(request, BodyHandlers.ofString());
		System.out.println(response.statusCode());
		System.out.println(response.body());
	}

}
