package com.example.Employees.Project;


import com.example.Employees.Employees.Employee;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

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
    Long id;
    String name;

    @JsonIgnoreProperties(value = {"projects","department"},allowSetters = true)
    @ManyToMany(mappedBy = "projects",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<Employee> employees;

    public Project() {
    }

    public Project(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
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
