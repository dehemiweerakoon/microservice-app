package com.example.studentservice.Controller;

import com.example.studentservice.Dto.StudentResponse;
import com.example.studentservice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/student")
public class StudentController {
   @Autowired
   private StudentService studentService;

   @GetMapping("/{id}")
    public ResponseEntity<?> fetchStudent(@PathVariable String id) {
       return  studentService.fetchStudentById(id);
   }
   @GetMapping
    public ResponseEntity<?> fetchStudents() {
       return studentService.fetchStudents();
   }
   @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody StudentResponse student) {
       return studentService.createStudent(student);
   }
}
