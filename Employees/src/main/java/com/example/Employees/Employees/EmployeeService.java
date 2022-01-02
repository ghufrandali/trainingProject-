package com.example.Employees.Employees;

import com.example.Employees.Departments.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;
    private final DepartmentsRepository departmentsRepository;
    @Autowired
    public EmployeeService(EmployeeRepository repository,
                           DepartmentsRepository departmentsRepository
    ) {
        this.repository=repository;
        this.departmentsRepository=departmentsRepository;
    }

    public Page<Employee> getALLEmployees(Integer pageNo, Integer pageSize, String sortBy){
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        return repository.findAllEmployees(paging);
    }

    public void AddEmployee(Employee employee){
        repository.save(employee);
    }

    public Employee getEmployee(long id){
        return repository.findEmployeeById(id);
    }

    public Page<Employee> GetSearchingResult(String searchingText,Integer pageNo, Integer pageSize, String sortBy){
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        return repository.findByNameContainingIgnoreCase(searchingText,paging);
    }

    @Transactional
    public void Update(Employee newInfo) {
        if(repository.existsById(newInfo.getId())) {
            Employee Emp = repository.getById(newInfo.getId());
            Emp.setName(newInfo.getName());
            Emp.setSalary(newInfo.getSalary());
            Emp.setJob(newInfo.getJob());
            Emp.setFired(newInfo.isFired());
            Emp.setDob(newInfo.getDob());
            Emp.setDepartment(newInfo.getDepartment());
            Emp.setProjects(newInfo.getProjects());
            repository.save(Emp);
        }
    }

}
