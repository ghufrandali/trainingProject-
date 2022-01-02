package com.example.Employees.Employees;


import com.example.Employees.Departments.Department;
import com.example.Employees.Project.Project;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.util.Pair;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table
public class Employee {

    @Id
    @SequenceGenerator(
            name="sequence",
            sequenceName ="sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence"
    )
    private Long id;
    private String name;
    private Long salary;
    private String job;
    private boolean isFired;
    @Column(name="dob")
    private LocalDateTime dob;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="department")
    private Department department;


    @ManyToMany
    @JoinTable(
            name = "employee_project",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    List<Project> projects;
    public Employee() {
    }

    public Employee(String name, Long salary, String job, boolean isFired, LocalDateTime dob) {
        this.name = name;
        this.salary = salary;
        this.job = job;
        this.isFired = isFired;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isFired() {
        return isFired;
    }

    public void setFired(boolean fired) {
        isFired = fired;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
