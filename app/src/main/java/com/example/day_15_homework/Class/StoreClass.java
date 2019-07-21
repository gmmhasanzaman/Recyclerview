package com.example.day_15_homework.Class;

import java.util.ArrayList;
import java.util.List;

public class StoreClass {

    private static ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<Student> getStudentList(){
        return students;
    }
    public static void addStudent(Student student){
        students.add(student);
    }
}
