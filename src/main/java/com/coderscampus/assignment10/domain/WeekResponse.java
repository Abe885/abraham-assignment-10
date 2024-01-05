package com.coderscampus.assignment10.domain;

import java.util.List;

public class WeekResponse {
    private Week week;

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }
    @Override
    public String toString() {
        return "WeekResponse{" +
                "week=" + week +
                '}';
    }
}
