//package com.example.Employees.Employees;
//
//import com.example.Employees.Departments.Department;
//import com.example.Employees.Departments.DepartmentsRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.Month;
//
//@Configuration
//public class EmployeeConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner (EmployeeRepository repository , DepartmentsRepository DeptRepository){
//        return args -> {
//            Department BB = new Department(2L,"BB");
//            Department AA = new Department(1L,"AA");
//            DeptRepository.save(BB);
//            DeptRepository.save(AA);
//        };
//    }
//}
