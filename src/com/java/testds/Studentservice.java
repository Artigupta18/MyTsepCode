package com.java.testds;

import java.com.testds.Student;
import java.util.ArrayList;
import java.util.List;

public class Studentservice {
  
    public List<Student> displayStu(){
    List<Student> List=new ArrayList<>();
    List.add(new Student(1,"Test",0)); 
    List.add(new Student(2,"Rest",0));
    List.add(new Student(3,"Vest",0));
    List.add(new Student(4,"Nest",0));
    return List;
    }
}
