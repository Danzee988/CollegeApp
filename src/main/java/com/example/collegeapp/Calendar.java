package com.example.collegeapp;

public class Calendar {
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private int currentMonth = 0;

    public String getCurrentMonth() {
        return months[currentMonth];
    }

    public void scrollMonthForward() {
        currentMonth++;
        if (currentMonth >= 12) {
            currentMonth = 0;
        }
    }

    public void scrollMonthBackward() {
        currentMonth--;
        if (currentMonth < 0) {
            currentMonth = 11;
        }
    }
}