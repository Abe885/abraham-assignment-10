package com.coderscampus.assignment10.domain;

public class Nutrients {
    private double calories;
    private double protein;
    private double fat;
    private double getProtein;

    public double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Nutrients{" +
                "calories=" + calories +
                ", protein=" + protein +
                ", fat=" + fat +
                ", getProtein=" + getProtein +
                '}';
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getGetProtein() {
        return getProtein;
    }

    public void setGetProtein(double getProtein) {
        this.getProtein = getProtein;
    }
}

