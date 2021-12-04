package com.mockmvc.repository;

import com.mockmvc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
