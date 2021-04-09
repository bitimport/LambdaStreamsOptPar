package com.satya.example;

import com.satya.example.data.Student;
import com.satya.example.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        List<Student> students =  StudentDatabase.getStudents();

        Consumer<Student> name  = (a)-> System.out.print(a.getName()+'\t');
        Consumer<Student> hobbies = (a)-> System.out.println("Number of hobbies " + a.getHobbies().size());
        students.forEach(name.andThen(hobbies));


    }
}
