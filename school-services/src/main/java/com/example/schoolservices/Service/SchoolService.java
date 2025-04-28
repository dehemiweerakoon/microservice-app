package com.example.schoolservices.Service;

import com.example.schoolservices.Entity.School;
import com.example.schoolservices.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchoolService {

    School addSchool(School school);
    List<School> fetchSchools();
    School fetchSchoolById(Integer id);
}
