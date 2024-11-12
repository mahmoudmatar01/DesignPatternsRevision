package org.design_patterns.structure.proxy;

import java.util.HashMap;
import java.util.Map;

import static org.design_patterns.structure.proxy.FetchingDummyApiService.PRODUCTS_ENDPOINT;
import static org.design_patterns.structure.proxy.FetchingDummyApiService.RECIPES_ENDPOINT;

public class CachingProxy implements FetchingDummyApi{

    private final FetchingDummyApi fetchingDummyApi;
    private final Map<String,String> cache;

    public CachingProxy() {
        cache = new HashMap<>();
        this.fetchingDummyApi = new FetchingDummyApiService();
    }


    @Override
    public String getAllProducts() {
        if(cache.containsKey(PRODUCTS_ENDPOINT))
        {
            System.out.println("Fetching data from cache");
            return cache.get(PRODUCTS_ENDPOINT);
        }

        String productResponse = fetchingDummyApi.getAllProducts();
        cache.put(PRODUCTS_ENDPOINT,productResponse);
        return productResponse;
    }

    @Override
    public String getAllRecipes() {
        if(cache.containsKey(RECIPES_ENDPOINT)){
            System.out.println("Fetching data from cache");
            return cache.get(RECIPES_ENDPOINT);
        }
        String recipesResponse = fetchingDummyApi.getAllRecipes();
        cache.put(RECIPES_ENDPOINT,recipesResponse);
        return recipesResponse;
    }
}
