package com.example.Employees.Employees;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

      @Query(value = "select e from Employee e " +
              "left join fetch e.department dept " +
              "where upper(e.name) " +
              "like upper(concat('%', ?1, '%'))",countQuery = "select count(e) from Employee e where upper(e.name) " +
              "like upper(concat('%', ?1, '%'))")
      Page<Employee> findByNameContainingIgnoreCase(String searchingText,Pageable paging);

      @Query(value="select e from Employee e " +
              "left join fetch e.department dept " +
              "order by e.id",countQuery = "select count(*) from Employee")
      Page<Employee> findAllEmployees(Pageable paging);

      @Query("select e from Employee e " +
              "left join fetch e.department dept " +
              "where e.id=?1")
      Employee findEmployeeById(Long id);



}
