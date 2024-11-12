package org.design_patterns.structure.proxy;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FetchingDummyApiService implements FetchingDummyApi{

    public static final String PRODUCTS_ENDPOINT="https://dummyjson.com/products";
    public static final String RECIPES_ENDPOINT="https://dummyjson.com/recipes";

    @Override
    public String getAllProducts() {
        return requestAPI(PRODUCTS_ENDPOINT);
    }

    @Override
    public String getAllRecipes() {
        return requestAPI(RECIPES_ENDPOINT);
    }

    private String requestAPI(String apiUrl){
        try{
            System.out.println(apiUrl.equalsIgnoreCase(PRODUCTS_ENDPOINT)?"Fetching Products.......":"Fetching Recopies.......");
            Thread.sleep(2000);
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(new URI(apiUrl))
                    .GET()
                    .build();
            HttpClient httpClient = HttpClient.newBuilder().build();
            return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString()).body();
        } catch (InterruptedException | IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
