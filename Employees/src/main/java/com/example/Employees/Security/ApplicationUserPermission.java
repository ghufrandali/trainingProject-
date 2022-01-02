package com.example.Employees.Security;

public enum ApplicationUserPermission {
    EMPLOYEE_READ("employee:read"),
    EMPLOYEE_WRITE("employee:write"),
    DEPARTMENT_READ("department:read"),
    DEPARTMENT_WRITE("department:write"),
    PROJECT_READ("project:read"),
    PROJECT_WRITE("project:write"),
    USER_READ("user:read"),
    USER_WRITE("user:write");


    private String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
