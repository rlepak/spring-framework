package com.cybertek.repositpry;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.email = 'dtrail8@tamu.edu'")
    Employee getEmployeeDetail();

    @Query("select e.salary from Employee e")
    Integer getEmployeeSalary();

    // single bind paramentr
    @Query("select e from Employee e where e.email = ?1")
    Optional<Employee> getEmployeeByEmail(String email);

    //multiple bind parameter
    @Query("select e from Employee e where e.email=?1 and e.salary=?2")
    Employee etEmployeeByEmailAndSalary(String email, int salary);

    //single named parameter
    @Query("select e from Employee e where e.salary=:salary")
    Employee getEmployeeBySalary(@Param("salary") int salary);

    //multiple name parameter
    @Query("select e from Employee e where e.firstName=:name or e.salary=:salary")
    List<Employee> getEmployeeByFirstNameOrSalary(@Param("name") String name, @Param("salary") int salary);

    //not equal
    @Query("select e from Employee e where e.salary <> ?1")
    List<Employee> getEmployeeBySalaryNotEqual();

    //Like / Contains / StartWith / End With
    @Query("select e from Employee e where  e.firstName Like ?1")
    List<Employee> getEmployeeByFirstNameLike(String pattern);

    //less than
    @Query("select e from Employee e where e.salary < ?1")
    List<Employee> getEmployeeBySalaryLessThan(int salary);

    // greater than
    @Query("select e from Employee e where e.salary > ?1")
    List<Employee> getEmployeeBySalaryGreaterThan(int salary);

    //between
    @Query("select e from Employee e where e.salary between  ?1 and ?2")
    List<Employee> getEmployeeBySalaryBetween(int salary1, int salary2);

    //before
    @Query("select  e from Employee e where e.hireDate > ?1")
    List<Employee> getEmployeeByHireDateBefore(LocalDate date);

    //null
    @Query("select  e from Employee e where e.email is null")
    List<Employee> getEmployeeByEmailIsNull();

    // not null
    @Query("select  e from Employee e where e.email is not null")
    List<Employee> getEmployeeByEmailNotNull();
}
