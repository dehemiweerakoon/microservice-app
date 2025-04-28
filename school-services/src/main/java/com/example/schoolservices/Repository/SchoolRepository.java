package com.example.schoolservices.Repository;

import com.example.schoolservices.Entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
}
