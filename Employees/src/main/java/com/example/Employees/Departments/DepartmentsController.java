package com.example.Employees.Departments;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentsController {


    private final DepartmentsService service;

    @Autowired
    public DepartmentsController(DepartmentsService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    //@PreAuthorize("hasAuthority('department:read')")
    @GetMapping("/getAllDepartments")
    public List<Department> GetDepartments(){
        return service.getDepartments();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    //@PreAuthorize("hasAuthority('department:write')")
    @PostMapping("/newDep")
    public void AddDepartment(@RequestBody Department Dept){
        service.AddDep(Dept);
    }


}
