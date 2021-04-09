package com.satya.example;

import com.satya.example.data.Student;
import com.satya.example.data.StudentDatabase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        List<Student> students =  StudentDatabase.getStudents();

        BiConsumer<Student,List<String>> details  = (a,b)-> System.out.print(a.getName()+" has " + b.size()+" hobbies");
        BiConsumer<Student, List<String>>  numbers = (a,b) -> {
            Collections.sort(b);
            System.out.println("and they are :" + b);
        };

        details.andThen(numbers).accept(students.get(0),students.get(0).getHobbies());

        Consumer <Student> process = a -> details.andThen(numbers).accept(a,a.getHobbies());

        students.forEach(process);

    }
}
