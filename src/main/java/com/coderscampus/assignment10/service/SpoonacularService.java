package com.coderscampus.assignment10.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class SpoonacularService {

    private final RestTemplate restTemplate;
    @Value("${SPOONACULAR_API_KEY}")
    private final String apiKey;


    public SpoonacularService(RestTemplate restTemplate, @Value("${SPOONACULAR_API_KEY}") String apiKey) {
        this.restTemplate = restTemplate;
        this.apiKey = apiKey;
    }

    public <T> ResponseEntity<T> retrieveMealPlan(String timeFrame, String targetCalories, String diet, String exclusions, Class<T> responseClass) {
        UriComponentsBuilder componentsBuilder = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", timeFrame)
                .queryParam("apiKey", apiKey);

        if (StringUtils.hasText(targetCalories)) {
            componentsBuilder = componentsBuilder.queryParam("targetCalories", Integer.parseInt(targetCalories));
        }
        if (StringUtils.hasText(diet)) {
            componentsBuilder = componentsBuilder.queryParam("diet", diet);
        }
        if (StringUtils.hasText(exclusions)) {
            componentsBuilder = componentsBuilder.queryParam("exclude", exclusions);
        }

        URI uri = componentsBuilder.build().toUri();
        return restTemplate.getForEntity(uri, responseClass);
    }
}

