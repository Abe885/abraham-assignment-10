package com.coderscampus.assignment10.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MealPlanResponse {


    @JsonProperty("meals")
    private List<Meal> meals;
    @JsonProperty("nutrients")
    private Nutrients nutrients;

}
