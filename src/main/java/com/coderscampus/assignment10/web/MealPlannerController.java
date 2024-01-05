package com.coderscampus.assignment10.web;

import com.coderscampus.assignment10.domain.DayResponse;
import com.coderscampus.assignment10.domain.WeekResponse;
import com.coderscampus.assignment10.service.MealPlannerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mealplanner")
public class MealPlannerController {
    private final MealPlannerService mealPlannerService;

    public MealPlannerController(MealPlannerService mealPlannerService) {

        this.mealPlannerService = mealPlannerService;
    }


    @GetMapping("/day")
    public ResponseEntity<DayResponse> getDayMeals(String targetCalories, String diet, String exclusions) {
        return mealPlannerService.getDayMealPlan("day", targetCalories, diet, exclusions);
    }

    @GetMapping("/week")
    public ResponseEntity<WeekResponse> getWeekMeals( String targetCalories,  String diet,String exclusions) {
    return mealPlannerService.getWeeklyMealPlan("week", targetCalories, diet, exclusions);
    }
}

