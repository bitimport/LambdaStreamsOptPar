package com.satya.example.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private String name;
    private Integer grade;
    private List<String> hobbies = new ArrayList<>();

    public Student(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }
    public void addHobbies(String ... a){
        hobbies.addAll(Arrays.asList(a));
    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
