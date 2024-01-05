package com.coderscampus.assignment10.domain;

import java.util.List;

public class DayResponse extends MealPlanResponse {
    private List<Meal> meals;
    private Nutrients nutrients;

    public Nutrients getNutrients() {
        return nutrients;
    }


    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }
    @Override
    public String toString() {
        return "DayResponse{" +
                "meals=" + meals +
                ", nutrients=" + nutrients +
                '}';
    }

}
