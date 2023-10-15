package com.example.demo;

public enum JobTitle {
    SOFTWARE_ENGINEER("Software Engineer"),
    DATA_SCIENTIST("Data Scientist"),
    PROJECT_MANAGER("Project Manager"),
    HR_SPECIALIST("HR Specialist"),
    MARKETING_MANAGER("Marketing Manager"),
    SALES_REPRESENTATIVE("Sales Representative"),
    FINANCIAL_ANALYST("Financial Analyst"),
    ADMINISTRATIVE_ASSISTANT("Administrative Assistant"),
    CEO("Chief Executive Officer"),
    CTO("Chief Technology Officer");

    private final String displayName;

    JobTitle(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
