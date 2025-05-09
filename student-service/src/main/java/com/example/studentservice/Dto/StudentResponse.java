package com.example.studentservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
   private String id;
   private String name;

   public StudentResponse(String id, String name, int age, String gender, School school) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.school = school;
   }

   private int age;
   private  String gender;
   private School school;

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

   public School getSchool() {
      return school;
   }

   public void setSchool(School school) {
      this.school = school;
   }
}
