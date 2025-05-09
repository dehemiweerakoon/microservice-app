package com.example.studentservice.Repository;

import com.example.studentservice.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends MongoRepository<Student, String> {
}
