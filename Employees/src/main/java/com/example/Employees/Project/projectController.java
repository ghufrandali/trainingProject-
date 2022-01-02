package com.example.Employees.Project;

//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class projectController {

    private final projectService service;

    public projectController(projectService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:4200")
   // @PreAuthorize("hasAuthority('project:read')")
    @GetMapping("/getAllProjects")
    public List<Project> getAllProjects(){
        return service.getAllProjects();
    }
}
