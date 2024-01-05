package com.coderscampus.assignment10.service;

import com.coderscampus.assignment10.domain.DayResponse;
import com.coderscampus.assignment10.domain.WeekResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MealPlannerService {
    private final SpoonacularService spoonacularService;

    @Autowired
    public MealPlannerService(SpoonacularService spoonacularService) {
        this.spoonacularService = spoonacularService;
    }

    public ResponseEntity<DayResponse> getDayMealPlan(String timeFrame, String targetCalories, String diet, String exclusions) {
        return spoonacularService.retrieveMealPlan(timeFrame, targetCalories, diet, exclusions, DayResponse.class);
    }
    public ResponseEntity<WeekResponse> getWeeklyMealPlan(String timeFrame, String targetCalories, String diet, String exclusions) {
        return spoonacularService.retrieveMealPlan(timeFrame, targetCalories, diet, exclusions, WeekResponse.class);
    }

}
