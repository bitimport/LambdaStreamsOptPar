package com.satya.example;

import com.satya.example.data.Student;
import com.satya.example.data.StudentDatabase;

import java.util.List;

public class LambdaExample2 {

    public static void main(String[] args) {

        List<Student> students =  StudentDatabase.getStudents();

        for (Student student : students) {
            System.out.print(student.getName()+'\t');
            System.out.println(student.getHobbies());
        }
    }
}
