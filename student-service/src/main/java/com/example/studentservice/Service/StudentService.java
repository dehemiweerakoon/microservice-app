package com.example.studentservice.Service;

import com.example.studentservice.Dto.School;
import com.example.studentservice.Dto.StudentResponse;
import com.example.studentservice.Entity.Student;
import com.example.studentservice.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<?> createStudent(StudentResponse student) {
        try{
            Student student1 = new Student(student.getId(),student.getName(),student.getAge(),student.getGender(),student.getSchool().getId());
            return new ResponseEntity<>(studentRepository.save(student1), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    public ResponseEntity<?> fetchStudentById(String id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            Student student1 = student.get();
            System.out.println(student1.getSchoolId());
            School school =  restTemplate.getForObject("http://localhost:8082/school/"+student1.getSchoolId(),School.class);
            StudentResponse studentResponse = new StudentResponse(
                    student.get().getId(),
                    student.get().getName(),
                    student.get().getAge(),
                    student.get().getGender(),
                    school
            );
            return new ResponseEntity<>(studentResponse, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No Student Found",HttpStatus.NOT_FOUND);
        }
    }
    public ResponseEntity<?> fetchStudents() {
        List<Student> students = studentRepository.findAll();
        if(!students.isEmpty()){
            return  new ResponseEntity<List<Student>>(students, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No Student Found",HttpStatus.NOT_FOUND);
        }
    }
}
