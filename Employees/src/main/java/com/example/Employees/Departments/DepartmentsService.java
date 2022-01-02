package com.example.Employees.Departments;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentsService {


    private  final DepartmentsRepository repository;

    public DepartmentsService(DepartmentsRepository repository) {
        this.repository=repository;
    }

    public List<Department> getDepartments() {
        return repository.findAll();
    }


    public void AddDep(Department dept) {
       repository.save(dept);
    }
}
