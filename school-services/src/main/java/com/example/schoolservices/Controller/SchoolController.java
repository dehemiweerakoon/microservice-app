package com.example.schoolservices.Controller;

import com.example.schoolservices.Entity.School;
import com.example.schoolservices.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping
    public ResponseEntity<School> addSchool(@RequestBody School school) {
        return new ResponseEntity<>(schoolService.addSchool(school), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<School>> getSchools() {
        return new ResponseEntity<>(schoolService.fetchSchools(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<School> getSchoolById(@PathVariable Integer id) {
        return new ResponseEntity<>(schoolService.fetchSchoolById(id), HttpStatus.OK);
    }
}
