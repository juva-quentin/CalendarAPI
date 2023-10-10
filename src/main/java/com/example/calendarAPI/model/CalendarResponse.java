package com.example.calendarAPI.model;

import java.util.List;

/**
 * Model représentant la réponse de calendrier .
 */
public class CalendarResponse {
    private int year;
    private int month;
    private List<List<Integer>> calendar;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public List<List<Integer>> getCalendar() {
        return calendar;
    }

    public void setCalendar(List<List<Integer>> calendar) {
        this.calendar = calendar;
    }
}
