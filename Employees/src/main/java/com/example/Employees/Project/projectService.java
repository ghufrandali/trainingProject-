package com.example.Employees.Project;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class projectService {

    private final projectRepository repository;

    public projectService(projectRepository repository) {
        this.repository = repository;
    }

    public List<Project> getAllProjects() {
        return repository.findAll();
    }
}
