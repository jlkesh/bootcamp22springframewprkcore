package dev.jlkeesh.springframeworkcore.beans;

public class Person {
    private final String name;
    private final String age;
    private final String nick;

    public Person(String name, String age, String nick) {
        this.name = name;
        this.age = age;
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }
}
