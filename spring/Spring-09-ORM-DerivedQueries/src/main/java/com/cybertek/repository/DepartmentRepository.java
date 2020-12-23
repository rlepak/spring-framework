package com.cybertek.repository;

import com.cybertek.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

    //display all department in the Furniture Department
    List<Department> findByDepartment(String department);

    //display all department in the Health Division
    List<Department> findByDivision(String division);

    //display all department in the Health Division
    List<Department> findByDivisionIs(String division);

    //display all department in the Health Division
    List<Department> findByDivisionEquals(String division);

    //dispay all departments with division name ends with "ics"
    List<Department> findAllByDivisionEndingWith(String part);

    //Display top 3 departments with division name includes "Hea", without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);
}
