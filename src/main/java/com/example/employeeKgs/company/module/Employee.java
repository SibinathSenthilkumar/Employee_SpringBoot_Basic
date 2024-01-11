package com.example.employeeKgs.company.module;

public class Employee {
    private String employeeeName;

    public String getEmployeeeName() {
        return employeeeName;
    }

    public void setEmployeeeName(String employeeeName) {
        this.employeeeName = employeeeName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeposition() {
        return employeeposition;
    }

    public void setEmployeeposition(String employeeposition) {
        this.employeeposition = employeeposition;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    private Integer employeeId;
    private String employeeposition;

    }


