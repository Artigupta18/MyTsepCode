package com.java.testds;

import java.com.testds.Student;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mycomp implements Comparator<Student>{

	@Override
	public int compare(Student o1,Student o2) {
		int x=o1.name.compareTo(o2.name);
		return x;
	}
}
public class tester {
   public static void main(String[] args) {
	   Studentservice service = new Studentservice();
	   List<Student> List=service.displayStu();
	   System.out.println(List);
	   Collections.sort(List,new Mycomp());
	   System.out.println(List);
	   
   }
}
