package com.satya.example.data;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

    private static List<Student> students =  new ArrayList<>();

    static {
        Student st1 = new Student("Satya",12);
        st1.addHobbies("Cricket", "Judo","Programming","Tennis","Hiking");
        students.add(st1);

        st1 = new Student("Ajay",8);
        st1.addHobbies("Movie", "Cards","Netflix");
        students.add(st1);
        st1 = new Student("Ron",6);
        st1.addHobbies("Computer", "Shooting","Karate");
        students.add(st1);
        st1 = new Student("Eddie",12);
        st1.addHobbies("Software", "Programming","Snooker","Polo");
        students.add(st1);
        st1 = new Student("Joe",11);
        st1.addHobbies("Cycling", "Judo","Swimming","Tennis","Hiking");
        students.add(st1);
        st1 = new Student("Orville",12);
        st1.addHobbies("Traveling", "Judo","Programming","Footbal","Sleeping");
        students.add(st1);
        st1 = new Student("Cleaver",4);
        st1.addHobbies("Traveling", "Judo","Gambling","Tennis","Politics");
        students.add(st1);
        st1 = new Student("Misel",12);
        st1.addHobbies("Tennis","Hiking");
        students.add(st1);
        st1 = new Student("Gerord",6);
        students.add(st1);
        st1 = new Student("Steven",5);
        st1.addHobbies("Raoming");
        students.add(st1);
    }

    public static List<Student> getStudents() {
        return students;
    }
}
