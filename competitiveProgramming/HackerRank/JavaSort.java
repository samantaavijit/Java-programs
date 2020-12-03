package com.avijitsamanta.competitiveProgramming.HackerRank;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private  double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(33,"Rumpa" ,3.68));
        studentList.add(new Student(85, "Ashis" ,3.85));
        studentList.add(new Student(56, "Samiha", 3.75));
        studentList.add(new Student(19 ,"Samara", 3.75));
        studentList.add(new Student(22 ,"Fahim", 3.76));

        studentList.sort(Comparator.comparing(Student::getCgpa)
                .reversed()
                .thenComparing(Student::getFname)
        );


        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
