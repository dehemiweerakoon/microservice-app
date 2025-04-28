package com.example.schoolservices.Service;

import com.example.schoolservices.Entity.School;
import com.example.schoolservices.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // added the service implementation ...
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public School addSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public List<School> fetchSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public School fetchSchoolById(Integer id) {
        return schoolRepository.findById(id).orElse(null);
    }
}
