package com.example.Employees.Employees;

import org.springframework.data.domain.Page;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service=service;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    //@PreAuthorize("hasAuthority('employee:read')")
    @GetMapping("/getAllEmployees")
    public Page<Employee> GetAllEmployees(@RequestParam(defaultValue = "0") Integer pageNo,
                                       @RequestParam(defaultValue = "2") Integer pageSize,
                                       @RequestParam(defaultValue = "id") String sortBy){
         return service.getALLEmployees(pageNo,pageSize,sortBy);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    //@PreAuthorize("hasAuthority('employee:read')")
    @GetMapping("/Search/{searchingText}")
    public Page<Employee> GetSearchResult(@PathVariable("searchingText") String SearchingText,
                                          @RequestParam(defaultValue = "0") Integer pageNo,
                                          @RequestParam(defaultValue = "2") Integer pageSize,
                                          @RequestParam(defaultValue = "id") String sortBy){
        return service.GetSearchingResult(SearchingText,pageNo,pageSize,sortBy);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    //@PreAuthorize("hasAuthority('employee:read')")
    @GetMapping("/getEmployee/{EmpId}")
    public Employee GetEmployee(@PathVariable("EmpId") long id){
        return service.getEmployee(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    //@PreAuthorize("hasAuthority('employee:write')")
    @PostMapping("/Create")
    public void AddEmployee(@RequestBody Employee emp){
        service.AddEmployee(emp);
    }

   @CrossOrigin(origins = "http://localhost:4200")
   //@PreAuthorize("hasAuthority('employee:write')")
   @PostMapping("/Update")
    public void updateEmployee(@RequestBody Employee NewInfo){
       service.Update(NewInfo);
    }

}
