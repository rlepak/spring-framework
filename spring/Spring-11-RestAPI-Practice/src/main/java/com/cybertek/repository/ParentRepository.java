package com.cybertek.repository;

import com.cybertek.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}
