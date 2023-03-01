package dev.jlkeesh.springframeworkcore.beans;

import java.util.*;

public class Person {
    private String fullName;
    private int age;
    private Set<String> cognomen = new HashSet<>();
    private Map<String,String> cognomenWithOrder = new HashMap<>();

    public Person(String fullName, int age, Set<String> cognomen, Map<String, String> cognomenWithOrder) {
        this.fullName = fullName;
        this.age = age;
        this.cognomen = cognomen;
        this.cognomenWithOrder = cognomenWithOrder;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", cognomen=" + cognomen +
                ", cognomenWithOrder=" + cognomenWithOrder +
                '}';
    }
}
