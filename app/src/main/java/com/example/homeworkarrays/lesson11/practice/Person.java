package com.example.homeworkarrays.lesson11.practice;

public class Person implements Comparable<Person>{
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
