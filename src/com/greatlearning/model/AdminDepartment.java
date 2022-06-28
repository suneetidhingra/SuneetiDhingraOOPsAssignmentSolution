package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "Admin Deparment";
    }

    @Override
    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}