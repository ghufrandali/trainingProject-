package com.example.Employees.Departments;

import com.example.Employees.Employees.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Department {

    @Id
    private Long id;
    @Column(name="name")
    private String name;

    @JsonIgnoreProperties(value = {"department"},allowSetters = true)
    @OneToMany(mappedBy = "department",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Employee> employees;

    public Department() {
    }

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
