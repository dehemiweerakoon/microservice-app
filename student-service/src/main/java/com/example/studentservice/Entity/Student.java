package com.example.studentservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String name;
    private  int age;
    private String gender;

    public Student() {
        //this.id = id;
    }

    public Student(String id, String name, int age, String gender, Integer schoolId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.schoolId = schoolId;
    }

    private Integer schoolId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }
}
