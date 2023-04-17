package com.example.collegeapp;

public class CollegeApp {
    private String currentBuilding;

    public void clickITBuildingButton() {
        currentBuilding = "IT Building";
    }

    public void clickBusinessBuildingButton() {
        currentBuilding = "Business Building";
    }

    public void clickMainBuildingButton() {
        currentBuilding = "Main Building";
    }

    public boolean isInITBuilding() {
        return currentBuilding.equals("IT Building");
    }

    public boolean isInBusinessBuilding() {
        return currentBuilding.equals("Business Building");
    }

    public boolean isInMainBuilding() {
        return currentBuilding.equals("Main Building");
    }
}