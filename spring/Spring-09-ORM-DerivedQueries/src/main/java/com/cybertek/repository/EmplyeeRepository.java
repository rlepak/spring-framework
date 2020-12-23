package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmplyeeRepository extends JpaRepository<Employee, Integer> {


    List<Employee> findByEmail(String email);

    //display all employees with first name and last name, also show all emplyees with a email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //display all employees that first name is not
    List<Employee> findAllByFirstNameIsNot(String firstName);

    //Display all employees where last name starts with ""
    List<Employee> findByLastNameStartingWith(String pattern);

    // display all employees with salary higher than ""
    List<Employee> findBySalaryGreaterThan(Integer salary);

    // display all employees with salary higher than ""
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    //Display all employees that has been hired between
    List<Employee> findAllByHireDateBetween(LocalDate startDate, LocalDate endDate);

    // Display all employees where salaries greater and qual to '' in order
    List<Employee> findAllBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //display top unique 3 employees that is making less than ''
    List<Employee> findDistinctTop3BySalaryLessThanEqual(Integer salary);

    //display all employees that do not have email address
    List<Employee> findByEmailIsNull();
}
